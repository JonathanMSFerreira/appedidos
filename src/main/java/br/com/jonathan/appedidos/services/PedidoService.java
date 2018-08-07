package br.com.jonathan.appedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jonathan.appedidos.domain.Cliente;
import br.com.jonathan.appedidos.domain.Pedido;
import br.com.jonathan.appedidos.repository.ClienteRepository;
import br.com.jonathan.appedidos.repository.PedidoRepository;
import br.com.jonathan.appedidos.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	PedidoRepository repo;
	
	
	public Pedido buscar(Integer id) {
		
		Optional<Pedido> pedido = repo.findById(id);
	
		return pedido.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado!"
				+ "Id: "+id+", Tipo: "+ Cliente.class.getName()));
		
	}
	
	
}
