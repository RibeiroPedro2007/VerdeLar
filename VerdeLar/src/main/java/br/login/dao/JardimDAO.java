package br.login.dao;

import br.login.model.PlantaJardim;
import java.sql.*;
import java.util.ArrayList;

public class JardimDAO {

    public boolean adicionarPlanta(String emailUsuario, String nomePlanta, String nomePersonalizado) {
        String sql = "INSERT INTO jardim (email_usuario, nome_planta, nome_personalizado) VALUES (?, ?, ?)";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setString(1, emailUsuario);
            stmt.setString(2, nomePlanta);
            stmt.setString(3, nomePersonalizado);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar planta: " + e.getMessage());
            return false;
        }
    }

    public ArrayList<String> listarPlantas(String emailUsuario) {
        ArrayList<String> lista = new ArrayList<>();
        String sql = "SELECT nome_personalizado FROM jardim WHERE email_usuario = ?";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {
            
            stmt.setString(1, emailUsuario);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                lista.add(rs.getString("nome_personalizado"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar plantas: " + e.getMessage());
        }
        return lista;
    }
     
    public ArrayList<PlantaJardim> buscarPlantasUsuario(String emailUsuario) {
        ArrayList<PlantaJardim> lista = new ArrayList<>();
        String sql = "SELECT * FROM jardim WHERE email_usuario = ?";

        try (Connection con = Conexao.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emailUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                PlantaJardim pj = new PlantaJardim();
                pj.setId(rs.getInt("id"));
                pj.setEmailUsuario(rs.getString("email_usuario"));
                pj.setNomePlanta(rs.getString("nome_planta"));
                pj.setApelido(rs.getString("nome_personalizado"));
                pj.setNivel(rs.getInt("nivel"));
                lista.add(pj);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar plantas: " + e.getMessage());
        }

        return lista;
    }

  
    public boolean atualizarNivelPlanta(String emailUsuario, String nomePlanta, int novoNivel) {
        String sql = "UPDATE jardim SET nivel = ? WHERE email_usuario = ? AND nome_planta = ?";

        try (Connection con = Conexao.conectar();
            PreparedStatement st = con.prepareStatement(sql)) {

            st.setInt(1, novoNivel);
            st.setString(2, emailUsuario);
            st.setString(3, nomePlanta);

            return st.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean atualizarNivel(PlantaJardim planta) {
        String sql = "UPDATE jardim SET nivel = ? WHERE id = ?";

        try (Connection con = Conexao.conectar();
             PreparedStatement st = con.prepareStatement(sql)) {

            st.setInt(1, planta.getNivel());
            st.setInt(2, planta.getId());

            return st.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println("Erro ao atualizar nível: " + e.getMessage());
            return false;
    }
}




}
