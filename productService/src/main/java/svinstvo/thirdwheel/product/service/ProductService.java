package svinstvo.thirdwheel.product.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import svinstvo.thirdwheel.product.dto.ProductRequest;
import svinstvo.thirdwheel.product.model.Product;
import svinstvo.thirdwheel.product.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .build();

        productRepository.save(product);
        log.info("Created product: {}", product.toString());
    }

    public void getAllProducts() {
        List<Product> products = productRepository.findAll();
    }

    public void getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
    }
}
