package Model;

import java.util.Date;

public class Loan {
    private int LoanId;
    private int Amount;
    private Account AccountVerified;
    private Account StaffVerified;
    private Date VerifyDate;
    private Boolean Verfied;

    public Loan(int loanId, int amount, Account accountVerified, Account staffVerified, Date verifyDate, Boolean verfied) {
        LoanId = loanId;
        Amount = amount;
        AccountVerified = accountVerified;
        StaffVerified = staffVerified;
        VerifyDate = verifyDate;
        Verfied = verfied;
    }
}
