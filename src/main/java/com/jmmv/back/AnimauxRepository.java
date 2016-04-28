package com.jmmv.back;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "animaux", path = "animaux")
public interface AnimauxRepository extends PagingAndSortingRepository<Animaux, Long> {
	List<Animaux> findByNom(@Param("nom") String nom);
	
}
