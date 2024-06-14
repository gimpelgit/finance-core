package core.dto.user;

public class UpdateUserDto {
	public int    id;
	public String name;
	public String email;
	public String password;

	public UpdateUserDto(
		int id,
		String name,
		String email,
		String password) 
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
}
