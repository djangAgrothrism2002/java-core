package Model;

import java.sql.Timestamp;

public class Logger {
    private Account Account;
    private String Logging;
    private Timestamp Timestamp;

    public Logger(Model.Account account, String logging, java.sql.Timestamp timestamp) {
        Account = account;
        Logging = logging;
        Timestamp = timestamp;
    }

    public Model.Account getAccount() {
        return Account;
    }

    public void setAccount(Model.Account account) {
        Account = account;
    }

    public String getLogging() {
        return Logging;
    }

    public void setLogging(String logging) {
        Logging = logging;
    }

    public java.sql.Timestamp getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(java.sql.Timestamp timestamp) {
        Timestamp = timestamp;
    }
}
