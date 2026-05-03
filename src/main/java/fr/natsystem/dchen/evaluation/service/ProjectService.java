package fr.natsystem.dchen.evaluation.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import fr.natsystem.dchen.evaluation.dto.request.RequestProjectDTO;
import fr.natsystem.dchen.evaluation.dto.response.ResponseProjectDTO;

public interface ProjectService {
	ResponseProjectDTO get(final Long id);
	List<ResponseProjectDTO> findAll(Sort sort);
	Page<ResponseProjectDTO> findAll(final Pageable pageable);
	Long create(final RequestProjectDTO dto);
	void update(final Long id, final RequestProjectDTO dto);
	void delete(final Long id);
}
