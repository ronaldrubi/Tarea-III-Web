package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.GrupoRepository;
import domain.Grupo;

public class ActualizarGrupo extends PageController {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
    throws ServletException, IOException {
      GrupoRepository grupos = (GrupoRepository) context.getBean("grupoRepository");
    try {
            String id = request.getParameter("id");
            int idgrupo = Integer.parseInt(id);
            String numero = request.getParameter("numero");
            String sigla = request.getParameter("sigla");
            String nombre = request.getParameter("nombre");
            String horario = request.getParameter("horario");
            String aula = request.getParameter("aula");
			String id_profesor = request.getParameter("id_profesor");
            Grupo grupo = grupos.findGrupo(idgrupo+"");
            try {
                if (numero!=null) prof.setCedula(numero);
                if (sigla!=null) prof.setNombre(sigla);
                if (nombre!=null) prof.setTitulo(nombre);
                if (horario!=null) prof.setArea(telefono);
                if (aula!=null) prof.setTelefono(aula);
            } catch (Exception e) {}
      response.sendRedirect("listaGrupos");
        } catch (Exception e) {
            request.setAttribute("mensaje",e.getMessage());
            forward("/paginaError.jsp",request,response);
        }
  }
}