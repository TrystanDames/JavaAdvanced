/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lessons18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author User
 */
public class EmployeeDBConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/EmployeeDB";
        String username = "postgres";
        String password = "try_Lourens08";
        String query = "SELECT * FROM Employees";
        try (Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query)){
            while (rs.next()) {
                int empID = rs.getInt("emp_ID");
                String first = rs.getString("FIRST_NAME");
                String last = rs.getString("SURNAME");
                String gender = rs.getString("GENDER");
                String address = rs.getString("ADDRESS");
                String email = rs.getString("EMAIL");
                System.out.println("Employee ID:   " + empID + "\n"
                        + "Employee Name: " + first + " " + last + "\n"
                        + "Persons Gender:    " + gender + "\n"
                        + "Address:        " + address + "\n"
                        + "Email:          " + email + "\n");
            } // end of while
        } catch (SQLException ex) {
            while (ex != null) {
                System.out.println("SQLState:  " + ex.getSQLState());
                System.out.println("Error Code:" + ex.getErrorCode());
                System.out.println("Message:   " + ex.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause:" + t);
                    t = t.getCause();
                }
                ex = ex.getNextException();
            }
        }
    }
    }
   
