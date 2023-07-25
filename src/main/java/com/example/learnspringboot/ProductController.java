package com.example.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @RequestMapping("/products")
    List<Product> retrieveAllProducts() {
        return Arrays.asList(
                new Product(1, "Indomie"),
                new Product(2, "Lays Potato Chips"),
                new Product(3, "Knorr Kebab"));
    }

}
