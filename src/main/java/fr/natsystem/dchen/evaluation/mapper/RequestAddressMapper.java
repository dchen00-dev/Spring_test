package fr.natsystem.dchen.evaluation.mapper;

import org.springframework.stereotype.Component;

import fr.natsystem.dchen.evaluation.dto.request.RequestAddressDTO;
import fr.natsystem.dchen.evaluation.entity.Address;



@Component
public class RequestAddressMapper {

	/**
	 * 
	 * @param address
	 * @return
	 */
    public RequestAddressDTO convertToDto(Address address) {
        if ( address == null ) {
            return null;
        }

        RequestAddressDTO requestAddressDTO = new RequestAddressDTO();

        requestAddressDTO.setLibelle( address.getAdrLibelle());
        requestAddressDTO.setVille( address.getAdrVille());
        requestAddressDTO.setCodePostal( address.getAdrCodePostal());
        requestAddressDTO.setEmpId( address.getEmployee().getId() );

        return requestAddressDTO;
    }

    /**
     * 
     * @param paysDTO
     * @param address
     * @return
     */
    public Address convertToEntity(RequestAddressDTO addressDTO) {
    	final Address address = new Address();
        if ( addressDTO == null ) {
            return null;
        }

        updateEntity(addressDTO, address);
        return address;
    }
    public void updateEntity(RequestAddressDTO addressDTO, Address address) {
         if (addressDTO != null && address != null) {
        	 address.setAdrLibelle(addressDTO.getLibelle());
        	 address.setAdrVille(addressDTO.getVille());
        	 address.setAdrCodePostal(addressDTO.getCodePostal());
        	 address.setEmployee(addressDTO.getEmpId());
         }	
    }
         

}
