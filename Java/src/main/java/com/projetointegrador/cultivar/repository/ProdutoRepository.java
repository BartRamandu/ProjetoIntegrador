package com.projetointegrador.cultivar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetointegrador.cultivar.model.Produto;

/**
 * 
 * @author BabiLuna
 * @since 1.0
 *
 */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
public List<Produto> findAllByProdutoContainingIgnoreCase (String produto);
	

}
