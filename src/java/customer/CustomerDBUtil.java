/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gayan
 */
public class CustomerDBUtil {
    public static List<Customer> validate(String userName, String password){
        ArrayList<Customer> cus = new ArrayList<>();
        //Create Database Connection
        String url = "jdbc:mysql://localhost:3306/store";
        String user = "root";
        String pass = "root";
        //validate
        
        try {
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return cus;
    }

    
    }

