package com.example.SkillEx6;
import java.util.*;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	@GetMapping("/welcome")
    public Map<String,String> display()
    {
        Map<String,String> response = new HashMap<>();
        response.put("message", "Welcome to 2400032174");
        return response;
    }

    //2 Total Books
    @GetMapping("/count")
    public Map<String,Integer> totalBooks()
    {
        Map<String,Integer> response = new HashMap<>();
        response.put("totalBooks", 5000);
        return response;
    }

    //3 Book Price
    @GetMapping("/price")
    public Map<String,Double> bookPrice()
    {
        Map<String,Double> response = new HashMap<>();
        response.put("bookPrice", 898.6);
        return response;
    }

    //4 Book Titles
    @GetMapping("/books")
    public Map<String,List<String>> bookTitles()
    {
        List<String> books = Arrays.asList("React", "Spring Boot");

        Map<String,List<String>> response = new HashMap<>();
        response.put("books", books);

        return response;
    }

    //5 Book Details using PathVariable
    @GetMapping("/books/{id}")
    public Map<String,Object> bookDetails(@PathVariable int id)
    {
        Map<String,Object> response = new HashMap<>();

        response.put("bookId", id);
        response.put("title", "Spring Boot");
        response.put("price", 450);

        return response;
    }

    //6 Author Name
    @GetMapping("/author/{name}")
    public Map<String,String> getAuthor(@PathVariable String name)
    {
        Map<String,String> response = new HashMap<>();
        response.put("author", name);
        response.put("message", "Author details fetched successfully");

        return response;
    }

}