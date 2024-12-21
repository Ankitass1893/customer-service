package com.secor.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService productService;

    public CustomerController(CustomerService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Customer> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Customer getProductById(@PathVariable Long id) throws ResourceNotFoundException {
        return productService.getProductById(id);
    }

    @PostMapping
    public ResponseEntity<Customer> createProduct(@RequestBody Customer product) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }
}
