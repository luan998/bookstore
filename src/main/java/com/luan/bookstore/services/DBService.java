package com.luan.bookstore.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luan.bookstore.domain.Categoria;
import com.luan.bookstore.domain.Livro;
import com.luan.bookstore.repository.CategoriaRepository;
import com.luan.bookstore.repository.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria cat2 = new Categoria(null,"Ficção Científica","Livros de ficção científica");
		Categoria cat3 = new Categoria(null,"Biografias","Livros de biografias");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Margin","lorem ipsum", cat1);
		Livro l2 = new Livro(null,"Python", "Louis Python", "Lorem Ipsum", cat1);
		Livro l3= new Livro(null,"A biofrafia de Tom Parker", "Tom Parker", "Lorem Ipsum", cat2);
		Livro l4 = new Livro(null,"The War of Worlds", "H.G.Wells", "Lorem Ipsum", cat2);
		Livro l5 = new Livro(null,"1, Robot", "Isaac Asimov", "Lorem Ipsum", cat2);
		
		
		cat1.getLivros().addAll(Arrays.asList(l1, l2));
		cat2.getLivros().addAll(Arrays.asList(l3,l4,l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4, l5));
	}

}
