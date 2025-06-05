package br.com.avaliacao2_lucas_siconeli.ctr;

import java.sql.ResultSet;
import br.com.avaliacao2_lucas_siconeli.dto.CursoDTO;
import br.com.avaliacao2_lucas_siconeli.dao.CursoDAO;
import br.com.avaliacao2_lucas_siconeli.dao.ConexaoDAO;
import br.com.avaliacao2_lucas_siconeli.dto.ProfessorDTO;

public class CursoCTR {

    CursoDAO cursoDAO = new CursoDAO();

    public String inserirCurso(CursoDTO cursoDTO, ProfessorDTO professorDTO) {
    return cursoDAO.inserirCurso(cursoDTO, professorDTO) ?
           "Curso cadastrado com sucesso!" :
           "Curso NÃO cadastrado!";
}

/* idem para alterarCurso */
public String alterarCurso(CursoDTO cursoDTO, ProfessorDTO professorDTO){
    return cursoDAO.alterarCurso(cursoDTO, professorDTO) ?
           "Curso alterado com sucesso!" :
           "Curso NÃO alterado!";
}

    public String excluirCurso(CursoDTO cursoDTO) {
        try {
            if (cursoDAO.excluirCurso(cursoDTO)) {
                return "Curso excluído com sucesso!";
            } else {
                return "Curso NÃO excluído!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Curso NÃO excluído!";
        }
    }
    
    public ResultSet consultarCurso(CursoDTO cursoDTO, int opcao) {
        
        ResultSet rs = null;
        
        rs = cursoDAO.consultarCurso(cursoDTO, opcao);
        
        return rs;
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
