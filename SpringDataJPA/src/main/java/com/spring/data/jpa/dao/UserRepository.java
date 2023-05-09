package com.spring.data.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.spring.data.jpa.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	// you can extend either jpa repository or crud repository
	public List<User> findByName(String name);// custom finder method

	public List<User> findByNameAndCity(String name, String city);// custom finder method

	// what is custom finder method in spring data jpa providing predefine method
	// like findById, FindAll but we want to fetch data like findByName or findById
	// by creating own custom method then here custom finder method concepts come
}
