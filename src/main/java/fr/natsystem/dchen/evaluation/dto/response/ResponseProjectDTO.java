package fr.natsystem.dchen.evaluation.dto.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseProjectDTO {
    private Long id;

    private String desc;

    private LocalDate dateDebut;
    
    private LocalDate dateFin;
    
    private Integer numberOfTasks;
}