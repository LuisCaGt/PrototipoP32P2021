/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ClientesDAO {
        private static final String SQL_INSERT = "insert into tbl_clientes values(?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE tbl_clientes SET dpi_cliente=?, nombre_cliente=?, apellido_cliente=?, email_cliente=?, telefono_cliente=? WHERE PK_numero_tarjeta=?";
    private static final String SQL_SELECT = "SELECT PK_numero_tarjeta, dpi_cliente, nombre_cliente, apellido_cliente, email_cliente, telefono_cliente FROM tbl_clientes";
    private static final String SQL_QUERY = "SELECT PK_numero_tarjeta, dpi_cliente, nombre_cliente, apellido_cliente, email_cliente, telefono_cliente FROM tbl_clientes WHERE PK_numero_tarjeta = ?";
    private static final String SQL_DELETE = "delete from tbl_clientes where PK_numero_tarjeta = ?";
    
    public int insert(Clientes huespedes) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, huespedes.getTarjeta());
            stmt.setString(2, huespedes.getDpi());
            stmt.setString(3, huespedes.getNombre());
            stmt.setString(4, huespedes.getApellido());
            stmt.setString(5, huespedes.getEmail());
            stmt.setString(6, huespedes.getTelefono());
           

            //System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            //System.out.println("Registros afectados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }
    public int update(Clientes huespedes){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        
        try {
            conn = Conexion.getConnection();
//          System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(6, huespedes.getTarjeta());
            stmt.setString(1, huespedes.getDpi());
            stmt.setString(2, huespedes.getNombre());
            stmt.setString(3, huespedes.getApellido());
            stmt.setString(4, huespedes.getEmail());
            stmt.setString(5, huespedes.getTelefono());

            rows = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return rows;
    }
    public List<Clientes> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Clientes huespedes = null;
        List<Clientes> metodo = new ArrayList<Clientes>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){
                String codigo = rs.getString("PK_numero_tarjeta");
                String dpi = rs.getString("dpi_cliente");
                String nombre = rs.getString("nombre_cliente");
                String apellido = rs.getString("apellido_cliente");
                String email = rs.getString("email_cliente");
                String telefono = rs.getString("telefono_cliente");
                
                
                huespedes = new Clientes();
                huespedes.setTarjeta(codigo);
                huespedes.setDpi(dpi);
                huespedes.setNombre(nombre);
                huespedes.setApellido(apellido);
                huespedes.setEmail(email);
                huespedes.setTelefono(telefono);
                
                
                metodo.add(huespedes);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        return metodo;
    }
    public Clientes query(Clientes huespedes) {    
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_QUERY);
            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, huespedes.getTarjeta());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("PK_numero_tarjeta");
                String dpi = rs.getString("dpi_cliente");
                String nombre = rs.getString("nombre_cliente");
                String apellido = rs.getString("apellido_cliente");
                String email = rs.getString("email_cliente");
                String telefono = rs.getString("telefono_cliente");
                
                
                huespedes = new Clientes();
                huespedes.setTarjeta(codigo);
                huespedes.setDpi(dpi);
                huespedes.setNombre(nombre);
                huespedes.setApellido(apellido);
                huespedes.setEmail(email);
                huespedes.setTelefono(telefono);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return huespedes;
    }
    
    public int delete(Clientes clientes){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            //System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, clientes.getTarjeta());
            rows = stmt.executeUpdate();
            //System.out.println("Registros eliminados:" + rows);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        return rows;
    }
}
