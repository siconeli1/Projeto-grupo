package br.com.avaliacao2_lucas_siconeli.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {
    public static Connection con = null;

    public static void ConnectDB() {
        try {
            String dsn = "avaliacao2_lucas_siconeli";
            String user = "postgres";
            String senha = "postdba";

            DriverManager.registerDriver(new org.postgresql.Driver());
            String url = "jdbc:postgresql://localhost:5433/" + dsn;

            con = DriverManager.getConnection(url, user, senha);
            con.setAutoCommit(false);
        } catch (Exception e) {
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
        }
    }

    public static void CloseDB() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar o banco: " + e.getMessage());
        }
    }
}
