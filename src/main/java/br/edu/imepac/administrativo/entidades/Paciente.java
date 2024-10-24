package br.edu.imepac.administrativo.entidades;

 public class Paciente {
     private int id;
     public String nome;
     private String email;
     private String cpf;

     public long getid() {return id;}
     public void setId(int id) {this.id = id;}

     public void setNome(String nome) {this.nome = nome;}
     public String getNome (){return nome;}

     public void setEmail(String email) {this.email = email;}
     public String getemail () {return email;}

     public void setCpf(String cpf) {this.cpf = cpf;}
     public String getCpf() {return cpf;}
 }
