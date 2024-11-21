package br.edu.imepac.administrativo.entidades;

import org.w3c.dom.Text;

public class Prontuario {
    private int id;
    public Text receituario;
    private Text exames;
    private String observacoes;

    public long getid() {return id;}
    public void setId(int id) {this.id = id;}

    public void setReceituario(Text receituario) { this.receituario = this.receituario; }
    public Text getReceituario() { return receituario; }

    public void setexames(Text exame) {this.exames = exames;}
        public Text getexames () {return exames;}

    public void setObservacoes(String observacoes) {this.observacoes = observacoes;}
        public String getobservacoes () {return observacoes;}

}
