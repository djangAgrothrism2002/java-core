package Controller;

import Interface.AccountRepo;
import Model.Account;

import java.util.List;

public class AccountController implements  AccountRepo{


    @Override
    public void Login(String email, String password) {

    }

    @Override
    public Account DetailAccount(Account account) {
        return null;
    }

    @Override
    public String RegisterAccount() {
        return null;
    }

    @Override
    public void DeleteAccount() {

    }

    @Override
    public void ModifyAccount() {

    }

    @Override
    public List<Account> ListAccount(String type) {
        return List.of();
    }

    @Override
    public void ModifyPassword() {

    }
}
