package bazy_danych.budget;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.sun.jdi.PathSearchingVirtualMachine;

import java.math.BigDecimal;
import java.sql.*;

public class HomeBudget {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "skaznik";
    private static final String DB_PASS = "************";
    private static final String DB_NAME = "skaznik";

    public static final String INSERT_ENTRY_SQL ="INSERT INTO budget.BudgetEntries (EntryName, Amount) VALUES (?, ?)";
    public static final String GET_ALL_ENTRIES_SQL = "SELECT * FROM budget.BudgetEntries";
    public static final String GET_SUM_SQL = "SELECT SUM(Amount) AS suma FROM budget.BudgetEntries";

    public static void main(String[] args) {
        BudgetEntry be = new BudgetEntry();
        be.setEntryName(args[0]);
        be.setAmount(new BigDecimal(args[1]));
        HomeBudget hb = new HomeBudget();
        try (Connection con = hb.connect(DB_USER, DB_PASS, DB_NAME);
             Statement stmt = con.createStatement()) {
            PreparedStatement ps = con.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1, be.getEntryName());
            ps.setBigDecimal(2, be.getAmount());
            ps.execute();

        } catch (SQLException e) {
            System.out.println("Błąd : " + e.getMessage());
        }
    }

    private Connection connect(String username, String password, String dbName) throws SQLServerException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(username);
        ds.setPassword(password);
        ds.setDatabaseName(dbName);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        return ds.getConnection();

    }

}
