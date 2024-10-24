package br.edu.imepac.administrativo.entidades;

public class Funcionario {

    private long id;

    private String nome;

    private String email;

    private String cpf;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public void setNome(String nome) {this.nome=nome;}

    public String getNome(){return nome; }

    public void setEmail(String email){this.email = email; }

    public String getEmail(){return email; }

    public void setCpf(String cpf){this.cpf = cpf;}

    public String getCpf(){return cpf; }






}
