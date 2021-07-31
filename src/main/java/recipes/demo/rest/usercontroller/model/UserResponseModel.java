package recipes.demo.rest.usercontroller.model;

import recipes.demo.repository.dishrepository.entity.Dish;
import recipes.demo.repository.userrepository.entity.User;

public class UserResponseModel {
//    private Long id;
//    private String userName;
//    private String firstName;
//    private String lastName;
//    private String email;
    private User user;

    public UserResponseModel(User user) {
        this.user=user;
//        id=user.getId();
//        userName=user.getUserName();
//        firstName=user.getFirstName();
//        lastName=user.getLastName();
//        email=user.getEmail();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserResponseModel() {
    }

}
