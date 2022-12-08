package com.BikkadIT.Blogging.services;

import java.util.List;

import com.BikkadIT.Blogging.payloads.CategoryDto;

public interface CategoryService {

	
	// create
	 CategoryDto createCategory(CategoryDto categoryDto);
	
	// update
	 CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//delete
	 void deleteCategory(Integer categoryId);
	
	//get
	 CategoryDto getCategory(Integer categoryId);
	
	// get All
	
	 List<CategoryDto> getCategories();
	 
}
