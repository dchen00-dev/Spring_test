package fr.natsystem.dchen.evaluation.entity;

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
@Table(name= "Z_PROJECT")
public class Project {

	@Id
	@Column(name = "PRJ_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "projet_seq")
	@SequenceGenerator(name = "projet_seq", sequenceName = "Z_PRJ_SQ", allocationSize = 1)
	private Long id;
	
    @Size(max = 100,  message= "Description at most 100 characters")
	@Column(name = "PRJ_DESCRIPTION")
	private String desc;
	
	@Column(name = "PRJ_DATE_DEB")
	private LocalDate dateDebut;
	
	@Column(name = "PRJ_DATE_FIN")
	private LocalDate dateFin;

}
