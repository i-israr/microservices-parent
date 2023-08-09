package com.isrartest.productservise;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.isrartest.productservise.dto.ProductRequest;
import com.isrartest.productservise.repository.ProductRepository;
import com.isrartest.productservise.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.github.dockerjava.core.MediaType;
import java.math.BigDecimal;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductServiceApplicationTests {
//	@Container
//	static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:12");
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	@Autowired
//	private ProductRepository productRepository;
//
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add("spring.data", postgreSQLContainer::getJdbcUrl);
//	}
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("api/product")
//					.contentType(String.valueOf(MediaType.APPLICATION_JSON))
//					.content(productRequestString))
//				.andExpect(status().isCreated());
//		Assertions.assertEquals(1, productRepository.findAll().size());
//	}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("Smart Watch")
//				.description("Apple smart watch")
//				.price(BigDecimal.valueOf(1200))
//				.build();
//	}
}
