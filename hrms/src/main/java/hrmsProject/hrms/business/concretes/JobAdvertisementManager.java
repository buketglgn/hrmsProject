package hrmsProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsProject.hrms.business.abstracts.JobAdvertisementService;
import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.core.utilities.results.SuccessDataResult;
import hrmsProject.hrms.core.utilities.results.SuccessResult;
import hrmsProject.hrms.dataAccess.abstracts.JobAdvertisementDao;
import hrmsProject.hrms.entities.concretes.Candidate;
import hrmsProject.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao=jobAdvertisementDao;
	}
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		
		return new SuccessResult("İş İlanı Kaydı BAŞARILI.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getall() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Listeleme Başarılı");
	}
	
	
	@Override
	public DataResult<List<JobAdvertisement>> getByStatus(boolean statu) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByStatus(statu),"Tüm Aktif iş ilanları listeleniyor ");
	}
	@Override
	public DataResult<List<JobAdvertisement>> getByStatusAndEmployerId(boolean statu, int employerId) {
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByStatusAndEmployer_Id
				(statu, employerId),"Firmaya ait tüm aktif iş ilanları listeleniyor");
	}
	@Override
	public DataResult<List<JobAdvertisement>> getAllAdvertisementsByEmployer_Id(int employerId) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployer_Id(employerId),"BU firmaya ait tüm iş ilanları listelendi.");
	}
	@Override
	public Result UpdateJobAdvertisementSetStatusForEmployer_Id(int employerId, int jobAdvertisementId ) {
		
		this.jobAdvertisementDao.UpdateJobAdvertisementSetStatusForEmployer_Id(employerId ,jobAdvertisementId );
		
		return new SuccessResult("İlan Kapatıldı.. !");
	}
	
	}



