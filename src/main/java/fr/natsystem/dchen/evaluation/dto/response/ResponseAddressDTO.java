package fr.natsystem.dchen.evaluation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAddressDTO {
  	private Long id;

    private String libelle;

    private String ville;

    private String codePostal;
    
    private Long employeId;

    private String employeNom;    
    
}
