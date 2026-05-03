package fr.natsystem.dchen.evaluation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.natsystem.dchen.evaluation.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
