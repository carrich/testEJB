package fpt.testejb.service;

import fpt.testejb.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> productlist();
    public void save(Product product);
}
