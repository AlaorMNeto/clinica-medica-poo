package br.edu.imepac.administrativo.entidades;

public class Consulta {
    private long id;
    private String nome;
    private boolean estaAtiva;
    private int data;


    public void setNome(String nome) {this.nome = nome;}
    public String getNome (){return nome;}
    public long getid() {return id;}
    public void setId(int id) {this.id = id;}



    public boolean isEstaAtiva() {
        return estaAtiva;
    }

    public void setEstaAtiva(boolean estaAtiva) {
        this.estaAtiva = estaAtiva;
    }

    public void definirStatus(boolean estado) {
        this.estaAtiva = estado;
    }

    public String verificarStatus() {
        if (estaAtiva) {
            return "A tarefa está ativa.";
        } else {
            return "A tarefa está concluída.";
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String verificarData() {
        int anoAtual = 2024; //
        if (data == anoAtual) {
            return "A tarefa está ativa.";
        } else if (data < anoAtual) {
            return "A tarefa está concluída.";
        } else {
            return "A tarefa está programada para o futuro.";
        }
    }

























}
