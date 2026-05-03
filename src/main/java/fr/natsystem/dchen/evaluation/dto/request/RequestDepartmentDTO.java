package fr.natsystem.dchen.evaluation.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RequestDepartmentDTO {
    @Size(max = 30)
    private String nom;

    @Size(max = 30)
    private String localisation;
    
}
