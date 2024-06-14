package core.services;

import java.util.List;

import core.domain.User;
import core.dto.user.CreateUserDto;
import core.dto.user.UpdateUserDto;
import core.repository.UserRepository;

public class UserService{
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public int createUser(CreateUserDto createUserDto) {
		return userRepository.createUser(createUserDto);
	}

	public boolean updateUser(UpdateUserDto updateUserDto) {
		return userRepository.updateUser(updateUserDto);
	}
	
	public boolean deleteUserById(int id) {
		return userRepository.deleteUserById(id);
	}
	
	public User findUserById(int id) {
		return userRepository.findUserById(id);
	}

	public User findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}
	
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}   
}
