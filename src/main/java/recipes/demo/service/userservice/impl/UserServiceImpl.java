package recipes.demo.service.userservice.impl;

import org.springframework.stereotype.Service;
import recipes.demo.repository.userrepository.UserRepository;
import recipes.demo.repository.userrepository.entity.User;
import recipes.demo.rest.usercontroller.model.UserRequestModel;
import recipes.demo.service.userservice.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User postUser(UserRequestModel userRequest) {
        return userRepository.save(userRequest.getUser());
    }

    @Override
    public void updateUser(UserRequestModel userRequestModel) {

    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.delete(userRepository.getById(userId));
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.getById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
