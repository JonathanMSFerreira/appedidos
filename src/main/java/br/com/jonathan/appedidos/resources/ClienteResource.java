package br.com.jonathan.appedidos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.appedidos.domain.Cliente;
import br.com.jonathan.appedidos.services.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	
	@Autowired
	private ClienteService cs;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id){
		
		Cliente cliente = cs.buscar(id);
		
		return ResponseEntity.ok(cliente);
		
	}
	
	
	
	
	

}
