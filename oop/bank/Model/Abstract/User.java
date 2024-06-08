package Model.Abstract;

import Util.Gender;

import java.math.BigInteger;

import static Util.Gender.FEMALE;
import static Util.Gender.MALE;

public abstract class User {
    private BigInteger UserCard;
    private String Email;
    private String Address;
    private String PhoneNumber;
    private int Age;
    private Util.Gender Gender;
    private String Password;

    public User() {
    }

    public User(BigInteger userCard, String email, String address, String phoneNumber, int age, int gender, String password ) {
        UserCard = userCard;
        Email = email;
        Address = address;
        PhoneNumber = phoneNumber;
        Age = age;
        Gender = gender == 1 ? MALE : FEMALE;
        Password = password;
    }

    public BigInteger getUserCard() {
        return UserCard;
    }

    public void setUserCard(BigInteger userCard) {
        UserCard = userCard;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Util.Gender getGender() {
        return Gender;
    }

    public void setGender(int gender) {
        if (gender == 1){
            Gender = MALE;
        } else {
            Gender = FEMALE;
        }
    }
}
