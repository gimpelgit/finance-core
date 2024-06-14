package core.dto.category;

import core.domain.TransactionType;

public class CreateCategoryDto {
	public int             userId;
	public String          name;
	public TransactionType type;

	public CreateCategoryDto(
		int userId,
		String name,
		TransactionType type)
	{
		this.userId = userId;
		this.name = name;
		this.type = type;
	}
}
