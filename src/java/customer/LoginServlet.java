/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author gayan
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String username = request.getParameter("uid");
        String password = request.getParameter("pass");
        
        try{
            List<Customer> cusDetails = CustomerDBUtil.validate(username, password);
            request.setAttribute("cusDetails",cusDetails);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        RequestDispatcher dis = request.getRequestDispatcher("userAccount.jsp");
        dis.forward(request,response);
        
    }

    

}
