package com.example.gerenciamento_fornecedores.repositories;

import com.example.gerenciamento_fornecedores.models.FornecedorModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<FornecedorModel, Long> {

}
