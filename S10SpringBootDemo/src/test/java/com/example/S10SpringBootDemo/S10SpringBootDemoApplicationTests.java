package com.example.S10SpringBootDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


import com.example.S10SpringBootDemo.dao.ProductRepository;
import com.example.S10SpringBootDemo.dao.product;
import com.example.S10SpringBootDemo.service.SomeService;

@SpringBootTest
class S10SpringBootDemoApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void contextLoads() {
	
	}
	@Test
	void createProduct() {
	 product product = new product();
	 product.setName("Headset");
	 product.setDesc("Bluetooth headset");
	 product.setPrice(2000);
	 
	 ProductRepository pr = context.getBean(ProductRepository.class);
	 pr.save(product);
	}

}
