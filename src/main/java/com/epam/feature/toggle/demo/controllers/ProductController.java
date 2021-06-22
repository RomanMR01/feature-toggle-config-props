package com.epam.feature.toggle.demo.controllers;

import com.epam.feature.toggle.demo.config.FeatureToggleProperties;
import com.epam.feature.toggle.demo.repository.ProductRepository;
import com.epam.feature.toggle.demo.service.FeatureToggleService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    private final FeatureToggleProperties featureToggleProperties;
    private final ProductRepository productRepository;
    private final FeatureToggleService featureToggleService;

    @GetMapping({"/", "/products"})
    public String getProducts(final Model model) {
        model.addAttribute("products", productRepository.findAll());
        return "index";
    }

    @GetMapping("/products/{code}")
    public String getProduct(@PathVariable("code") final String code, final Model model) {
        model.addAttribute("product", productRepository.findByCode(code));
        model.addAttribute("ratingEnabled", featureToggleService.isToggleOn(featureToggleProperties.getStarsRating()));
        return "product";
    }

    @ExceptionHandler({Exception.class})
    public String handleException(final Exception e) {
        LOGGER.error("Handle exception,", e);
        return "error";
    }
}
