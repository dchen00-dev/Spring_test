package fr.natsystem.dchen.evaluation.mapper;

import org.springframework.stereotype.Component;

import fr.natsystem.poetp.demo.dto.ResponsePaysDTO;
import fr.natsystem.poetp.demo.model.Pays;


@Component
public class ResponseAddressMapper {

	/**
	 * 
	 * @param pays
	 * @return
	 */
    public ResponsePaysDTO convertToDto(Pays pays) {
        if ( pays == null ) {
            return null;
        }

        ResponsePaysDTO responsePaysDTO = new ResponsePaysDTO();

        responsePaysDTO.setId( pays.getId() );
        responsePaysDTO.setNom( pays.getNom() );
        responsePaysDTO.setContinent( pays.getContinent() );
        responsePaysDTO.setGentile( pays.getGentile() );
        responsePaysDTO.setPopulation( pays.getPopulation() );
        responsePaysDTO.setSurface( pays.getSurface() );
        responsePaysDTO.setDensite( pays.getDensite() );

        return responsePaysDTO;
    }

}
