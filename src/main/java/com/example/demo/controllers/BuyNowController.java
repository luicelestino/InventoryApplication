package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.domain.Product;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class BuyNowController {
    @Autowired
    private ApplicationContext context;
    private PartService partService;
    private List<Part> theParts;
    private static Product product1;
    private Product product;

    @GetMapping("/buyproduct")
    public String buyproduct(@RequestParam("productID") int theId, Model theModel) {
        ProductService productService = context.getBean(ProductServiceImpl.class);
        Product product2 = productService.findById(theId);
        this.product = product2;
        if (product2.getInv() > 0) {
            product2.setInv(product2.getInv() - 1);
            productService.save(product2);
            return "purchaseconfirmation";
        }
        else {
            return "purchaseerror";
        }
    }
}
