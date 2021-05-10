package hrmsProject.hrms.business.concretes;



import java.util.List;

import org.springframework.stereotype.Service;

import hrmsProject.hrms.business.abstracts.JobService;
import hrmsProject.hrms.dataAccess.abstracts.JobDao;
import hrmsProject.hrms.entities.concretes.Job;


@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao=jobDao;
	}
	
	@Override
	public List<Job> getAll() {
		
		return this.jobDao.findAll();
	}

	

}
