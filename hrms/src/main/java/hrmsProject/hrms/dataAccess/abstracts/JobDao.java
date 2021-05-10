package hrmsProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsProject.hrms.entities.concretes.Job;

public interface JobDao  extends JpaRepository<Job, Integer>{

}
