package br.com.avaliacao2_lucas_siconeli.ctr;

import java.sql.ResultSet;
import br.com.avaliacao2_lucas_siconeli.dto.AlunoDTO;
import br.com.avaliacao2_lucas_siconeli.dao.AlunoDAO;
import br.com.avaliacao2_lucas_siconeli.dao.ConexaoDAO;

public class AlunoCTR {

    AlunoDAO alunoDAO = new AlunoDAO();

    public String inserirAluno(AlunoDTO alunoDTO) {
        try {
            if (alunoDAO.inserirAluno(alunoDTO)) {
                return "Aluno cadastrado com sucesso!";
            } else {
                return "Aluno NÃO cadastrado!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Aluno NÃO cadastrado!";
        }
    }

    public ResultSet consultarAluno(AlunoDTO alunoDTO, int opcao) {
        return alunoDAO.consultarAluno(alunoDTO, opcao);
    }

    public String alterarAluno(AlunoDTO alunoDTO) {
        try {
            if (alunoDAO.alterarAluno(alunoDTO)) {
                return "Aluno alterado com sucesso!";
            } else {
                return "Aluno NÃO alterado!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Aluno NÃO alterado!";
        }
    }

    public String excluirAluno(AlunoDTO alunoDTO) {
        try {
            if (alunoDAO.excluirAluno(alunoDTO)) {
                return "Aluno excluído com sucesso!";
            } else {
                return "Aluno NÃO excluído!";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Aluno NÃO excluído!";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
