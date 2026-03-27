/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.login.dao;

import java.sql.*;
import br.login.model.Login;
import br.login.dao.Conexao;

public class LoginDAO {

    public boolean inserir(Login l) {
        String sql = "INSERT INTO login (nome, email, senha) VALUES (?, ?, ?)";
        
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, l.getNome());
            stmt.setString(2, l.getEmail());
            stmt.setString(3, l.getSenha());
            stmt.executeUpdate();
            
            System.out.println("Usuário cadastrado com sucesso!");
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir: " + e.getMessage());
            return false;
        }
    }

    public boolean validarLogin(String email, String senha) {
        String sql = "SELECT * FROM login WHERE email = ? AND senha = ?";
        
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            
            return rs.next(); // se encontrou o é login válido
        } catch (SQLException e) {
            System.out.println("Erro ao validar login: " + e.getMessage());
            return false;
        }
    }
    
    public boolean verificarLogin(String email, String senha) {
        String sql = "SELECT * FROM login WHERE email = ? AND senha = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, email);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();

            return rs.next(); // Se tiver resultado o login, ok
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public String buscarNomePorEmail(String email) {
        String sql = "SELECT nome FROM login WHERE email = ?";
        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return rs.getString("nome");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar nome: " + e.getMessage());
        }
        return null;
    }
}

