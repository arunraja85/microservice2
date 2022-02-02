/**
 * 
 */
package com.arun.gcp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.arun.gcp.model.ProductDTO;

/**
 * @author arunraja.jayavel
 *
 */
@Service
public class ProductService {

	public List<ProductDTO> getAllProducts(){
		List<ProductDTO> productDTOList = new ArrayList<>();
		ProductDTO productDTO1 = new ProductDTO(1, "Test Product 1","Description of test product 1");
		ProductDTO productDTO2 = new ProductDTO(2, "Test Product 2","Description of test product 2");
		ProductDTO productDTO3 = new ProductDTO(3, "Test Product 3","Description of test product 3");
		productDTOList.add(productDTO1);
		productDTOList.add(productDTO2);
		productDTOList.add(productDTO3);
		return productDTOList;
	}
}
