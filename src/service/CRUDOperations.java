package service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> addBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException {
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getBlogTitle()+" "+list.get(i).getBlogDescription());
		}
		return list;
	}
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		return list;
	}
	
	public List<String> updateBlog(Blog blog) throws IOException{
		List<String> newlist = new ArrayList<String>();
		
		list.sort((Blog s1, Blog s2) -> s1.getBlogTitle().compareTo(s2.getBlogTitle()));
		for(int i=0; i<list.size();i++) {
			newlist.add(list.get(i).getBlogTitle());
		}
	return newlist;
	}
	
	public List<LocalDate> updateBlogdate(Blog blog) throws IOException{
		List<LocalDate> newlist = new ArrayList<LocalDate>();
		
		list.sort((Blog s1, Blog s2) -> s1.getDate().compareTo(s2.getDate()));
		for(int i=0; i<list.size();i++) {
			newlist.add(list.get(i).getDate());
		}
	return newlist;
	}
	
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
		return list;
		
	}
}
