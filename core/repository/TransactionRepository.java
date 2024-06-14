package core.repository;

import java.util.Date;
import java.util.List;

import core.domain.Transaction;
import core.dto.transaction.CreateTransactionDto;
import core.dto.transaction.UpdateTransactionDto;

public interface TransactionRepository {
	int createTransaction(CreateTransactionDto createTransactionDto);
	boolean updateTransaction(UpdateTransactionDto updateTransactionDto);
	boolean deleteTransactionById(int id);
	Transaction findTransactionById(int id);
	List<Transaction> getAllTransactionsByUserId(int userId);
	List<Transaction> getAllTransactionsByMoneyAccountId(int moneyAccountId);
	List<Transaction> getAllTransactionsByDate(int moneyAccountId, Date start, Date end);
	boolean updateAllTransactionsByCategoryId(int oldCategoryId, int newCategoryId);
	boolean deleteAllTransactionsByCategoryId(int categoryId);
	boolean updateAllTransactionsByMoneyAccountId(int oldMoneyAccountId, int newMoneyAccountId);
}
