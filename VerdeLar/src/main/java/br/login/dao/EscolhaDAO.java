package br.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EscolhaDAO {

    //salva o número da primeira tela (1, 2 ou 3)
    public boolean salvarEscolha(String email, int escolha) {
        String sql = "UPDATE login SET escolha = ? WHERE email = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, escolha);
            stmt.setString(2, email);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao salvar escolha: " + e.getMessage());
            return false;
        }
    }

    //salva o tipo de cenário
    public boolean salvarCenario(String email, String cenario) {
        String sql = "UPDATE login SET cenario = ? WHERE email = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, cenario);
            stmt.setString(2, email);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao salvar cenário: " + e.getMessage());
            return false;
        }
    }

    //salva o tipo de planta
    public boolean salvarPlanta(String email, String planta) {
        String sql = "UPDATE login SET planta = ? WHERE email = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, planta);
            stmt.setString(2, email);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao salvar planta: " + e.getMessage());
            return false;
        }
    }
}
