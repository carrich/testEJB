package fpt.testejb.service;

import fpt.testejb.entity.Product;
import fpt.testejb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> productlist() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);

    }
}
