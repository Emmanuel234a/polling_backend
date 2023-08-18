package com.ndirituedwin.serviceImple;

import com.ndirituedwin.Entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> selectAll();
    public Product addNewProduct(Product product);
    public Product updateProduct(Product product,Long id);
    public void deleteProduct(Long id);
}
