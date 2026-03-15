package com.dev.luana.payment_gateway.service;

import com.dev.luana.payment_gateway.model.Transaction;
import com.dev.luana.payment_gateway.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    public Transaction processar(Transaction transacao, String senha) {
        String bandeira = "DESCONHECIDA";

        // Identificação da bandeira baseada no primeiro dígito
        if (transacao.getCardNumber().startsWith("4")) {
            bandeira = "VISA";
        } else if (transacao.getCardNumber().startsWith("5")) {
            bandeira = "MASTERCARD";
        }

        // 1. Validação de Senha
        if (!"1234".equals(senha)) {
            transacao.setStatus("NEGADA: SENHA INCORRETA");
        }
        // 2. Validação Específica de Débito
        else if ("DEBITO".equalsIgnoreCase(transacao.getPaymentType())
                && transacao.getAmount().compareTo(new BigDecimal("500")) > 0) {
            transacao.setStatus("NEGADA: LIMITE DÉBITO EXCEDIDO (MAX 500)");
        }
        // 3. Validação Geral de Saldo
        else if (transacao.getAmount().compareTo(new BigDecimal("1000")) > 0) {
            transacao.setStatus("NEGADA: SALDO INSUFICIENTE (CREDITO)");
        }
        // 4. Validação de Bandeira e Aprovação
        else if (bandeira.equals("VISA") || bandeira.equals("MASTERCARD")) {
            transacao.setStatus("APROVADA - " + bandeira);
        } else {
            transacao.setStatus("NEGADA: BANDEIRA NÃO SUPORTADA");
        }

        // Mascaramento de segurança
        String original = transacao.getCardNumber();
        transacao.setCardNumber("**** **** **** " + original.substring(original.length() - 4));

        return repository.save(transacao);
    }
}