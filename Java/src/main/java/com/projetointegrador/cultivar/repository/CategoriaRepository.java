package com.projetointegrador.cultivar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetointegrador.cultivar.model.Categoria;

/**
 * 
 * @author marianatheml
 * @author bartramandu
 * @since 1.0
 *
 */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByCategoriaContainingIgnoreCase (String categoria);
}
