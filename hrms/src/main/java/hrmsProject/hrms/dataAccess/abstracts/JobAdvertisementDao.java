package hrmsProject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hrmsProject.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	List<JobAdvertisement> getByStatus(boolean statu);
	
	List<JobAdvertisement> getByStatusAndEmployer_Id(boolean statu, int employerId);
	
	List<JobAdvertisement> getByEmployer_Id(int employerId);
	
	@Modifying
	@Query("Update JobAdvertisement set status=false where   employer.id= :employerId and id=:id")
	int UpdateJobAdvertisementSetStatusForEmployer_Id( int employerId ,int id);
	


}
