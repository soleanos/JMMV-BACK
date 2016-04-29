package com.jmmv.back;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aliments", path = "aliments")
public interface VentealimentsRepository extends PagingAndSortingRepository<Ventealiments, String> {
	List<Ventealiments> findByAliments(@Param("aliments") String aliments);
}