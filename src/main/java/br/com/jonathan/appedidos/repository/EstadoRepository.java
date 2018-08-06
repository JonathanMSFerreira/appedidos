package br.com.jonathan.appedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jonathan.appedidos.domain.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
