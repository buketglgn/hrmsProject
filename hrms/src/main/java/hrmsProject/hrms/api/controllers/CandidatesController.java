package hrmsProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hrmsProject.hrms.business.abstracts.CandidateService;
import hrmsProject.hrms.entities.concretes.Candidate;


@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService=candidateService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody Candidate candidate){
		
		this.candidateService.add(candidate);
	}
	
	@GetMapping("/getall")
	public List<Candidate> getall(){
		
		return this.candidateService.getall();
	}
	

}
