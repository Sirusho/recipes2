package recipes.demo.rest.dishcontroller.model;

import recipes.demo.repository.dishrepository.entity.Dish;

public class DishRequestModel {
    //    private Long dishId;
//    private String description;
//    private int difficulty;
//    private String dishName;
//    private String imageUrl;
//    private int portion;
//    private int totalTime;
//    private int dishTypeId;
//    private int userId;
    private Dish dish;

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public DishRequestModel(Dish dish) {
        this.dish=dish;
    }

    public DishRequestModel() {
    }
}
