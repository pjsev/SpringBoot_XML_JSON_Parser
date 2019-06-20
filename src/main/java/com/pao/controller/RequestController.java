package com.pao.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pao.model.Customer;

@RestController
public class RequestController {
	
	// This basically receives an XML data as the request body and maps it to the model
	@RequestMapping(value="customerXML", method=RequestMethod.POST, consumes=MediaType.APPLICATION_XML_VALUE)
	public Customer convertXMLToCustomerData(@RequestBody Customer customer) {
		return customer;
	}
	
	// Spring automatically maps the json 
	@RequestMapping(value="customerJSON", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Customer convertJSONToCustomerData(@RequestBody Customer customer) {
		return customer;
	}
	

}
