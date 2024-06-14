package core.dto.transaction;

import java.math.BigDecimal;
import java.util.Date;

import core.domain.TransactionType;

public class CreateTransactionDto {
	public int             userId;
	public int             categoryId;
	public int             moneyAccountId;
	public BigDecimal      amount;
	public Date            date;
	public String          description;
	public TransactionType type;

	public CreateTransactionDto(
		int userId,
		int categoryId,
		int moneyAccountId,
		BigDecimal amount,
		Date date,
		String description,
		TransactionType type)
	{
		this.userId = userId;
		this.categoryId = categoryId;
		this.moneyAccountId = moneyAccountId;
		this.amount = amount;
		this.date = date;
		this.description = description;
		this.type = type;
	}
}
