package core.services;

import java.util.List;

import core.domain.MoneyAccount;
import core.dto.money_account.CreateMoneyAccountDto;
import core.dto.money_account.UpdateMoneyAccountDto;
import core.repository.MoneyAccountRepository;

public class MoneyAccountService {
	MoneyAccountRepository moneyAccountRepository;

	public MoneyAccountService(MoneyAccountRepository moneyAccountRepository) {
		this.moneyAccountRepository = moneyAccountRepository;
	}
	

	public int createMoneyAccount(CreateMoneyAccountDto createMoneyAccountDto) {
		return moneyAccountRepository.createMoneyAccount(createMoneyAccountDto);
	}

	
	public boolean updateMoneyAccount(UpdateMoneyAccountDto updateMoneyAccountDto) {
		return moneyAccountRepository.updateMoneyAccount(updateMoneyAccountDto);
	}

	
	public boolean deleteMoneyAccountById(int id) {
		return moneyAccountRepository.deleteMoneyAccountById(id);
	}

	
	public MoneyAccount findMoneyAccountById(int id) {
		return moneyAccountRepository.findMoneyAccountById(id);
	}

	
	public List<MoneyAccount> getAllMoneyAccountsByUserId(int userId) {
		return moneyAccountRepository.getAllMoneyAccountsByUserId(userId);
	}
	
}
