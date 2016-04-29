package com.jmmv.back;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "vaccin", path = "vaccin")
public interface VaccinationRepository extends PagingAndSortingRepository<Vaccination, String> {
	List<Vaccination> findByvaccin(@Param("vaccins") String vaccins);
}