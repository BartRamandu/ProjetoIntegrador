package com.projetointegrador.cultivar.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetointegrador.cultivar.model.Categoria;
import com.projetointegrador.cultivar.repository.CategoriaRepository;

/**
 * 
 * @author bartramandu
 * @since 1.0
 *
 */

@RestController
@RequestMapping("/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;

	@GetMapping
	public ResponseEntity<List<Categoria>> findAllCategoria() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/by-id/{id}")
	public ResponseEntity<Optional<Categoria>> findByIdCategoria(@PathVariable("id") Long id) {
		return ResponseEntity.ok(repository.findById(id));
	}

	@GetMapping("/by-categoria/{categoria}")
	public ResponseEntity<List<Categoria>> findByCategoria(@PathVariable("categoria") String categoria) {
		return ResponseEntity.ok(repository.findAllByCategoriaContainingIgnoreCase(categoria));
	}
	
	@GetMapping("/by-vendedor/{nomeVendedor}")
	public ResponseEntity<List<Categoria>> findByVendedor(@PathVariable String nomeVendedor){
		return ResponseEntity.ok(repository.findAllByNomeVendedorContainingIgnoreCase(nomeVendedor));
	}

	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}

	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
