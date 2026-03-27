package br.login.model;

public class Planta {
    private int id;
    private String nome;
    private String tipo;
    private String solo;
    private String descricao;

    public Planta() {}

    public Planta(int id, String nome, String tipo, String solo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.solo = solo;
    }
  

    // getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getSolo() { return solo; }
    public void setSolo(String solo) { this.solo = solo; }
    
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
