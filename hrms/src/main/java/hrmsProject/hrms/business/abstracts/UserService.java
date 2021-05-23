package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.entities.concretes.User;


public interface UserService {
	
	public void add(User user);
	List<User> getAll();
	

}
