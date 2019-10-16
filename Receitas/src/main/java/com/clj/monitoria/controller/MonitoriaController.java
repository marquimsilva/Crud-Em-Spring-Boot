package com.clj.monitoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clj.monitoria.model.Aluno;
import com.clj.monitoria.repository.Alunos;

@Controller
public class MonitoriaController {
	@Autowired
	Alunos alunos;
	
	
   @GetMapping("/alunos")
   public ModelAndView Listar() {
	   ModelAndView modelAndView = new ModelAndView("monitoria");
	   
	   modelAndView.addObject("Alunos", alunos.findAll());
	   modelAndView.addObject(new Aluno());
	   return modelAndView;
   }
   @PostMapping("/aluno")
   public String Salvar(Aluno aluno) {
	   this.alunos.save(aluno);
	   return "redirect:/alunos";
   }
   
   @GetMapping("/delete/{id}")
   public String delete(@PathVariable("id") Long id) {
  	alunos.deleteById(id);
  	return "redirect:/alunos";
   }

   
}
