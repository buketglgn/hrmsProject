package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.entities.concretes.Candidate;

public interface CandidateService {
	
 
	Result add(Candidate candidate);
	DataResult<List<Candidate> > getall();

}
