package bazy_danych;

import java.sql.*;

public class MyFirstJdbcConnection {
    public static void main(String[] args) {
        //przed wysłaniem na sake usunąć hasło
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;user=skaznik;password=************";

        try(Connection con = DriverManager.getConnection(connectionUrl);
            Statement stmt = con.createStatement()) {
            String sql = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " "+rs.getNString("LastName"));
            }
            //System.out.println("Połączono ------------------------------------");
        }catch (SQLException e) {
            System.out.println("Błąd : " + e.getMessage() + " status: "+ e.getSQLState());
        }

    }
}
