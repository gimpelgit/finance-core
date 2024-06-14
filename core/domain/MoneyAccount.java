package core.domain;

public class MoneyAccount {
	private int    id;
	private int    userId;
	private String name;
	private String currency;

	public MoneyAccount(
		int id,
		int userId,
		String name,
		String currency) 
	{
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.currency = currency;
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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return name + " (" + currency + ")";
	}
}
