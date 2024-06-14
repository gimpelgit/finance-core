package core.repository;

import java.util.Date;
import java.util.List;

import core.domain.Category;
import core.dto.category.CreateCategoryDto;
import core.dto.category.UpdateCategoryDto;

public interface CategoryRepository {
	int  createCategory(CreateCategoryDto createCategoryDto);
	boolean  updateCategory(UpdateCategoryDto updateCategoryDto);
	boolean  deleteCategoryById(int id);
	Category findCategoryById(int id);
	List<Category> getAllCategoryByDate(int moneyAccountId, Date start, Date end);
	List<Category> getAllCategoriesByUserId(int userId);
}
