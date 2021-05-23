package hrmsProject.hrms.business.abstracts;

import java.util.List;


import hrmsProject.hrms.entities.concretes.Employer;

public interface EmployerService {
	
	public	void add(Employer employer);
	public List<Employer> getall();

}
