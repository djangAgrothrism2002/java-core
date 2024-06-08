package Controller;

import Interface.CardRepo;
import Model.Card;

import java.util.List;

public class AtmController implements CardRepo {
    @Override
    public void RegisterCard() {

    }

    @Override
    public void DeleteCard() {

    }

    @Override
    public void ModifyCard() {

    }

    @Override
    public List<Card> ListAllCard() {
        return List.of();
    }

    @Override
    public List<Card> BannedCard() {
        return List.of();
    }

    @Override
    public List<Card> ListCardType(String type) {
        return List.of();
    }

    @Override
    public List<Card> ListMemberCard(String member) {
        return List.of();
    }
}
