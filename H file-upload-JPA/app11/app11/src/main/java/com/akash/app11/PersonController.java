package com.akash.app11;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
	
	@RequestMapping(path = "save", method=RequestMethod.POST)
	public String upload9(@RequestParam MultipartFile myFile) throws Exception {
		String originalFileName = myFile.getOriginalFilename();
		String fileName = "data";
		String fileType = originalFileName.substring(originalFileName.indexOf("."));
		FileOutputStream fout = new FileOutputStream("src\\main\\resources\\uploads\\" + fileName + fileType);
		fout.write(myFile.getBytes());		
		XSSFWorkbook workbook = new XSSFWorkbook("src\\main\\resources\\uploads\\" + fileName + fileType);
	    XSSFSheet worksheet = workbook.getSheetAt(0);
	    XSSFRow row;
	    ArrayList<Person> persons = new ArrayList<Person>();
	    Person person;
	    for(int i = 1; i < worksheet.getPhysicalNumberOfRows(); i++) {	   
	    	row = worksheet.getRow(i);
	    	person = new Person();
	    	person.setId((int) row.getCell(0).getNumericCellValue());
	    	person.setFirstName(row.getCell(1).getStringCellValue());
	    	person.setAge((int) row.getCell(2).getNumericCellValue());
	    	person.setEmail(row.getCell(3).getStringCellValue());
	    	persons.add(person);
	    }
	    personRepository.saveAll(persons);
		return originalFileName + " uploaded as " + fileName + fileType + " successfully";
		
	}
}
