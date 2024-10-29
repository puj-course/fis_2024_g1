package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Cliente;

public class DBConnection {
  private Connection conexion;
  private String url;
  private String username;
  private String password;

  public DBConnection(){
    this.url = "jdbc:mysql//127.0.0.1:3306";
    this.username = "root";
    this.password = "";
    try{
      conexion = DriverManager.getConnection(this.url, this.username, this.password);
    }catch(SQLException e){
      e.printStackTrace();
    }
  }

  public boolean getAllClients(){
    try{
      String query = "SELECT * FROM cliente";
      Statement statement = this.conexion.createStatement();
      ResultSet result = statement.executeQuery(query);

      while(result.next()){
        //get info
      }
      return true;
    }catch(SQLException e){
      e.printStackTrace();
    }
    return false;
  }

  public boolean insertClient(String query) {
    try{
      Statement statement = this.conexion.createStatement();
      ResultSet result = statement.executeQuery(query);

      

      return true;
    }catch(SQLException e){
      e.printStackTrace();
    }
    return false;
  }
}
