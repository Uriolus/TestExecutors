package com.uriolus.executors.model;

/**
 * Created by ofernandez on 16/03/2017.
 */

public class Account {
    String accountNumber;
    String accountImport;

    public Account(String accountNumber, String accountImport) {
        this.accountNumber = accountNumber;
        this.accountImport = accountImport;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountImport() {
        return accountImport;
    }

    public void setAccountImport(String accountImport) {
        this.accountImport = accountImport;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountImport='" + accountImport + '\'' +
                '}';
    }
}
