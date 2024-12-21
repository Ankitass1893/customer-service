package com.secor.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository productRepository;

    public CustomerService(CustomerRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Customer> getAllProducts() {
        return (List<Customer>) productRepository.findAll();
    }

    public Customer getProductById(Long id) throws ResourceNotFoundException {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    public Customer createProduct(Customer product) {
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
