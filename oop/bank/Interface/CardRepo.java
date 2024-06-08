package Interface;

import Model.Account;
import Model.Card;

import java.util.List;

public interface CardRepo {
    public void RegisterCard();
    public void DeleteCard();
    public void ModifyCard();
    public List<Card> ListAllCard();
    public List<Card> BannedCard();
    public List<Card> ListCardType(String type);
    public List<Card> ListMemberCard(String member);
}
