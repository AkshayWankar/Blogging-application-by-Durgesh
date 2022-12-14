package com.BikkadIT.Blogging.services;

import java.util.List;

import com.BikkadIT.Blogging.entities.Post;
import com.BikkadIT.Blogging.payloads.PostDto;
import com.BikkadIT.Blogging.payloads.PostResponse;

public interface PostService {

	//create
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//update
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	//get all posts
	
	PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);
	
	// get single post
	
	PostDto getPostById(Integer postId);
	
	//get all posts by category
	
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	//get all posts by user
	
	List<PostDto> getPostsByUser(Integer userId);
	
	// search posts
	
	List<Post> searchPosts(String keyword);
	
}
