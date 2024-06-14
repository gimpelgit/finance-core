package core.services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import core.domain.Category;
import core.domain.TransactionType;
import core.dto.category.CreateCategoryDto;
import core.dto.category.UpdateCategoryDto;
import core.repository.CategoryRepository;


public class CategoryService{
	private CategoryRepository categoryRepository;


	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}


	public int createCategory(CreateCategoryDto createCategoryDto) {
		return categoryRepository.createCategory(createCategoryDto);
	}


	public boolean updateCategory(UpdateCategoryDto updateCategoryDto) {
		return categoryRepository.updateCategory(updateCategoryDto);
	}


	public boolean deleteCategoryById(int id) {
		return categoryRepository.deleteCategoryById(id);
	}


	public Category findCategoryById(int id) {
		return categoryRepository.findCategoryById(id);
	}

	public List<Category> getAllCategoryByDate(int moneyAccountId, Date start, Date end) {
		return categoryRepository.getAllCategoryByDate(moneyAccountId, start, end);
	}
	
	
	public List<Category> getAllIncomeCategoriesByDate(int moneyAccountId, Date start, Date end) {
		var allCategories = categoryRepository.getAllCategoryByDate(moneyAccountId, start, end);
		return getCategoryByType(allCategories, TransactionType.INCOME);
	}


	public List<Category> getAllExpenseCategoriesByDate(int moneyAccountId, Date start, Date end) {
		var allCategories = categoryRepository.getAllCategoryByDate(moneyAccountId, start, end);
		return getCategoryByType(allCategories, TransactionType.EXPENSE);
	}


	public List<Category> getAllCategoriesByUserId(int userId) {
		return categoryRepository.getAllCategoriesByUserId(userId);
	}


	public List<Category> getAllIncomeCategoriesByUserId(int userId) {
		var allCategories = categoryRepository.getAllCategoriesByUserId(userId);
		return getCategoryByType(allCategories, TransactionType.INCOME);
	}


	public List<Category> getAllExpenseCategoriesByUserId(int userId) {
		var allCategories = categoryRepository.getAllCategoriesByUserId(userId);
		return getCategoryByType(allCategories, TransactionType.EXPENSE);
	}


	private List<Category> getCategoryByType(List<Category> categories, TransactionType type) {
		return categories.stream()
			.filter(category -> category.getType() == type)
			.collect(Collectors.toList());
	}
}
