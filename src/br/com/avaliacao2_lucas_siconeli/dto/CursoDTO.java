package br.com.avaliacao2_lucas_siconeli.dto;

public class CursoDTO {
    private String nome_cur, desc_cur, cod_bar_cur;
    private double p_custo_cur, p_venda_cur;
    private int id_cur;

    public String getNome_cur() {
        return nome_cur;
    }

    public void setNome_cur(String nome_cur) {
        this.nome_cur = nome_cur;
    }

    public String getDesc_cur() {
        return desc_cur;
    }

    public void setDesc_cur(String desc_cur) {
        this.desc_cur = desc_cur;
    }

    public String getCod_bar_cur() {
        return cod_bar_cur;
    }

    public void setCod_bar_cur(String cod_bar_cur) {
        this.cod_bar_cur = cod_bar_cur;
    }

    public double getP_custo_cur() {
        return p_custo_cur;
    }

    public void setP_custo_cur(double p_custo_cur) {
        this.p_custo_cur = p_custo_cur;
    }

    public double getP_venda_cur() {
        return p_venda_cur;
    }

    public void setP_venda_cur(double p_venda_cur) {
        this.p_venda_cur = p_venda_cur;
    }

    public int getId_cur() {
        return id_cur;
    }

    public void setId_cur(int id_cur) {
        this.id_cur = id_cur;
    }

 
}
