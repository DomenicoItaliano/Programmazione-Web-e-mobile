package it.unirc.pojo.cardBalance;

public interface CardBalanceDAO {
	public CardBalance getCardBalance(CardBalance c);
	public boolean insertCardBalance(CardBalance c);
	public boolean editCardBalance(CardBalance c);
	public boolean deleteCardBalance(CardBalance c);

}