/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql = "select * from customer where username='"+userName+"' and password='"+password+"'";
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String phone = rs.getString(4);
                String userU = rs.getString(5);
                String passU = rs.getString(6);
                
                Customer c = new Customer(id,name,email,phone,userU,passU);
                cus.add(c);
                
                
                
            }
               
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return cus;
    }

    
    }

