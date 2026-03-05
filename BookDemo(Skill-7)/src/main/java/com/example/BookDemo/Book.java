package com.example.BookDemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	int bno;
	String bname;
	float bprice;
	//generate getters,setters,toString(),constructors
	public int getBno() {
		return bno;
	}
	public String getBname() {
		return bname;
	}
	public float getBprice() {
		return bprice;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public void setBprice(float bprice) {
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + ", bprice=" + bprice + "]";
	}
	public Book(int bno, String bname, float bprice) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.bprice = bprice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
