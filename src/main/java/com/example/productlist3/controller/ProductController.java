package com.example.productlist3.controller;
import com.example.productlist3.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@SpringBootApplication
@RequestMapping("/products")
public class ProductController {
    private List<Product> theProducts;

    @PostConstruct
    private void loadData() {
        Product pro1 = new Product(1, "Banh trung thu", "Hai", 20.59, 5);
        Product pro2 = new Product(2, "Banh deo", "Nam", 25.60, 7);
        Product pro3 = new Product(3, "Long den trung thu", "Bay", 13.40, 9);

        theProducts = new ArrayList<>();

        theProducts.add(pro1);
        theProducts.add(pro2);
        theProducts.add(pro3);
    }

    @GetMapping("/list")
    public String listProducts(Model theModel) {
        theModel.addAttribute("products", theProducts);
        return "list_products";
    }
}



