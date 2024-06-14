package core.repository;

import java.util.List;

import core.domain.User;
import core.dto.user.CreateUserDto;
import core.dto.user.UpdateUserDto;

public interface UserRepository {
	int  createUser(CreateUserDto createUserDto);
	boolean  updateUser(UpdateUserDto updateUserDto);
	boolean  deleteUserById(int id);
	User findUserById(int id);
	User findUserByEmail(String email);
	List<User> getAllUser();
}
