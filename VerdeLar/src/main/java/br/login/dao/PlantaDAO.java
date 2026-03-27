package br.login.dao;

import java.sql.*;
import java.util.ArrayList;
import br.login.model.Planta;

public class PlantaDAO {

    public ArrayList<Planta> pesquisarPlantas(String tipo, String solo, String nome) {
        ArrayList<Planta> lista = new ArrayList<>();
        String sql = "SELECT * FROM plantas WHERE 1=1";

        if (tipo != null && !tipo.isEmpty()) {
            sql += " AND tipo LIKE ?";
        }
        if (solo != null && !solo.isEmpty()) {
            sql += " AND solo LIKE ?";
        }
        if (nome != null && !nome.isEmpty()) {
            sql += " AND nome LIKE ?";
        }

        try (Connection conexao = Conexao.conectar();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            int index = 1;
            if (tipo != null && !tipo.isEmpty()) ps.setString(index++, "%" + tipo + "%");
            if (solo != null && !solo.isEmpty()) ps.setString(index++, "%" + solo + "%");
            if (nome != null && !nome.isEmpty()) ps.setString(index++, "%" + nome + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Planta p = new Planta();
                p.setNome(rs.getString("nome"));
                p.setTipo(rs.getString("tipo"));
                p.setSolo(rs.getString("solo"));
                p.setDescricao(rs.getString("descricao"));
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar plantas: " + e.getMessage());
        }

        return lista;
    }

}
