/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

import BackEnd.Pregunta;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Kevin Russo Emiliany
 */
public class Crud {
    
    Conexion con = new Conexion();
    
    public void crear(Pregunta pregunta) {
        String sql = "INSERT INTO Preguntas (pregunta, opcionA, opcionB, opcionC, opcionCorrecta) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = con.conectarMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, pregunta.getPregunta());
            pstmt.setString(2, pregunta.getOpA());
            pstmt.setString(3, pregunta.getOpB());
            pstmt.setString(4, pregunta.getOpC());
            pstmt.setString(5, pregunta.getOpCorrecta());
            pstmt.executeUpdate();
            System.out.println("pregunta creada.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Pregunta> obtenerPreguntas(){
    
        ArrayList<Pregunta> bd = new ArrayList<>();
        
        String sql = "SELECT * FROM Preguntas";
        try(Connection conn = con.conectarMySQL();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)){
            while(rs.next()){
                Pregunta pregunta = new Pregunta(
                        rs.getString("pregunta"),
                        rs.getString("opcionA"),
                        rs.getString("opcionB"),
                        rs.getString("opcionC"),
                        rs.getString("opcionCorrecta"));
                bd.add(pregunta);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return bd;
    }
    
    public void eliminarTodo() {
        String sql = "DELETE FROM preguntas";
        try (Connection conn = con.conectarMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();
            System.out.println("borrado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void eliminar(String pregunta) {
        String sql = "DELETE FROM preguntas WHERE pregunta = ?";
        try (Connection conn = con.conectarMySQL();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, pregunta);
            pstmt.executeUpdate();
            System.out.println("borrado");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}