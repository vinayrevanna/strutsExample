package com.mkyong.common.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import com.mysql.jdbc.*;
public class TaskDao {
	
	public boolean insertData(String assignedTo, String taskstatus) throws Exception {
        System.out.println("jdbc connection");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/test", "root", "root");
 
        try {
 
            try {
            	PreparedStatement  st = con.prepareStatement("INSERT INTO test.taskassigned(statusName) VALUES(?)");
            	st.setString(1, assignedTo);
            	int i= st.executeUpdate();  
            	System.out.println(i+" records inserted to taskassigned");
            	
            	PreparedStatement  st1 = con.prepareStatement("INSERT INTO test.taskstatus(assignedName) VALUES(?)");
            	st1.setString(1, taskstatus);
            	i= st1.executeUpdate();  
            	System.out.println(i+" records inserted to taskstatus");
            	
            } catch (SQLException ex) {
                System.out.println("SQL statement is not executed!" + ex);
                return false;
            }
            con.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
