package com.akash.app10;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;

import javax.sound.sampled.Line;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping(path="upload", method = RequestMethod.POST)
	public String upload(@RequestParam MultipartFile file) throws Exception {
		String fileName = file.getOriginalFilename();
		FileOutputStream fout = new FileOutputStream("src/main/resources/uploads/" + fileName);
		fout.write(file.getBytes());
		
		FileReader fin = new FileReader("src/main/resources/uploads/" + fileName);
		BufferedReader bin = new BufferedReader(fin);
		String line, fields[];
		Person person;
		ArrayList<Person> persons = new ArrayList<Person>();
		while((line = bin.readLine()) != null) {
			fields = line.split(";");
			person = new Person();
			person.setId(Integer.parseInt(fields[0]));
			person.setFirstName(fields[1]);
			person.setLastName(fields[2]);
			person.setAge(Integer.parseInt(fields[3]));
			person.setEmail(fields[4]);
			persons.add(person);
		}
		personRepository.saveAll(persons);
		return "success";
	}
}
