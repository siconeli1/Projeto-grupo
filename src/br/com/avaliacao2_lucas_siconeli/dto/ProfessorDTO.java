package br.com.avaliacao2_lucas_siconeli.dto;

import java.util.Date;

public class ProfessorDTO {
    private int id_prof;
    private String nome_prof, cpf_prof, tel_prof;
    private Date data_cad_prof;

    public int getId_prof() {
        return id_prof;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public String getNome_prof() {
        return nome_prof;
    }

    public void setNome_prof(String nome_prof) {
        this.nome_prof = nome_prof;
    }

    public String getCpf_prof() {
        return cpf_prof;
    }

    public void setCpf_prof(String cpf_prof) {
        this.cpf_prof = cpf_prof;
    }

    public String getTel_prof() {
        return tel_prof;
    }

    public void setTel_prof(String tel_prof) {
        this.tel_prof = tel_prof;
    }

    public Date getData_cad_prof() {
        return data_cad_prof;
    }

    public void setData_cad_prof(Date data_cad_prof) {
        this.data_cad_prof = data_cad_prof;
    }


}
