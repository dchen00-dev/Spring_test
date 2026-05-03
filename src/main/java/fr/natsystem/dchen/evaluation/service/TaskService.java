package fr.natsystem.dchen.evaluation.service;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import fr.natsystem.dchen.evaluation.dto.request.RequestTaskDTO;
import fr.natsystem.dchen.evaluation.dto.response.ResponseTaskDTO;

public interface TaskService {
	ResponseTaskDTO get(final Long id);
	List<ResponseTaskDTO> findAll(Sort sort);
	Page<ResponseTaskDTO> findAll(final Pageable pageable);
	Long create(final RequestTaskDTO dto);
	void update(final Long id, final RequestTaskDTO dto);
	void delete(final Long id);
}
