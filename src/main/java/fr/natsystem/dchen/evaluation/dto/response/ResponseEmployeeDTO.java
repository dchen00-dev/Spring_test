package fr.natsystem.dchen.evaluation.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEmployeeDTO {

    private Long id;

    private String nom;

    private String job;

    private LocalDate dateEmbauche;

    private BigDecimal salaire;

    private Long chefId;

    private String chefNom;    
    
    private Long departmentId;

    private String departmentNom;
}