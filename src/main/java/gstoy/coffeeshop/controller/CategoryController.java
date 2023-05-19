package gstoy.coffeeshop.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import gstoy.coffeeshop.entity.Category;
import gstoy.coffeeshop.service.CategoryService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {

	private final CategoryService categoryService;

	@GetMapping
	public String list(Model model) {
		List<Category> categories = categoryService.findCategories();
		model.addAttribute("categories", categories);
		return "admin/categoryList";
	}

	@GetMapping("/new")
	public String createForm(Model model) {
		model.addAttribute("categoryForm", new CategoryForm());
		return "admin/createCategoryForm";
	}

	@PostMapping("/new")
	public String create(@Valid CategoryForm form, BindingResult result) {

		if (result.hasErrors()) {
			return "admin/createCategoryForm";
		}

		Category category = new Category(form.getName());
		categoryService.saveCategory(category);
		return "redirect:/";
	}

}
