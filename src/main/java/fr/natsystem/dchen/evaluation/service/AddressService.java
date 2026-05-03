package fr.natsystem.dchen.evaluation.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import fr.natsystem.dchen.evaluation.dto.request.RequestAddressDTO;
import fr.natsystem.dchen.evaluation.dto.response.ResponseAddressDTO;

public interface AddressService {
	ResponseAddressDTO get(final Long id);
	List<ResponseAddressDTO> findAll(Sort sort);
	Page<ResponseAddressDTO> findAll(final Pageable pageable);
	Long create(final RequestAddressDTO dto);
	void update(final Long id, final RequestAddressDTO dto);
	void delete(final Long id);
}
