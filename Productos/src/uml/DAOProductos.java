/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Edgar
 */
public class DAOProductos {
    Database db = new Database();
    Productos pro = new Productos();
    
    public ArrayList<Object[]> mostrar(){
        
        ArrayList<Object[]> datos = new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        ResultSetMetaData meta;
        
        String sql = "select * from productos";
        try {
            
            Class.forName(db.getDriver());
            
            con = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword());
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            meta = rs.getMetaData();
            
            while(rs.next()){
                Object[] fila = new Object[meta.getColumnCount()];
                
                for (int i = 0; i < fila.length; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                
                datos.add(fila);
            }
            rs.close();
        } catch (Exception e) {
        }
        return datos;
    }
    
    
}
