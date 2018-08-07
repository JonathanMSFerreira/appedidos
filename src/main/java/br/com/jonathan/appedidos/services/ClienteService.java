package br.com.jonathan.appedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jonathan.appedidos.domain.Cliente;
import br.com.jonathan.appedidos.repository.ClienteRepository;
import br.com.jonathan.appedidos.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository repo;
	
	
	public Cliente buscar(Integer id) {
		
		Optional<Cliente> categoria = repo.findById(id);
	
		return categoria.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado!"
				+ "Id: "+id+", Tipo: "+ Cliente.class.getName()));
		
	}
	
	
}
