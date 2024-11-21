package br.edu.imepac.administrativo.entidades;

public class Convenio {
  private int id;
  private String nome_empresa;
    private String CNPJ;
    private String telefone;

  public void setId(int id) { this.id = id; }
  public int getId() { return id; }

  public void setNome_empresa(String nome_empresa) { this.nome_empresa = nome_empresa; }
    public String getNome_empresa() { return nome_empresa; }

    public void setCNPJ(String CNPJ) { this.CNPJ = CNPJ; }
    public String getCNPJ() { return CNPJ; }

    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getTelefone() { return telefone; }
}
