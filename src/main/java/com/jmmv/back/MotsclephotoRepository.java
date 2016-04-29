package com.jmmv.back;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "motsclephoto", path = "motsclephoto")
public interface MotsclephotoRepository extends PagingAndSortingRepository<MotsClePhoto, Long> {
	List<MotsClePhoto> findBymotcle(@Param("motcle") String motcle);
}