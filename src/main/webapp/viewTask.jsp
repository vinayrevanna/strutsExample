<%@ page language="java"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<html> 
	<head>
		<title>JSP for exampleForm</title>
	</head>
	<body>
		<html:form action="/tasks">
 
			Assigned To: <html:text property="assignedTo" /> <br>
			Task Status: <html:text property="taskStatus" /> <br>			
			<html:submit value="Send"/>
			<html:reset value="Reset"></html:reset>
		</html:form>
		<div style="color:red"><html:errors /></div>
		
	</body>
</html>