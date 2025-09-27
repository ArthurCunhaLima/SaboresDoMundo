package model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private float valor;
    private String nome;


    public Item(long id, float valor, String nome) {
        this.id = id;
        this.valor = valor;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
