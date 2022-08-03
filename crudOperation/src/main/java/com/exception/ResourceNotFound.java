package com.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * Marks a method or exception class with the status code and reason that should be returned. 
 * So when HTTP response status 404 Not found is returned this exceeption class will be called
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{
	private String resourceName;
	private String fieldName;
	private String fieldValue;
	
	private static Logger log=LoggerFactory.getLogger(ResourceNotFound.class);
	public ResourceNotFound(String resourceName, String fieldName, String fieldValue) {
		super(resourceName+" not found");
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
		log.error(resourceName+" not found");
		
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	
}
