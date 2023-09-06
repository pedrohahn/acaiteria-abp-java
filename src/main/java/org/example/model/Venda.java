package org.example.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda{
    private LocalDate dataVenda;
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    private String observacao;
    private List<Produto> produtos = new ArrayList<>();
}
