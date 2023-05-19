package com.project.erp_backend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import com.project.erp_backend.dto.ProductDto;
import com.project.erp_backend.entities.Category;
import com.project.erp_backend.entities.Product;
import com.project.erp_backend.repositories.ProductRepository;
import com.project.erp_backend.services.impl.ProductServiceImpl;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

	@Mock
	ProductRepository repository;

	@InjectMocks
	ProductServiceImpl productService;

	@Test
	void getAllProducts() throws Exception {

		// créer une liste de produits 
		
		Category category = new Category("X33", "Consommables");

		Product stylo = new Product("X22", "Stylo", 50, 0, 0, category, null);

		Product papiers = new Product("X11", "papiers", 38, 0, 0, category, null);

		Product cahiers = new Product("X03", "cahiers", 70.8, 0, 0, category, null);

		List<Product> produits = new ArrayList<>(Arrays.asList(stylo, papiers, cahiers));
		
		// Simuler le retour de la méthode findAll du ProductRepository

		Mockito.when(repository.findAll()).thenReturn(produits);

		//Invoquer la méthode à tester
		
		Page<ProductDto> produitsDto = productService.getAllProducts(1, 2);

		//Tester le résultat obtenu % au résultat attendu
		
		assertNotNull(produitsDto);

		/*
		 * assertEquals(produitsDto.size(), produits.size());
		 * 
		 * assertEquals(produitsDto.get(0).getDesignation(), "Stylo");
		 */

		verify(repository, times(1)).findAll();

	}

}
