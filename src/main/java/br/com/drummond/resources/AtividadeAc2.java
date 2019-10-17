package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeAc2 {
	
	
	@RequestMapping(value = "/multiplo8/{valor1}", method = RequestMethod.GET)
	public String resposta(@PathVariable Integer valor1) {
		String sim = "sim";
		String nao = "nao";
		Integer resultado; 
	
		Integer v1 = 8;
		
		resultado = valor1 % v1;
		if (resultado == 0)

		return sim;
		else 
			return nao;
	}
	
}