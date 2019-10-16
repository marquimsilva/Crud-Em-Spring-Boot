package com.clj.monitoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clj.monitoria.model.Aluno;

public interface Alunos extends JpaRepository<Aluno, Long>{

}
