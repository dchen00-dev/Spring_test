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
public class RequestTaskDTO {
    private Long projetId;       

    @Size(max = 100)
    private String desc;
   
}
