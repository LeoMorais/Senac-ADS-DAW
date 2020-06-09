package com.example.biblioteca.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.biblioteca.model.Livros;
import com.example.biblioteca.repository.BibliotecaRepository;

@Controller
public class BibliotecaController {
	
	@Autowired
	private BibliotecaRepository br;
 	
	@RequestMapping(value="/")
	    public String home() {
	        return "livros";
	    }
	
	@RequestMapping(value="/livros")
	public ModelAndView listaLivros(){
		ModelAndView mv = new ModelAndView("livros");
		Iterable<Livros> livros = br.findAll();
		mv.addObject("livros", livros);
		return mv;
	}
	 
	@RequestMapping(value="/cadastrar", method = RequestMethod.GET)
	    public String cadastrar() {
	        return "formlivros";
	    }
	@RequestMapping(value="/cadastrar", method = RequestMethod.POST)
	    public String cadastrar(Livros livros) {
	        br.save(livros);
			return "redirect:/livros";
	    }
	
	@PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id, Model model) {
		Optional<Livros> livros = br.findById(id);
        br.deleteById(id);
        model.addAttribute("livros", br.findAll());
        return "livros";
    }
	
	@GetMapping("/{id}")
    public ModelAndView exibeid(@PathVariable("id") Long id) {
		Optional<Livros> optionalivro = br.findById(id);
		Livros livros = optionalivro.get();
		ModelAndView mv = new ModelAndView("formedit");
		mv.addObject("livros",livros);
        return mv;
    }

    @PostMapping("/{id}/update")
    public String atualiza(@PathVariable Long id,  @ModelAttribute Livros livros, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "formedit";
        }
        br.findById(id).get();
        br.save(livros);
        //model.addAttribute("livros", br.findAll());
        return "redirect:/livros";
    }
	
	
	
	
	
	
}
