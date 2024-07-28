package com.spring.service;

// Step1: JoinPoint Class
public class MovieService {
	private String name;
	private String catalog;

	public void setName(String name) {
		this.name = name;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	// JoinPoint methods
	public void printName() {
		System.out.println("#JOIN POINT MovieService printName >> " + name);
	}

	// JoinPoint methods
	public void printCatalog() {
		System.out.println("#JOIN POINT MovieService printCatalog >> " + catalog);
	}
}
