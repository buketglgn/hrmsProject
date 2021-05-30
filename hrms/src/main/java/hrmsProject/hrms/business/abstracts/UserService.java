package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.entities.concretes.User;


public interface UserService {
	
	Result  add(User user);
   DataResult<List<User>> getAll();
	

}
