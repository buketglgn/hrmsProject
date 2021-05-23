package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.entities.concretes.Candidate;

public interface CandidateService {
	
 
	public	void add(Candidate candidate);
	public List<Candidate> getall();

}
