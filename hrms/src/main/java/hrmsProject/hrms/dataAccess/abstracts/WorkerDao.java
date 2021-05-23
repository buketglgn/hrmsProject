package hrmsProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsProject.hrms.entities.concretes.Worker;



public interface WorkerDao extends JpaRepository<Worker, Integer> {

}
