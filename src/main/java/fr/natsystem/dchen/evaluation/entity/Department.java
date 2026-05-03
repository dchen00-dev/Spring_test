package fr.natsystem.dchen.evaluation.entity;

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
@Table(name= "Z_DEPARTMENT")
public class Department {

	@Id
	@Column(name = "DEP_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dept_seq")
	@SequenceGenerator(name = "dept_seq", sequenceName = "Z_DEP_SQ", allocationSize = 1)
	private Long id;
	
    @Size(max = 30,  message= "Department name at most 30 characters")
	@Column(name = "DEP_NOM")
	private String depName;
	
    @Size(max = 30, message= "Department localisation at most 30 characters")
	@Column(name = "DEP_LOC")
	private String depLoc;
	
}
