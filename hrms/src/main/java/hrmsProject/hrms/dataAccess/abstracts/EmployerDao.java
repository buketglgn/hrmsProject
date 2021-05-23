package hrmsProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsProject.hrms.entities.concretes.Employer;



public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
