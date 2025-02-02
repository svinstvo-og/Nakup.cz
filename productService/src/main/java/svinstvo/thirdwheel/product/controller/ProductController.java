package svinstvo.thirdwheel.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import svinstvo.thirdwheel.product.dto.ProductRequest;
import svinstvo.thirdwheel.product.model.Product;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping
    @ResponseBody(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {

    }

}
