package servlet_project_controllor;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_project_dao.StudentDao;
import servlet_project_dto.Student;

public class StudentControllor extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String name=req.getParameter("name");
	String fathername=req.getParameter("fathername");
	String mothername=req.getParameter("mothername");
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	ServletContext context=getServletContext();
	String school=context.getInitParameter("school");
	ServletConfig config=getServletConfig();
	int fees=Integer.parseInt(config.getInitParameter("fees"));
	
	Student student=new Student();
	student.setEmail(email);
	student.setFathername(fathername);
	student.setMothername(mothername);
	student.setName(name);
	student.setPassword(password);
	student.setSchool(school);
	student.setSchoolfees(fees);
	StudentDao dao=new StudentDao();
	dao.signUpStudent(student);
}
}
