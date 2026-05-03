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
public class RequestAddressDTO {
	
    @Size(max = 100)
    private String libelle;

    @Size(max = 30)
    private String ville;

    @Size(max = 5)
    private String codePostal;

    private Long empId;       

}
