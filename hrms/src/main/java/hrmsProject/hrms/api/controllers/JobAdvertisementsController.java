package hrmsProject.hrms.api.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrmsProject.hrms.business.abstracts.JobAdvertisementService;
import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobAdvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;
	
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService=jobAdvertisementService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement){
		
	  return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>>  getall(){
		
		return this.jobAdvertisementService.getall();
	}

	@GetMapping("/getByStatus")
	public DataResult<List<JobAdvertisement>>  getByStatus(@RequestParam boolean statu){
		
		return this.jobAdvertisementService.getByStatus(statu);
	}
	
	@GetMapping("/getByStatusAndEmployerId")
	public DataResult<List<JobAdvertisement>>  getByStatusAndEmployerId
	(@RequestParam("status") boolean statu, @RequestParam("id") int employerId){
		
		return this.jobAdvertisementService.getByStatusAndEmployerId(statu,employerId);
	}
	

	@GetMapping("/getAllAdvertisementsByEmployer_Id")
	public DataResult<List<JobAdvertisement>>  getAllAdvertisementsByEmployer_Id(int employerId){
		
		return this.jobAdvertisementService.getAllAdvertisementsByEmployer_Id(employerId);
	}
	
	
	@PostMapping("/UpdateJobAdvertisementSetStatusForEmployer_Id")
	@Transactional
	public Result UpdateJobAdvertisementSetStatusForEmployer_Id(@RequestParam int employerId ,@RequestParam int  jobAdvertisementId){
		
	  return this.jobAdvertisementService.UpdateJobAdvertisementSetStatusForEmployer_Id(employerId, jobAdvertisementId);
	}
}
