package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.ProfesorRepository;
import domain.Profesor;

public class NuevoProfesor extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      ProfesorRepository profesores = (ProfesorRepository) context.getBean("profesorRepository");
    try {
      //request.setAttribute("profesores",data);
      //forward("/nuevoProfesor.jsp",request,response);
	  response.sendRedirect("/nuevoProfesor.jsp");
        } catch (Exception e) {
            request.setAttribute("mensaje",e.getMessage());
            forward("/paginaError.jsp",request,response);
        }
  }
}