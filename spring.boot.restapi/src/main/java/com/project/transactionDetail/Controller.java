package com.project.transactionDetail;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller 
{
	@Autowired
	FetchRepo repo;
	
	@GetMapping("/getdata")
	List<Td>findAll()
	{
		return repo.findAll();
	}

}


