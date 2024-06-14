package core.dto.money_account;

public class UpdateMoneyAccountDto {
	public int    id;
	public String name;

	public UpdateMoneyAccountDto(
		int id,
		String name) 
	{
		this.id = id;
		this.name = name;
	}
}
