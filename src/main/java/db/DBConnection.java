package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import models.Cliente;

public class DBConnection {
  Connection cn;
  String url;
  String username;
  String password;
  public DBConnection(){
    this.url = "jdbc:mysql//127.0.0.1:3306";
    this.username = "root";
    this.password = "";
    try{
      cn = DriverManager.getConnection(this.url, this.username, this.password);
    }catch(SQLException e){
      e.printStackTrace();
    }
  }

  public void getAllClients(){
    try{
      String query = "SELECT * FROM cliente";
      Statement statement = this.cn.createStatement();
      ResultSet result = statement.executeQuery(query);

      while(result.next()){
        //get info
      }

    }catch(SQLException e){
      e.printStackTrace();
    }
  }

}
