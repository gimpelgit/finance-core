package core.domain;


public class Category {
	private int             id;
	private int             userId;
	private String          name;
	private TransactionType type;

	public Category(
		int id,
		int userId,
		String name,
		TransactionType type)
	{
		this.id = id;
		this.userId = userId;
		this.name = name;
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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return name;
	}
}
