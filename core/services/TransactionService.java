package core.services;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import core.domain.Transaction;
import core.domain.TransactionType;
import core.dto.transaction.CreateTransactionDto;
import core.dto.transaction.UpdateTransactionDto;
import core.repository.TransactionRepository;


public class TransactionService {
	TransactionRepository transactionRepository;

	public TransactionService(TransactionRepository transactionRepository) {
		this.transactionRepository = transactionRepository;
	}
	

	public int createTransaction(CreateTransactionDto createTransactionDto) {
		return transactionRepository.createTransaction(createTransactionDto);
	}


	public boolean updateTransaction(UpdateTransactionDto updateTransactionDto) {
		return transactionRepository.updateTransaction(updateTransactionDto);
	}

	
	public boolean deleteTransactionById(int id) {
		return transactionRepository.deleteTransactionById(id);    
	}

	
	public Transaction findTransactionById(int id) {
		return transactionRepository.findTransactionById(id);
	}

	
	public List<Transaction> getAllTransactionsByUserId(int userId) {
		return transactionRepository.getAllTransactionsByUserId(userId);    
	}

	
	public List<Transaction> getAllTransactionsByMoneyAccountId(int moneyAccountId) {
		return transactionRepository.getAllTransactionsByMoneyAccountId(moneyAccountId);
	}

	
	public List<Transaction> getAllTransactionsByDate(int moneyAccountId, Date start, Date end) {
		return transactionRepository.getAllTransactionsByDate(moneyAccountId, start, end);    
	}

	public List<Transaction> getAllIncomeTransactionsByDate(int moneyAccountId, Date start, Date end) {
		var allTransactions = transactionRepository.getAllTransactionsByDate(moneyAccountId, start, end);
		return getTransactionsByType(allTransactions, TransactionType.INCOME);
	}


	public List<Transaction> getAllExpenseTransactionsByDate(int moneyAccountId, Date start, Date end) {
		var allTransactions = transactionRepository.getAllTransactionsByDate(moneyAccountId, start, end);
		return getTransactionsByType(allTransactions, TransactionType.EXPENSE);
	}


	public BigDecimal getTotalSumByMoneyAccount(int moneyAccountId) {
		var allTransactions = transactionRepository.getAllTransactionsByMoneyAccountId(moneyAccountId);
		BigDecimal totalSum = BigDecimal.ZERO;
		for (var transaction : allTransactions) {
			if (transaction.getType() == TransactionType.EXPENSE) {
				totalSum = totalSum.subtract(transaction.getAmount());
			} else {
				totalSum = totalSum.add(transaction.getAmount());
			}
		}
		// BigDecimal totalSum = allTransactions.stream()
		// 	.filter(transaction -> transaction.getType() == TransactionType.INCOME)
		// 	.map(transaction -> transaction.getAmount()) 
		// 	.reduce(BigDecimal.ZERO, BigDecimal::add);
		return totalSum;
	}

	// private BigDecimal getTotalSumByMoneyAccount(int moneyAccountId, TransactionType type) {

	// }
	
	private List<Transaction> getTransactionsByType(List<Transaction> transactions, TransactionType type) {
		return transactions.stream()
			.filter(transaction -> transaction.getType() == type)
			.collect(Collectors.toList());
	}

	public boolean updateAllTransactionsByCategoryId(int oldCategoryId, int newCategoryId) {
		return transactionRepository.updateAllTransactionsByCategoryId(oldCategoryId, newCategoryId);
	}

	public boolean deleteAllTransactionsByCategoryId(int categoryId) {
		return transactionRepository.deleteAllTransactionsByCategoryId(categoryId);
	}

	public boolean updateAllTransactionsByMoneyAccountId(int oldMoneyAccountId, int newMoneyAccountId) {
		return transactionRepository.updateAllTransactionsByMoneyAccountId(oldMoneyAccountId, newMoneyAccountId);
	}
}
