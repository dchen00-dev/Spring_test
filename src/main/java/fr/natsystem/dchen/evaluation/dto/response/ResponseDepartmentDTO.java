package fr.natsystem.dchen.evaluation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDepartmentDTO {
    private Long id;

    private String nom;

    private String localisation;
    
    private Integer numOfEmployee;
}
