package core.dto.money_account;

public class CreateMoneyAccountDto {
	public int    userId;
	public String name;
	public String currency;

	public CreateMoneyAccountDto(
		int userId,
		String name,
		String currency) 
	{
		this.userId = userId;
		this.name = name;
		this.currency = currency;
	}
}
