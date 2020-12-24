package com.mkyong.common.action;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.mkyong.common.dao.TaskDao;
import com.mkyong.common.form.TaskForm;

public class TaskAction extends Action{
	
	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception {

		TaskForm taskForm = (TaskForm) form;
		System.out.println(taskForm.getAssignedTo());
		System.out.println(taskForm.getTaskStatus());
		
		TaskDao taskData = new TaskDao();
//		Boolean status =  taskData.insertData(taskForm.getAssignedTo(), taskForm.getTaskStatus());
//		if(status){
//			return mapping.findForward("datainserted");
//		}else{
//			return mapping.findForward("error");
//		}
			
		return mapping.findForward("showTasksAdded");
	}

}
