package fr.natsystem.dchen.evaluation.dto.request;

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
public class RequestProjectDTO {
    @Size(max = 100)
    private String desc;

    private LocalDate dateDebut;
    
    private LocalDate dateFin;

}
