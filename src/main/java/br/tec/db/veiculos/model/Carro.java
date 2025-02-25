package br.tec.db.veiculos.model;

import jakarta.persistence.Entity;

@Entity
public class Carro extends Veiculo{
    private Integer numeroDePortas;
}
