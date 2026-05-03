package fr.natsystem.dchen.evaluation.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestEmployeeDTO {

    @Size(max = 30)
    private String nom;

    @Size(max = 30)
    private String job;

    private LocalDate dateEmbauche;

    private BigDecimal salaire;

    private Long chefId;       

    private Long departmentId; 
}