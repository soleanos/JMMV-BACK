package com.jmmv.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jmmv.back.models.Client;

@RepositoryRestResource(collectionResourceRel = "clients", path = "clients")
public interface ClientsRepository extends PagingAndSortingRepository<Client, Long> {

	List<Client> findByNom(@Param("nom") String nom);

}