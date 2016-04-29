package com.jmmv.back;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "photo", path = "photo")
public interface PhotoRepository extends PagingAndSortingRepository<Photo, String> {
	List<Poids> findByPhoto(@Param("photo") String photo);
}