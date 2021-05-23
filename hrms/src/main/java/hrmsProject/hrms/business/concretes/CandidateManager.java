package hrmsProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsProject.hrms.business.abstracts.CandidateService;
import hrmsProject.hrms.dataAccess.abstracts.CandidateDao;
import hrmsProject.hrms.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	
	@Autowired
	 public CandidateManager(CandidateDao candidateDao) {
			super();
		 this.candidateDao=candidateDao;
	}

	@Override
	public void add(Candidate candidate) {
		
		this.candidateDao.save(candidate);
	}

	@Override
	public List<Candidate> getall() {
		return this.candidateDao.findAll();
	}

}
