/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *
 * @author Edgar
 */
public class Database {
    private String user;
    private String password;
    private String driver;
    private String url;
    
    public Database() {
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/EMP0391";
        this.user="root";
        this.password="";
    }
    
}

