package br.com.jonathan.appedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jonathan.appedidos.domain.Categoria;
import br.com.jonathan.appedidos.repository.CategoriaRepository;
import br.com.jonathan.appedidos.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repo;
	
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> categoria = repo.findById(id);
	
		
		
		return categoria.orElseThrow(()->new ObjectNotFoundException("Objeto não encontrado!"));
		
	}
	
	
}
