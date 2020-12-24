package com.mkyong.common.form;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class TaskForm  extends ActionForm {

	private String assignedTo;
	private String taskStatus;
	
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
	HttpServletRequest request) {
		
	   ActionErrors errors = new ActionErrors();
	      
	    if(  (getAssignedTo() == null || ("".equals(getAssignedTo()))) &&  (getTaskStatus() == null || ("".equals(getTaskStatus())))) {
	       errors.add("common.name.err",
                         new ActionMessage("error.common.name.required"));
	    }
	      
	    return errors;
	}
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// reset properties
		assignedTo = "";
		taskStatus="";
	}
	
	
	
}
