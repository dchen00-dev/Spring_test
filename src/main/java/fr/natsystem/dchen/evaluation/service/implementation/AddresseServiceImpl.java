package fr.natsystem.dchen.evaluation.service.implementation;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import fr.natsystem.dchen.evaluation.dto.request.RequestAddressDTO;
import fr.natsystem.dchen.evaluation.dto.response.ResponseAddressDTO;
import fr.natsystem.dchen.evaluation.service.AddressService;

public class AddresseServiceImpl implements AddressService{

	@Override
	public ResponseAddressDTO get(Long id) {
		ResponseAddressDTO responseAddress = new ResponseAddressDTO();
		
		return responseAddress;
	}

	@Override
	public List<ResponseAddressDTO> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ResponseAddressDTO> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long create(RequestAddressDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Long id, RequestAddressDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
