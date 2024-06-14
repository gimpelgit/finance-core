package core.dto.category;

public class UpdateCategoryDto {
	public int    id;
	public String name;

	public UpdateCategoryDto(
		int id,
		String name)
	{
		this.id = id;
		this.name = name;
	}
}
