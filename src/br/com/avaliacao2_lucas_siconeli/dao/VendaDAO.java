package br.com.avaliacao2_lucas_siconeli.dao;

import br.com.avaliacao2_lucas_siconeli.dto.VendaDTO;
import br.com.avaliacao2_lucas_siconeli.dto.AlunoDTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

public class VendaDAO {
    
    public VendaDAO(){
    }
    
    private ResultSet rs = null;
    Statement stmt = null;
    Statement stmt1 = null;
    SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    
    public boolean inserirVenda(VendaDTO vendaDTO, AlunoDTO alunoDTO, JTable produtos){
        try{
            ConexaoDAO.ConnectDB();
            
            stmt = ConexaoDAO.con.createStatement();
            stmt1 = ConexaoDAO.con.createStatement();
            
            String comando1 = "Insert into Venda (dat_vend, val_vend, " +
                    "id_alu) values ( " 
                    + "to_date ('" + date.format(vendaDTO.getDat_vend()) + "', 'DD/MM/YYYY'), " +
                    vendaDTO.getVal_vend() + ", " + alunoDTO.getId_alu() + ")";
            
            stmt.execute(comando1.toUpperCase(), Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            rs.next();
            
            for(int cont = 0; cont < produtos.getRowCount(); cont++){
                String comando2 = "Insert into produto_venda (id_vend, id_cur, "
                        + "val_prod, qtd_prod) values ( " 
                        + rs.getInt("id_vend") + ", "
                        + produtos.getValueAt(cont, 0) + ", "
                        + produtos.getValueAt(cont, 2) + ", "
                        + produtos.getValueAt(cont, 3) + "); ";
                stmt1.execute(comando2);
            }            
            
            ConexaoDAO.con.commit();
            stmt.close();
            stmt1.close();
            rs.close();
            
            return true;          
        }
        catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
            
            return false;
        }
        finally{
            ConexaoDAO.CloseDB();
        }
    }
    
}
