/**
 * 
 */
package com.arun.gcp;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.arun.gcp.model.ProductDTO;
import com.arun.gcp.service.ProductService;

/**
 * @author arunraja.jayavel
 *
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest
public class ProductControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ProductService productService;

	public void getProductList() {
		List<ProductDTO> productDTOList = new ArrayList<>();
//		ProductDTO productDTO1 = new ProductDTO(1, "Test Product 1", "Description of test product 1");
//		ProductDTO productDTO2 = new ProductDTO(2, "Test Product 2", "Description of test product 2");
//		ProductDTO productDTO3 = new ProductDTO(3, "Test Product 3", "Description of test product 3");
//		productDTOList.add(productDTO1);
//		productDTOList.add(productDTO2);
//		productDTOList.add(productDTO3);
//		when(productService.getAllProducts()).thenReturn(productDTOList);
//		mockMvc.perform(MockMvcRequestBuilders.get("/ms1/products")
//                .contentType(MediaType.APPLICATION_JSON)
//        ).andExpect(jsonPath("$", hasSize(3))).andDo(print());

	}
}
