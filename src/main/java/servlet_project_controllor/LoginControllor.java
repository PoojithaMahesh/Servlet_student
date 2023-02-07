package servlet_project_controllor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project_dao.StudentDao;
import servlet_project_dto.Student;

public class LoginControllor extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id=Integer.parseInt(req.getParameter("id"));
       String school=req.getParameter("school");
       String email=req.getParameter("email");
       String password=req.getParameter("password");
      
       StudentDao dao=new StudentDao();
       Student student=dao.loginStudent(id);
       if(student.getSchool().equals(school)&&student.getEmail().equals(email)&&student.getPassword().equals(password)) {
    

    		   		resp.sendRedirect("https://stackoverflow.com");
    		   	
    		   	
    		   	
       }
       else {
		   	 RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
		   	 dispatcher.forward(req, resp);
		   	}
		   	
}
}
