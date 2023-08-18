package com.ndirituedwin.serviceImple;

import com.ndirituedwin.Entity.Product;
import com.ndirituedwin.Exceptions.ResourceNotFoundException;
import com.ndirituedwin.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImple implements ProductService{
//     inject product repository
    private final ProductRepository repository;


    @Override
    public List<Product> selectAll() {
        return repository.findAll();
    }

    @Override
    public Product addNewProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public Product updateProduct(Product product, Long id) {
//         first check if the product exists in the database
        Product ifExists=repository.findById(id).
                orElseThrow(()->new ResourceNotFoundException
                        ("product with  \",\"id->\",product_id+\"  could not be found"));
        ifExists.setCategory(product.getCategory());
        ifExists.setPrice(product.getPrice());
        ifExists.setImageName(product.getImageName());
        ifExists.setQuantity(product.getQuantity());

        return repository.save(ifExists);
    }

    @Override
    public void deleteProduct(Long id) {
        //         first check if the product exists in the database
        Product ifExists=repository.findById(id).
                orElseThrow(()->new ResourceNotFoundException
                        ("product with  \",\"id->\",product_id+\"  could not be found"));
// now go ahead and delete
        repository.delete(ifExists);


    }
}
