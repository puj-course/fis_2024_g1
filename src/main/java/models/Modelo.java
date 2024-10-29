package models;

import db.DBConnection;

public class Modelo {
  private static DBConnection conexionDB;

  static {
    conexionDB = new DBConnection();
  }

  public static void saveClient(Cliente cliente) {
    conexionDB.insertClient(cliente.scriptInsertarSQL());
  }

}
