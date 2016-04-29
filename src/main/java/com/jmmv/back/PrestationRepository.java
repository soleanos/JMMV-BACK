package com.jmmv.back;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "prestation", path = "prestation")
public interface PrestationRepository extends PagingAndSortingRepository<Prestation, Date> {
	List<Prestation> findByDatePrestation(@Param("datePrestation") Date datePrestation);
}
