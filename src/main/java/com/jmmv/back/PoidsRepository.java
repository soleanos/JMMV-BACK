package com.jmmv.back;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "poid", path = "poid")
public interface PoidsRepository extends PagingAndSortingRepository<Poids, Double> {
	List<Poids> findByPoids(@Param("poids") double poids);
}