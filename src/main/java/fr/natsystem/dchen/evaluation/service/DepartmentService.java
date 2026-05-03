package fr.natsystem.dchen.evaluation.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import fr.natsystem.dchen.evaluation.dto.request.RequestDepartmentDTO;
import fr.natsystem.dchen.evaluation.dto.response.ResponseDepartmentDTO;

public interface DepartmentService {
	ResponseDepartmentDTO get(final Long id);
	List<ResponseDepartmentDTO> findAll(Sort sort);
	Page<ResponseDepartmentDTO> findAll(final Pageable pageable);
	Long create(final RequestDepartmentDTO dto);
	void update(final Long id, final RequestDepartmentDTO dto);
	void delete(final Long id);
}
