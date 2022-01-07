package com.in.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in.model.User;
import com.in.service.UserService;

@RestController
public class UserCtl {
//	private static final Logger logger = LoggerFactory.getLogger(UserCtl.class);
	@Autowired
	private UserService service;

	// CrossOrigin help us to limit access over method,
	// here only request from "http://localhost:8151" is allowed.
	@CrossOrigin(origins = "http://localhost:8151")
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
//		logger.debug("inside /create");
		return service.createUser(user);
	}

	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}

	@DeleteMapping("/delete")
	public void deleteUser(@RequestBody User user) {
		service.deleteUser(user);
	}

	@GetMapping("/getuser/{id}")
	public Optional<User> getByID(@PathVariable(value = "id") Integer id) {
		return service.findById(id);
	}

	@GetMapping("/getall")
	public List<User> getAll() {
		return service.findAll();
	}

//	@GetMapping("/getByfNameAndlName")
//	public List<User> getByLname(@RequestParam(name = "fname") String fname, @RequestParam("lname") String lname) {
//		return service.findByFnameAndLname(fname, lname);
//	}

}