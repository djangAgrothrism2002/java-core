package Model;

import Util.SavingType;

import java.math.BigInteger;
import java.util.Date;

public class BankDeposit {
    private BigInteger DepositId;
    private Account AccountDeposit;
    private int PrincipalAmount;
    private int EarningAmount;
    private int TotalAmount;
    private Date Date;
    private SavingType Type;
    private String Contents;

    public BankDeposit(BigInteger depositId, int principalAmount, int earningAmount, int totalAmount, java.util.Date date, SavingType type, String contents, Account accountDeposit) {
        DepositId = depositId;
        PrincipalAmount = principalAmount;
        EarningAmount = earningAmount;
        TotalAmount = totalAmount;
        Date = date;
        Type = type;
        Contents = contents;
        AccountDeposit = accountDeposit;
    }

    public BigInteger getDepositId() {
        return DepositId;
    }

    public void setDepositId(BigInteger depositId) {
        DepositId = depositId;
    }

    public int getPrincipalAmount() {
        return PrincipalAmount;
    }

    public void setPrincipalAmount(int principalAmount) {
        PrincipalAmount = principalAmount;
    }

    public int getEarningAmount() {
        return EarningAmount;
    }

    public void setEarningAmount(int earningAmount) {
        EarningAmount = earningAmount;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public SavingType getType() {
        return Type;
    }

    public void setType(SavingType type) {
        Type = type;
    }

    public String getContents() {
        return Contents;
    }

    public void setContents(String contents) {
        Contents = contents;
    }
}
