package br.tec.db.veiculos.model;

import jakarta.persistence.Entity;

@Entity
public class Camonhao extends Veiculo{
    private Integer capacidadeDeCarga;
}
