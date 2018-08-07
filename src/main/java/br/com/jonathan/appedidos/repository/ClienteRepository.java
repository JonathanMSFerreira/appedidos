package br.com.jonathan.appedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jonathan.appedidos.domain.Cidade;
import br.com.jonathan.appedidos.domain.Cliente;
import br.com.jonathan.appedidos.domain.Produto;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
