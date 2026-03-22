package com.example.gerenciamento_fornecedores.controllers;

import com.example.gerenciamento_fornecedores.models.FornecedorModel;
import com.example.gerenciamento_fornecedores.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<FornecedorModel> criar(@RequestBody FornecedorModel fornecedor) {
        FornecedorModel novo = fornecedorService.salvar(fornecedor);
        URI uri = URI.create("/fornecedores/" + novo.getId());
        return ResponseEntity.created(uri).body(novo);
    }

    @GetMapping
    public ResponseEntity<List<FornecedorModel>> listar() {
        return ResponseEntity.ok(fornecedorService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FornecedorModel> buscar(@PathVariable Long id) {
        FornecedorModel fornecedor = fornecedorService.buscarPorId(id);

        if (fornecedor == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(fornecedor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FornecedorModel> atualizar(@PathVariable Long id, @RequestBody FornecedorModel fornecedor) {
        FornecedorModel atualizado = fornecedorService.atualizar(id, fornecedor);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        fornecedorService.deletar(id);
        return ResponseEntity.noContent().build();
    }


}