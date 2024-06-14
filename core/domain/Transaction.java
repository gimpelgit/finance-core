package core.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {
	private int             id;
	private int             userId;
	private int             categoryId;
	private int             moneyAccountId;
	private BigDecimal      amount;
	private Date            date;
	private String          description;
	private TransactionType type;

	public Transaction(
		int id,
		int userId,
		int categoryId,
		int moneyAccountId,
		BigDecimal amount,
		Date date,
		String description,
		TransactionType type)
	{
		this.id = id;
		this.userId = userId;
		this.categoryId = categoryId;
		this.moneyAccountId = moneyAccountId;
		this.amount = amount;
		this.date = date;
		this.description = description;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getMoneyAccountId() {
		return moneyAccountId;
	}

	public void setMoneyAccountId(int moneyAccountId) {
		this.moneyAccountId = moneyAccountId;
	}


	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}


	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}
}
