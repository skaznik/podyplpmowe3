package bazy_danych.lab19;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.sql.*;
import java.text.NumberFormat;

public class Employe {

    public static final String GET_10_EMPLOYE_SQL ="select top 10 FirstName, LastName from AdventureWorks.Person.Contact where LastName = 'Anderson'";
    public static final String GET_JOBTITLE_SQL = "select distinct(Title) as JobTitle from AdventureWorks.HumanResources.Employee";
    public static final String GET_SUMMARY_SQL = "SELECT SUM(Am) AS suma FROM budget.BudgetEntries";

    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;databaseName=AdventureWorks;user=skaznik;password=***********";
        try (Connection con = DriverManager.getConnection(connectionUrl);
             Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(GET_10_EMPLOYE_SQL);
            while (rs.next()) {
                System.out.print(rs.getString("FirstName") + " " + rs.getString("LastName")+ " ; ");
            }
            ResultSet rs1 = stmt.executeQuery(GET_JOBTITLE_SQL);
            while (rs1.next()) {
                System.out.println(rs1.getString("JobTitle") + " ; ");
            }

        } catch (SQLException e) {
            System.out.println("Błąd : " + e.getMessage());
        }
    }





}
