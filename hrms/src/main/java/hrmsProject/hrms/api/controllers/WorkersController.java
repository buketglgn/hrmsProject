package hrmsProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsProject.hrms.business.abstracts.WorkerService;
import hrmsProject.hrms.entities.concretes.Worker;

@RestController
@RequestMapping("/api/workers")
public class WorkersController {
	
	private WorkerService workerService;
	
	@Autowired
	public WorkersController(WorkerService workerService) {
		super();
		this.workerService=workerService;
	}
	
	@GetMapping("/getall")
	public List<Worker> getall(){
		return this.workerService.getall();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Worker worker) {
		this.workerService.add(worker);
	}

}
