package com.project.transactionDetail;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchRepo extends JpaRepository<Td,Integer>
{
	@Override
	List<Td> findAll();

}
