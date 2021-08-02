package recipes.demo.rest.usercontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recipes.demo.repository.userrepository.entity.User;
import recipes.demo.rest.usercontroller.model.UserRequestModel;
import recipes.demo.rest.usercontroller.model.UserResponseModel;
import recipes.demo.service.userservice.UserService;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponseModel> createUser(@RequestBody final UserRequestModel userRequestModel) {

        System.out.println("REACHED " + userRequestModel.getUser().getFirstName());
        userService.postUser(userRequestModel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<UserResponseModel>> getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        List<UserResponseModel> users = new ArrayList<>();
        for (User user : allUsers) {
            users.add(new UserResponseModel(user));
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseModel> getUserById(@PathVariable("id") Long userId) {
        System.out.println("Id in the GetMapping -> " + userId);
        return new ResponseEntity<>(new UserResponseModel(userService.getUserById(userId)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDish(@PathVariable Long id) {
        try {
            userService.deleteUserById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException ex) {
            // log the error message
            System.out.println(ex.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

