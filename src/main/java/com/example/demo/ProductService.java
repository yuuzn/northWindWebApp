package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public List<Product> findAll(){
		return productRepository.findAll();
	}
	public Product save(Product product){
        return productRepository.save(product);
    }

    public Product getOne(Integer id){
        return productRepository.getOne(id);
    }

    public void deleteOne(Integer id){
    	productRepository.deleteById(id);
    }

    public Product searchByName(String name) {
    	return productRepository.findByName(name);
    }
}
