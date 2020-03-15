package com.example.projetospringglauco.model;

/**
 * produtoModel
 */
public class produtoModel {

    private int Codigo;
    private String nome;
    private Double valor;
    private int estoque;

    public produtoModel(int codigo, String nome, Double valor, int estoque) {
        this.Codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "produtoModel [Codigo=" + Codigo + ", estoque=" + estoque + ", nome=" + nome + ", valor=" + valor + "]";
    }

}