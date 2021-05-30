package hrmsProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsProject.hrms.business.abstracts.UserService;
import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.core.utilities.results.SuccessDataResult;
import hrmsProject.hrms.core.utilities.results.SuccessResult;
import hrmsProject.hrms.dataAccess.abstracts.UserDao;
import hrmsProject.hrms.entities.concretes.User;

@Service
public class UserManager  implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao=userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Listeleme Başarılı") ;
	}

	@Override
  public Result add(User user) {
	
		this.userDao.save(user);
	return new SuccessResult("Ekleme Başarılı");	
		
	}

}
