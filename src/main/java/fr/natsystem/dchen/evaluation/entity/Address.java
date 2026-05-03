package fr.natsystem.dchen.evaluation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name= "Z_ADDRESS")
public class Address {

	@Id
	@Column(name = "ADR_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
	@SequenceGenerator(name = "address_seq", sequenceName = "Z_ADR_SQ", allocationSize = 1)
	private Long id;
	
    @Size(max = 100,  message= "Adresse at most 100 characters")
	@Column(name = "ADR_ADRESSE")
	private String adrLibelle;
	
    @Size(max = 30, message= "Ville at most 30 characters")
	@Column(name = "ADR_VILLE")
	private String adrVille;
	
    @Size(max = 5, message= "Code at most 5 characters")
	@Column(name = "ADR_CODE_POSTAL")	
    private String adrCodePostal;
	
    @OneToOne
	@JoinColumn(name = "ADR_EMP_REF",   
	referencedColumnName = "EMP_ID", 
	nullable = true)
	private Employee employee;
}
