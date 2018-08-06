package br.com.jonathan.appedidos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.appedidos.domain.Categoria;
import br.com.jonathan.appedidos.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	
	@Autowired
	private CategoriaService cs;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id){
		
		Categoria categoria = cs.buscar(id);
		
		return ResponseEntity.ok(categoria);
		
	}
	
	
	
	
	

}
