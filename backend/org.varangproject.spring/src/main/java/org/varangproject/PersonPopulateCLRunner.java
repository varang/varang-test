package org.varangproject;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.varangproject.model.Person;
import org.varangproject.repository.PersonRepository;



@Component
@Service

public class PersonPopulateCLRunner implements CommandLineRunner {
	Logger logger = Logger.getLogger(PersonPopulateCLRunner.class);

	
	@Autowired
	PersonRepository personRepository;
	
	
	public void start() {
		for(int i=0;i<100;i++){
			Person p = new Person();
			p.setFirstName( String.format("name %d",i+1) );
			p.setLastName( String.format("surname %d",i+1) );
			p.setAge((short)i);
			personRepository.save(p);
		}
	}
	
	
	public void run(String... arg0) throws Exception {
		logger.info("command line runner started.");
		System.out.println("command line runner started.");

		start();
	}
}
