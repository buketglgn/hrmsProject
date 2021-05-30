package hrmsProject.hrms.business.abstracts;

import java.util.List;

import hrmsProject.hrms.core.utilities.results.DataResult;
import hrmsProject.hrms.core.utilities.results.Result;
import hrmsProject.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>> getall();
	
	DataResult<List<JobAdvertisement>> getByStatus(boolean statu);
	
	DataResult<List<JobAdvertisement>> getByStatusAndEmployerId(boolean statu, int employerId);
	
	DataResult<List<JobAdvertisement>> getAllAdvertisementsByEmployer_Id(int employerId);
	
	Result UpdateJobAdvertisementSetStatusForEmployer_Id(int employerId,int jobAdvertisementId );

}
