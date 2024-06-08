package Model;

import Model.Abstract.User;
import Util.AccountType;
import Util.Role;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account extends User {
    private BigInteger AccountNumber;
    private Date ReleaseDate;
    private BigInteger Amount;
    private List<Card> AtmCard = new ArrayList<>() {} ;
    private Role UserRole = Role.USER;
    private AccountType accountType;

    public Account(BigInteger accountNumber, Date releaseDate, BigInteger amount, List<Card> atmCard, int role) {
        AccountNumber = accountNumber;
        ReleaseDate = releaseDate;
        Amount = amount;
        AtmCard = atmCard;
        UserRole = role == 1 ? Role.STAFF : Role.USER;
    }

    public Account(){

    }

    public Account(BigInteger userCard, String email, String address, String phoneNumber, int age, int gender, BigInteger accountNumber, Date releaseDate, BigInteger amount, List<Card> atmCard, String password, int role) {
        super(userCard, email, address, phoneNumber, age, gender, password);
        AccountNumber = accountNumber;
        ReleaseDate = releaseDate;
        Amount = amount;
        AtmCard = atmCard;
        UserRole = role == 1 ? Role.STAFF : Role.USER;
    }

    public BigInteger getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(BigInteger accountNumber) {
        AccountNumber = accountNumber;
    }

    public Date getReleaseDate() {
        return ReleaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        ReleaseDate = releaseDate;
    }

    public BigInteger getAmount() {
        return Amount;
    }

    public void setAmount(BigInteger amount) {
        Amount = amount;
    }

    public List<Card> getAtmCard() {
        return AtmCard;
    }

    public void setAtmCard(List<Card> atmCard) {
        AtmCard = atmCard;
    }

    public Role getUserRole() {
        return UserRole;
    }

    public void setUserRole(int role) {
        UserRole = role == 1 ? Role.STAFF : Role.USER;
    }
}
