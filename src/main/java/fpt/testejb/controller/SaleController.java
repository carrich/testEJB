package fpt.testejb.controller;

import fpt.testejb.entity.Product;
import fpt.testejb.entity.Sale;
import fpt.testejb.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
@RequestMapping(value = "/sales")
public class SaleController {
    @Autowired
    SaleRepository saleRepository;
    @RequestMapping( method = RequestMethod.GET)
    public String detail(Model model) {
        List<Sale> saleList = saleRepository.findAll();
        model.addAttribute("sales", saleList);
        return "saleslist";
    }
}
