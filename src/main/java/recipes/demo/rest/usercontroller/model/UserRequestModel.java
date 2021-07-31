package recipes.demo.rest.usercontroller.model;

import recipes.demo.repository.userrepository.entity.User;

public class UserRequestModel {
//    private Long id;
//    private String userName;
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String password;

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserRequestModel(User user) {
        this.user = user;
    }

    public UserRequestModel() {
    }
}
