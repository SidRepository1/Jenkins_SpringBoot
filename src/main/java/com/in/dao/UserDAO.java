package com.in.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer> {

//	List<User> findByLname(String lName);
//
//	@Query(value = "select u from User u where u.lname=?1")
//	List<User> findByLnameQuery(String lname);
//
////	List<User> findByFnameAndLname(String fname, String lname);
//
//	@Query(value = "select u from User u where u.fname=?1 AND u.lname=?2")
//	List<User> findByFnameAndLname(String fname, String lname);
}
