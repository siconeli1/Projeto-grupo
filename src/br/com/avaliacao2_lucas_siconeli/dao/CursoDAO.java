package br.com.avaliacao2_lucas_siconeli.dao;

import java.sql.*;
import br.com.avaliacao2_lucas_siconeli.dto.CursoDTO;
import br.com.avaliacao2_lucas_siconeli.dto.ProfessorDTO;

public class CursoDAO {

    private ResultSet rs = null;     // consultas
    private Statement stmt = null;   // comandos SQL

    /* --------- INSERIR --------- */
    public boolean inserirCurso(CursoDTO cursoDTO, ProfessorDTO profDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando =
                "INSERT INTO curso (nome_cur, desc_cur, cod_bar_cur, " +
                "p_custo_cur, id_prof) VALUES ( " +
                "'" + cursoDTO.getNome_cur()  + "', " +
                "'" + cursoDTO.getDesc_cur()  + "', " +
                "'" + cursoDTO.getCod_bar_cur() + "', " +
                      cursoDTO.getP_custo_cur() + ", " +
                      profDTO.getId_prof()       + ")";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro inserir curso: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    /* --------- CONSULTAR --------- */
    public ResultSet consultarCurso(CursoDTO cursoDTO, int opcao) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";

            switch (opcao) {
                case 1:  // filtra por nome
                    comando = "SELECT c.*, p.nome_prof, p.id_prof " +
                              "FROM curso c, professor p " +
                              "WHERE c.id_prof = p.id_prof AND " +
                              "      c.nome_cur ILIKE '" + cursoDTO.getNome_cur() + "%' " +
                              "ORDER BY c.nome_cur";
                    break;

                case 2:  // busca por ID
                    comando = "SELECT c.*, p.nome_prof, p.id_prof " +
                              "FROM curso c, professor p " +
                              "WHERE c.id_prof = p.id_prof AND c.id_cur = " + cursoDTO.getId_cur();
                    break;

                case 3:  // combo-box simples
                    comando = "SELECT id_cur, nome_cur FROM curso";
                    break;
            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;

        } catch (Exception e) {
            System.out.println("Erro consultar curso: " + e.getMessage());
            return rs;
        }
    }

    /* --------- ALTERAR --------- */
    public boolean alterarCurso(CursoDTO cursoDTO, ProfessorDTO profDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando =
                "UPDATE curso SET " +
                "nome_cur    = '" + cursoDTO.getNome_cur()  + "', " +
                "desc_cur    = '" + cursoDTO.getDesc_cur()  + "', " +
                "cod_bar_cur = '" + cursoDTO.getCod_bar_cur() + "', " +
                "p_custo_cur =  " + cursoDTO.getP_custo_cur() + ", " +
                "id_prof      =  " + profDTO.getId_prof()       + " " +
                "WHERE id_cur = " + cursoDTO.getId_cur();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro alterar curso: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    /* --------- EXCLUIR --------- */
    public boolean excluirCurso(CursoDTO cursoDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "DELETE FROM curso WHERE id_cur = " + cursoDTO.getId_cur();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro excluir curso: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
}
