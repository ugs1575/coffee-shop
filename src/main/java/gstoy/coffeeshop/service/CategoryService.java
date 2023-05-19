package gstoy.coffeeshop.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gstoy.coffeeshop.entity.Category;
import gstoy.coffeeshop.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CategoryService {

	private final CategoryRepository categoryRepository;

	public List<Category> findCategories() {
		return categoryRepository.findAll();
	}

	@Transactional
	public void saveCategory(Category category) {
		categoryRepository.save(category);
	}
}
