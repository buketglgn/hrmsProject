package hrmsProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsProject.hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
