package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/memo")
public class NorthwindContoroller {

	@Autowired
	ProductService service;

	@GetMapping("")
	String list(Model model) {
		List<Product> products = service.findAll();
		model.addAttribute("products", products);
		return "memo/index";
	}

	@GetMapping("new")
	public String newCreate(Model model) {
		return "memo/new";
	}

	@PostMapping("save")
	public String createComplete(ProductForm form) {
		Product product = new Product();
		product.setId(form.getId());
		product.setName(form.getName());
		product.setDate(form.getDate());
		product.setTime(form.getTime());
		product.setComment(form.getComment());
		product.setCategory(form.getCategory());
		product.setFavorite(form.getFavorite());
		service.save(product);
		return "redirect:/memo";
	}

	@GetMapping("edit")
	public String edit(Model model) {
		return "memo/edit";
	}

	@GetMapping("delete/{id}")
	public String delete(@PathVariable Integer id, Model model)
	{
		return "memo/delete";
	}
}
