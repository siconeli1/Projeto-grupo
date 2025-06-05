package br.com.avaliacao2_lucas_siconeli.ctr;

import java.sql.ResultSet;
import br.com.avaliacao2_lucas_siconeli.dao.ProfessorDAO;
import br.com.avaliacao2_lucas_siconeli.dto.ProfessorDTO;
import br.com.avaliacao2_lucas_siconeli.dao.ConexaoDAO;

public class ProfessorCTR {
    ProfessorDAO profDAO = new ProfessorDAO();

    public String inserirProfessor(ProfessorDTO profDTO) {
        if (profDAO.inserirProfessor(profDTO)) {
            return "Professor cadastrado com sucesso!";
        } else {
            return "Professor NÃO cadastrado!";
        }
    }

    public ResultSet consultarProfessor(ProfessorDTO profDTO, int opcao) {
        return profDAO.consultarProfessor(profDTO, opcao);
    }

    public String alterarProfessor(ProfessorDTO profDTO) {
        if (profDAO.alterarProfessor(profDTO)) {
            return "Professor alterado com sucesso!";
        } else {
            return "Professor NÃO alterado!";
        }
    }

    public String excluirProfessor(ProfessorDTO profDTO) {
        if (profDAO.excluirProfessor(profDTO)) {
            return "Professor excluído com sucesso!";
        } else {
            return "Professor NÃO excluído!";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
