package pt.atec.intervencoestecnicas.model;

import java.util.Date;

public class Relatorio {
    String autor, descricao;
    Date data;

    public Relatorio(String autor, String descricao, Date data) {
        this.autor = autor;
        this.descricao = descricao;
        this.data = data;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
}
