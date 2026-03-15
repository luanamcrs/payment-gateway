package com.dev.luana.payment_gateway.controller;

import com.dev.luana.payment_gateway.model.Transaction;
import com.dev.luana.payment_gateway.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pagamentos")
@CrossOrigin(origins = "*")
public class TransactionController {
    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction criarPagamento(@RequestBody Transaction transacao, @RequestParam String senha) {
        return service.processar(transacao, senha);
    }
}