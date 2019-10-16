package com.clj.monitoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clj.monitoria.model.Monitores;

public interface Monitor extends JpaRepository<Monitores, Long> {

}
