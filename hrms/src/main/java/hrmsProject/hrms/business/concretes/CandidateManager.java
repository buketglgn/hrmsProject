package hrmsProject.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsProject.hrms.business.abstracts.CandidateService;
import hrmsProject.hrms.core.MernisService;
import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.ErrorResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.core.utilities.results.SuccessDataResult;
import hrmsProject.hrms.core.utilities.results.SuccessResult;
import hrmsProject.hrms.dataAccess.abstracts.CandidateDao;
import hrmsProject.hrms.entities.concretes.Candidate;

import java.rmi.RemoteException;

@Service
public class CandidateManager implements CandidateService  {
	
	private CandidateDao candidateDao;
	private MernisService mernisService ;
	
	@Autowired
	 public CandidateManager(CandidateDao candidateDao, MernisService mernisService) {
			super();
		 this.candidateDao=candidateDao;
		 this.mernisService=mernisService;
	}

	@Override
	public Result add(Candidate candidate) {
		Result result= new ErrorResult("Ekleme BAŞARISIZ..-TC kimlik no doğrulanamadı..");
		
		if(this.mernisService.mernisVerify(candidate)==true) {
			
			this.candidateDao.save(candidate);
			result= new SuccessResult("Ekleme Başarılı..");
		}
			return result;
		
		
		
	}

	@Override
	public DataResult<List<Candidate> > getall() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),"Listeleme Başarılı");
	}

}
