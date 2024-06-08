package Interface;

import Model.Account;

import java.util.List;

public interface AccountRepo {
    public void Login(String email, String password);
    public Account DetailAccount(Account account);
    public String RegisterAccount();
    public void DeleteAccount();
    public void ModifyAccount();
    public List<Account> ListAccount(String type);
    public void ModifyPassword();
}
