package com.example.BookDemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {
	
	@Autowired
	BookRepository br;
	
	public void addBook(Book b)
	{
		br.save(b);
		
	}
	public List<Book> getBooks()
	{
		return br.findAll();
	}
	
	public void deleteRecord(int bno)
	{
	br.deleteById(bno);
	}
	//5. delete all
	public void deleteAll()
	{
	br.deleteAll();
	}
	//6. update a record
	public void update(int bno,Book b)
	{
	Book existingbook=br.findById(bno).orElseThrow(()->new RuntimeException("No book"));
	Book exitingbook = null;
	exitingbook.setBno(b.getBno());
	existingbook.setBname(b.getBname());
	existingbook.setBprice(b.getBprice());

	br.save(existingbook);
	}
	
}
