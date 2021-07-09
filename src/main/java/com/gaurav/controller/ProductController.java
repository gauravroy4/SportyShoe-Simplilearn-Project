package com.gaurav.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gaurav.model.Product;
import com.gaurav.service.ProductService;

@Controller
@RequestMapping(value = "product")
public class ProductController {


	public ProductController() {
		System.out.println("ProductController()");
	}

	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/")
	public ModelAndView listProduct(ModelAndView model) throws IOException {
		List<Product> listProduct = productService.getAllProducts();
		model.addObject("listProduct", listProduct);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newProduct", method = RequestMethod.GET)
	public ModelAndView newProduct(ModelAndView model) {
		Product product = new Product();
		model.addObject("product", product);
		model.setViewName("productForm");
		return model;
	}

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute Product product) {
		if (product.getId() == 0) { // if Product id is 0 then creating the
			// Product otherwise updating the Product
			productService.addProduct(product);
		} else {
			productService.updateProduct(product);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteProduct", method = RequestMethod.GET)
	public ModelAndView deleteProduct(HttpServletRequest request) {
		int ProductId = Integer.parseInt(request.getParameter("id"));
		productService.deleteProduct(ProductId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editProduct", method = RequestMethod.GET)
	public ModelAndView editProduct(HttpServletRequest request) {
		int ProductId = Integer.parseInt(request.getParameter("id"));
		Product product = productService.getProduct(ProductId);
		ModelAndView model = new ModelAndView("productForm");
		model.addObject("product", product);

		return model;
	}

}