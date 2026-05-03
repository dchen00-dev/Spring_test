package fr.natsystem.dchen.evaluation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTaskDTO {
    private Long id;
	
    private Long projetId;       

    private String desc;
}