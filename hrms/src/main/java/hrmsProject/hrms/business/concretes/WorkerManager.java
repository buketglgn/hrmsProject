package hrmsProject.hrms.business.concretes;

import java.util.List;

import hrmsProject.hrms.business.abstracts.WorkerService;
import hrmsProject.hrms.dataAccess.abstracts.WorkerDao;
import hrmsProject.hrms.entities.concretes.Worker;

public class WorkerManager implements WorkerService {
	
	private WorkerDao workerDao;
	
	public WorkerManager( WorkerDao workerDao) {
		super();
		this.workerDao=workerDao;
	}

	@Override
	public void add(Worker worker) {
		this.workerDao.save(worker);
		
	}

	@Override
	public List<Worker> getall() {
		return this.workerDao.findAll();
	}

}
