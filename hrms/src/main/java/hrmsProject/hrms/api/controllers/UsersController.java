package hrmsProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsProject.hrms.business.abstracts.UserService;
import hrmsProject.hrms.entities.concretes.Candidate;
import hrmsProject.hrms.entities.concretes.User;


@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userService;
	
	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService=userService;
	}
	
	@GetMapping("/getall")
	public List<User> getAll(){
		
		return	this.userService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody User user){
		
		this.userService.add(user);
	}
	
	

}
