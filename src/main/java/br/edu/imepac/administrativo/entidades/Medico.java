package br.edu.imepac.administrativo.entidades;

public class Medico {
    private long id;
    private String CRM;
    private String nome;
    private String email;

    public void setId(long id) { this.id = id; }
    public long getId() { return id; }

    public void setCRM(String CRM) { this.CRM = CRM; }
    public String getCRM() { return CRM; }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }
}