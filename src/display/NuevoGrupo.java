package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.GrupoRepository;
import domain.Grupo;

public class NuevoGrupo extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      GrupoRepository grupos = (GrupoRepository) context.getBean("grupoRepository");
    try {
      //request.setAttribute("grupos",data);
      //forward("/nuevoGrupo.jsp",request,response);
	  response.sendRedirect("/nuevoGrupo.jsp");
        } catch (Exception e) {
            request.setAttribute("mensaje",e.getMessage());
            forward("/paginaError.jsp",request,response);
        }
  }
}