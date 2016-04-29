package com.jmmv.back;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "animal", path = "animal")
public interface AnimalRepository extends PagingAndSortingRepository<Animal, Long> {
	List<Animal> findByNom(@Param("nom") String nom);
	
}
