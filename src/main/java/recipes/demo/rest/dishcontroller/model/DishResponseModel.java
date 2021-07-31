package recipes.demo.rest.dishcontroller.model;

import recipes.demo.repository.dishrepository.entity.Dish;
import recipes.demo.repository.userrepository.entity.User;
import recipes.demo.rest.usercontroller.model.UserRequestModel;
import recipes.demo.rest.usercontroller.model.UserResponseModel;
import recipes.demo.service.userservice.UserService;

import javax.persistence.Id;

public class DishResponseModel {

//    private Long dishId;
//    private String description;
//    private int difficulty;
//    private String dishName;
//    private String imageUrl;
//    private int portion;
//    private int totalTime;
    private UserResponseModel userResponse;
//    private int dishTypeId;
     private Dish dish;

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    private UserService userService;

    public DishResponseModel() {
    }


    public DishResponseModel(Dish dish) {
        this.dish=dish;
//        dishId = dish.getId();
//        description = dish.getDescription();
//        difficulty = dish.getDifficulty();
//        dishName = dish.getDishName();
//        imageUrl = dish.getImageURL();
//        portion = dish.getPortion();
//        totalTime = dish.getTotalTime();
//
        //dish.setUser();
//        User user = userService.getUserById(1l);
//        Long id = user.getId();
//        System.out.println("Id -> " + id);
        //userResponse=new UserResponseModel( userService.getUserById(1l));
        //userId=dish.getUser().getId();
        //dish.getUser(userService.getUserById(dishId));

    }
}
