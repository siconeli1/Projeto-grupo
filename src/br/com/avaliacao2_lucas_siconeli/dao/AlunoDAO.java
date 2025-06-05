package br.com.avaliacao2_lucas_siconeli.dao;

import java.sql.*;
import br.com.avaliacao2_lucas_siconeli.dto.AlunoDTO;

public class AlunoDAO {

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirAluno(AlunoDTO alunoDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "INSERT INTO aluno (nome_alu, logradouro_alu, numero_alu, " +
                    "bairro_alu, cidade_alu, estado_alu, cep_alu, cpf_alu, rg_alu) VALUES (" +
                    "'" + alunoDTO.getNome_alu() + "', " +
                    "'" + alunoDTO.getLogradouro_alu() + "', " +
                    alunoDTO.getNumero_alu() + ", " +
                    "'" + alunoDTO.getBairro_alu() + "', " +
                    "'" + alunoDTO.getCidade_alu() + "', " +
                    "'" + alunoDTO.getEstado_alu() + "', " +
                    "'" + alunoDTO.getCep_alu() + "', " +
                    "'" + alunoDTO.getCpf_alu() + "', " +
                    "'" + alunoDTO.getRg_alu() + "')";

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro ao inserir aluno: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public ResultSet consultarAluno(AlunoDTO alunoDTO, int opcao) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "";

            switch (opcao) {
                case 1:
                    comando = "SELECT * FROM aluno WHERE nome_alu LIKE '" + alunoDTO.getNome_alu() + "%' ORDER BY nome_alu";
                    break;

                case 2:
                    comando = "SELECT * FROM aluno WHERE id_alu = " + alunoDTO.getId_alu();
                    break;

                case 3:
                    comando = "SELECT id_alu, nome_alu FROM aluno";
                    break;
            }

            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;

        } catch (Exception e) {
            System.out.println("Erro ao consultar aluno: " + e.getMessage());
            return rs;
        }
    }

    public boolean alterarAluno(AlunoDTO alunoDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "UPDATE aluno SET " +
                    "nome_alu = '" + alunoDTO.getNome_alu() + "', " +
                    "logradouro_alu = '" + alunoDTO.getLogradouro_alu() + "', " +
                    "numero_alu = " + alunoDTO.getNumero_alu() + ", " +
                    "bairro_alu = '" + alunoDTO.getBairro_alu() + "', " +
                    "cidade_alu = '" + alunoDTO.getCidade_alu() + "', " +
                    "estado_alu = '" + alunoDTO.getEstado_alu() + "', " +
                    "cep_alu = '" + alunoDTO.getCep_alu() + "', " +
                    "cpf_alu = '" + alunoDTO.getCpf_alu() + "', " +
                    "rg_alu = '" + alunoDTO.getRg_alu() + "' " +
                    "WHERE id_alu = " + alunoDTO.getId_alu();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro ao alterar aluno: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public boolean excluirAluno(AlunoDTO alunoDTO) {
        try {
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();

            String comando = "DELETE FROM aluno WHERE id_alu = " + alunoDTO.getId_alu();

            stmt.execute(comando.toUpperCase());
            ConexaoDAO.con.commit();
            stmt.close();
            return true;

        } catch (Exception e) {
            System.out.println("Erro ao excluir aluno: " + e.getMessage());
            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
}
