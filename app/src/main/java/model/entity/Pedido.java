package model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private float valorTotal;


    private static final List<String> arrayPedido = new ArrayList<>();




}
