package br.com.avaliacao2_lucas_siconeli.ctr;

import java.sql.ResultSet;
import br.com.avaliacao2_lucas_siconeli.dto.VendaDTO;
import br.com.avaliacao2_lucas_siconeli.dao.VendaDAO;
import br.com.avaliacao2_lucas_siconeli.dao.ConexaoDAO;
import br.com.avaliacao2_lucas_siconeli.dto.AlunoDTO;

import javax.swing.JTable;

public class VendaCTR {
    VendaDAO vendaDAO = new VendaDAO();
    
    public VendaCTR(){
    }
    
    public String inserirVenda(VendaDTO vendaDTO, AlunoDTO alunoDTO, JTable cursos){
        try{
            if (vendaDAO.inserirVenda(vendaDTO, alunoDTO, cursos)){
                return "Venda cadastrada com sucesso!!!";
            }
            else{
                return "Venda não cadastrada!";
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return "Venda não cadastrada!";
        }
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
}