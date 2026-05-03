package fr.natsystem.dchen.evaluation.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import fr.natsystem.dchen.evaluation.dto.request.RequestEmployeeDTO;
import fr.natsystem.dchen.evaluation.dto.response.ResponseEmployeeDTO;

public interface EmployeeService {
	ResponseEmployeeDTO get(final Long id);
	List<ResponseEmployeeDTO> findAll(Sort sort);
	Page<ResponseEmployeeDTO> findAll(final Pageable pageable);
	Long create(final RequestEmployeeDTO dto);
	void update(final Long id, final RequestEmployeeDTO dto);
	void delete(final Long id);
}
