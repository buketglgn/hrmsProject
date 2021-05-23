package hrmsProject.hrms.business.concretes;

import java.util.List;

import hrmsProject.hrms.business.abstracts.EmployerService;
import hrmsProject.hrms.dataAccess.abstracts.EmployerDao;
import hrmsProject.hrms.entities.concretes.Employer;

public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao=employerDao;
		
	}

	@Override
	public void add(Employer employer) {
		this.employerDao.save(employer);
		
	}

	@Override
	public List<Employer> getall() {
		return this.employerDao.findAll();
	}

}
