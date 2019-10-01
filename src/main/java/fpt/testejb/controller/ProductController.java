package fpt.testejb.controller;

import fpt.testejb.entity.Product;
import fpt.testejb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping( method = RequestMethod.GET)
    public String detail(Model model) {
        List<Product> productList = productService.productlist();
        model.addAttribute("products", productList);
        return "productlist";
    }
    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "form";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public String store(Product product, Model model) {


        productService.save(product);
        List<Product> productList = productService.productlist();
        model.addAttribute("products", productList);
        return "productlist";
    }
}

