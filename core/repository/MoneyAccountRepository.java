package core.repository;

import java.util.List;

import core.domain.MoneyAccount;
import core.dto.money_account.CreateMoneyAccountDto;
import core.dto.money_account.UpdateMoneyAccountDto;

public interface MoneyAccountRepository {
	int  createMoneyAccount(CreateMoneyAccountDto createMoneyAccountDto);
	boolean  updateMoneyAccount(UpdateMoneyAccountDto updateMoneyAccountDto);
	boolean  deleteMoneyAccountById(int id);
	MoneyAccount findMoneyAccountById(int id);
	List<MoneyAccount> getAllMoneyAccountsByUserId(int userId);
}
