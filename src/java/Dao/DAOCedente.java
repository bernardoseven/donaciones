/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Modelo.Cedente;

/**
 *
 * @author bernardo
 */
public class DAOCedente extends ConDB{
    public void AgregarCedente(Cedente cli) {
        Connection con;
        try {
            con = this.getConexion();
            //Generar Sql de Inserción
            String strSQL = "Insert into cedente (rut,nombre,rubro) values (?,?,?)";
            PreparedStatement ps = con.prepareStatement(strSQL);
            //definición de parametros
            
            ps.setInt(1, cli.getRut());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getRubro());
            ps.executeQuery();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAOCedente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}