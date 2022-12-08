package com.BikkadIT.Blogging.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.Blogging.entities.Category;
import com.BikkadIT.Blogging.entities.Post;
import com.BikkadIT.Blogging.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	
	
}
