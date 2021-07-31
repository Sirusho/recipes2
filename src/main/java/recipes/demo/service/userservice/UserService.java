package recipes.demo.service.userservice;

import recipes.demo.repository.userrepository.entity.User;

import recipes.demo.rest.usercontroller.model.UserRequestModel;

import java.util.List;

public interface UserService {
    User postUser(UserRequestModel userRequest);

    void updateUser(UserRequestModel userRequestModel);

    void deleteUserById(Long userId);

    User getUserById(Long userId);

    List<User> getAllUsers();
}
