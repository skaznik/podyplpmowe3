package bazy_danych.budget;

import java.math.BigDecimal;
import java.util.Date;

public class BudgetEntry {

   private String entryName;
    private BigDecimal amount;



    public String getEntryName() {
        return entryName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        BudgetEntry budgetEntry = new BudgetEntry();
        System.out.println(budgetEntry);
    }
}
