package com.derick.contato_api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    @PostMapping
    public String criar() {
        return "Contato criado com sucesso!";
    }

    @GetMapping
    public String listar() {
        return "Lista de contatos!";
    }

    @PutMapping
    public String atualizar() {
        return "Contato atualizado com sucesso!";
    }

    @DeleteMapping
    public String deletar() {
        return "Contato deletado com sucesso!";
    }
}
