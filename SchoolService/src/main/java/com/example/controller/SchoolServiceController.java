package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.StudentServiceDelegate;

@RestController
public class SchoolServiceController {
	@Autowired
	private StudentServiceDelegate deligate;
	
	@RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
	public String getStudentService(@PathVariable String schoolname)
	{
		System.out.println("Going to call student service to get data!");
        return deligate.callStudentServiceAndGetData(schoolname);
	}
}
