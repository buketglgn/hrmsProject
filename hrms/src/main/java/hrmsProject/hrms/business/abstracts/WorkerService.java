package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.entities.concretes.Worker;

public interface WorkerService {

	public	void add(Worker worker);
	public List<Worker> getall();
}
