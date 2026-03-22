package com.example.gerenciamento_fornecedores.services;

import com.example.gerenciamento_fornecedores.models.FornecedorModel;
import com.example.gerenciamento_fornecedores.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    private FornecedorRepository fornecedorRepository;

    public FornecedorModel salvar(FornecedorModel fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public List<FornecedorModel> listarTodos() {
        return fornecedorRepository.findAll();
    }

    public FornecedorModel buscarPorId(Long id) {
        return fornecedorRepository.findById(id).orElse(null);
    }

    public FornecedorModel atualizar(Long id, FornecedorModel fornecedorAtualizado) {
        fornecedorAtualizado.setId(id);
        return fornecedorRepository.save(fornecedorAtualizado);
    }

    public void deletar(Long id) {
        fornecedorRepository.deleteById(id);
    }

}