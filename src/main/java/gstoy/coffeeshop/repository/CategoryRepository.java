package gstoy.coffeeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gstoy.coffeeshop.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
