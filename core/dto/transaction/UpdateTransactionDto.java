package core.dto.transaction;

import java.math.BigDecimal;
import java.util.Date;

import core.domain.TransactionType;

public class UpdateTransactionDto {
	public int             id;
	public int             categoryId;
	public BigDecimal      amount;
	public Date            date;
	public String          description;
	public TransactionType type;

	public UpdateTransactionDto(
		int id,
		int categoryId,
		BigDecimal amount,
		Date date,
		String description,
		TransactionType type)
	{
		this.id = id;
		this.categoryId = categoryId;
		this.amount = amount;
		this.date = date;
		this.description = description;
		this.type = type;
	}
}
