package display;

import domain.Grupo;

public class GrupoAssembler {
  public static GrupoDTO Create(Grupo grupo) {
    GrupoDTO dto = new GrupoDTO();
    dto.id = grupo.getId();
    dto.numero = grupo.getNumero();
    dto.sigla = prof.getSigla();
    dto.nombre = prof.getNombre();
    dto.horario = prof.getArea();
    dto.aula = prof.getAula();
	dto.id_profesor = prof.Id_profesor();
    return dto;
  }
}