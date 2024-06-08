package Model;

import Util.CardMember;
import Util.CardType;

import java.math.BigInteger;
import java.util.Date;

public class Card {
    private int CardNumber;
    private int CVV;
    private Date ValidDate;
    private CardType Type;
    private CardMember TypeMember;
    private int AmmountDebit = 0;
    private int AmmountCredit = 0;

    public Card(int cardNumber, int CVV, Date validDate, CardType type, CardMember typeMember, int ammountDebit, int ammountCredit) {
        CardNumber = cardNumber;
        this.CVV = CVV;
        ValidDate = validDate;
        Type = type;
        TypeMember = typeMember;
        AmmountDebit = ammountDebit;
        AmmountCredit = ammountCredit;
    }

    public Card() {
    }

    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int cardNumber) {
        CardNumber = cardNumber;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public Date getValidDate() {
        return ValidDate;
    }

    public void setValidDate(Date validDate) {
        ValidDate = validDate;
    }

    public CardType getType() {
        return Type;
    }

    public void setType(CardType type) {
        Type = type;
    }

    public CardMember getTypeMember() {
        return TypeMember;
    }

    public void setTypeMember(CardMember typeMember) {
        TypeMember = typeMember;
    }

    public int getAmmountDebit() {
        return AmmountDebit;
    }

    public void setAmmountDebit(int ammountDebit) {
        AmmountDebit = ammountDebit;
    }

    public int getAmmountCredit() {
        return AmmountCredit;
    }

    public void setAmmountCredit(int ammountCredit) {
        AmmountCredit = ammountCredit;
    }
}
