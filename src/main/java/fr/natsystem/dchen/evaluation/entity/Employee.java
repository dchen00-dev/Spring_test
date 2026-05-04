package fr.natsystem.dchen.evaluation.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
	private String empNom;
	
    @Size(max = 30, message= "Job title at most 30 characters")
	@Column(name = "EMP_JOB")
	private String empJob;
	
	@Column(name = "EMP_DATE_EMBAUCHE")
	private LocalDate empDateEmbauche;
	
	@Min(value = 0)
	@Max(value = 9999)
	@Column(name = "EMP_SALAIRE")
	private BigDecimal empSalaire;
	
	
    @OneToOne
	@JoinColumn(name = "EMP_ID",   
	referencedColumnName = "ADR_EMP_REF", 
	nullable = true)
	private Address empAddress;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "EMP_BOSS_RF", 
			referencedColumnName = "EMP_ID", 
			nullable  = true
    )
	private Employee empChef;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "empChef", cascade = CascadeType.ALL)
	private Set<Employee> empSubordonnes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMP_DEPT_REF", 
		referencedColumnName = "DEP_ID", 
		nullable = true)
	private Department empDepartment;
	
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
        name = "Z_PROJECT_PARTICIPATION", // Table de jointure
        joinColumns = @JoinColumn(name = "PAR_EMP_REF"),
        inverseJoinColumns =  @JoinColumn(name = "PAR_PRJ_REF")
    )
	private Set<Project> empProjects;

	
}
