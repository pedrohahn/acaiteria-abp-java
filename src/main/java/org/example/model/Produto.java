package org.example.model;

import java.time.LocalDate;

public class Produto extends EntityId{
    private String nome;
    private Double precoCompra;
    private LocalDate dataValidade;
    private String descricao;
    private Double valorUnitario;
    private Boolean estocavel;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(Double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Boolean getEstocavel() {
        return estocavel;
    }

    public void setEstocavel(Boolean estocavel) {
        this.estocavel = estocavel;
    }

    public Produto(String nome, Double precoCompra, LocalDate dataValidade, LocalDate dataPrazo, String descricao, Double valorUnitario, Boolean estocavel) {
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.dataValidade = dataValidade;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.estocavel = estocavel;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", precoCompra=" + precoCompra +
                ", dataValidade=" + dataValidade +
                ", descricao='" + descricao + '\'' +
                ", valorUnitario=" + valorUnitario +
                ", estocavel=" + estocavel +
                '}';
    }
}
