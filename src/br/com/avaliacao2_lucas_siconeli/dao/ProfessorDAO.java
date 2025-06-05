package br.com.avaliacao2_lucas_siconeli.dao;

import br.com.avaliacao2_lucas_siconeli.dto.ProfessorDTO;
import java.sql.*;
import java.text.SimpleDateFormat;

public class ProfessorDAO {
    private ResultSet rs = null;
    private Statement stmt = null;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public boolean inserirProfessor(ProfessorDTO profDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "INSERT INTO professor (nome_prof, cpf_prof, tel_prof, data_cad_prof) VALUES (" +
                    "'" + profDTO.getNome_prof() + "', " +
                    "'" + profDTO.getCpf_prof() + "', " +
                    "'" + profDTO.getTel_prof() + "', " +
                    "TO_DATE('" + sdf.format(profDTO.getData_cad_prof()) + "', 'DD/MM/YYYY'))";
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao inserir professor: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public ResultSet consultarProfessor(ProfessorDTO profDTO, int opcao) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";

            switch (opcao) {
                case 1:
                    comando = "SELECT p.id_prof, p.nome_prof FROM professor p WHERE p.nome_prof ILIKE '" + profDTO.getNome_prof() + "%' ORDER BY p.nome_prof";
                    break;
                case 2:
                    comando = "SELECT p.nome_prof, p.cpf_prof, p.tel_prof, TO_CHAR(p.data_cad_prof, 'DD/MM/YYYY') AS data_cad_prof FROM professor p WHERE p.id_prof = " + profDTO.getId_prof();
                    break;
            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        } catch (Exception e) {
            System.out.println("Erro ao consultar professor: " + e.getMessage());
            return rs;
        }
    }

    public boolean alterarProfessor(ProfessorDTO profDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "UPDATE professor SET " +
                    "nome_prof = '" + profDTO.getNome_prof() + "', " +
                    "cpf_prof = '" + profDTO.getCpf_prof() + "', " +
                    "tel_prof = '" + profDTO.getTel_prof() + "', " +
                    "data_cad_prof = TO_DATE('" + sdf.format(profDTO.getData_cad_prof()) + "', 'DD/MM/YYYY') " +
                    "WHERE id_prof = " + profDTO.getId_prof();
            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao alterar professor: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluirProfessor(ProfessorDTO profDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "DELETE FROM professor WHERE id_prof = " + profDTO.getId_prof();
            stmt.execute(comando);
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao excluir professor: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
}
