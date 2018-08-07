package br.com.jonathan.appedidos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.appedidos.domain.Cliente;
import br.com.jonathan.appedidos.domain.Pedido;
import br.com.jonathan.appedidos.services.ClienteService;
import br.com.jonathan.appedidos.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	
	@Autowired
	private PedidoService ps;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Integer id){
		
		Pedido pedido = ps.buscar(id);
		
		return ResponseEntity.ok(pedido);
		
	}
	
	
	
	
	

}
