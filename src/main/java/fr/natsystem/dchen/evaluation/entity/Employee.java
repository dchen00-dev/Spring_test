package fr.natsystem.dchen.evaluation.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name= "Z_EMPLOYEE")
public class Employee {

	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq")
	@SequenceGenerator(name = "employee_seq", sequenceName = "Z_EMP_SQ", allocationSize = 1)
	private Long id;
	
    @Size(max = 30,  message= "Employee name at most 30 characters")
	@Column(name = "EMP_NOM")
	private String nom;
	
    @Size(max = 30, message= "Job title at most 30 characters")
	@Column(name = "EMP_JOB")
	private String job;
	
	@Column(name = "EMP_BOSS_REF")
	private Long bossReference;
	
	@Column(name = "EMP_DATE_EMBAUCHE")
	private LocalDate dateEmbauche;
	
	@Column(name = "EMP_SALAIRE")
	private BigDecimal salaire;
	
	@Column(name = "EMP_DEPT_REF")
	private Long deptReference;
}
