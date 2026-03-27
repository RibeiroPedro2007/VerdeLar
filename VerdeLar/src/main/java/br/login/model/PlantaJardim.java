package br.login.model;

public class PlantaJardim {
    private int id;
    private String emailUsuario;
    private String nomePlanta;
    private String apelido;
    private int nivel;

    public PlantaJardim() {}

    public PlantaJardim(String nomePlanta, String apelido) {
        this.nomePlanta = nomePlanta;
        this.apelido = apelido;
    }

    // ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // Email do usuário
    public String getEmailUsuario() {
        return emailUsuario;
    }
    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    // Nome da planta (nome original / tipo)
    public String getNomePlanta() {
        return nomePlanta;
    }
    public void setNomePlanta(String nomePlanta) {
        this.nomePlanta = nomePlanta;
    }

    // Apelido da planta (nome personalizado)
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    // Nivel da planta (1 a 6)
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
