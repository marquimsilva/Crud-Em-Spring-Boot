package com.clj.monitoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.clj.monitoria.model.Monitores;
import com.clj.monitoria.repository.Monitor;
@Controller
public class ControllerIndex {
	@Autowired
	Monitor monitor;
	
	
     @GetMapping("/")
     public ModelAndView ListarHome() {
    	 ModelAndView modelAndView = new ModelAndView("index");
    	 
    	 modelAndView.addObject("Monitores", monitor.findAll());
    	 modelAndView.addObject(new Monitores());
    	 return modelAndView;
     }
     @PostMapping("/monitores")
     public String salvar(Monitores monitores) {
    	  monitor.save(monitores);
    	  return "redirect:/";
     }
     
     
     
    @GetMapping("/deletar/{id}")
    public String delete(@PathVariable("id") Long id) {
    	monitor.deleteById(id);
    	return "redirect:/";
     }
     
     
     
     
     
     
}
