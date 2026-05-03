package fr.natsystem.dchen.evaluation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name= "Z_TASK")
public class Task {

	@Id
	@Column(name = "TSK_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_seq")
	@SequenceGenerator(name = "task_seq", sequenceName = "Z_TSK_SQ", allocationSize = 1)
	private Long id;
	
    @Size(max = 100,  message= "Description at most 100 characters")
	@Column(name = "TSK_DESCRIPTION")
	private String desc;
    
    @ManyToOne
	@JoinColumn(name = "TSK_PRJ_REF",   
	referencedColumnName = "PRJ_ID", 
	nullable = true)
    private Project taskProject;
    
}
