package recipes.demo.rest.foodtypecontroller.model;

import recipes.demo.repository.foodtyperepository.entity.FoodType;

public class FoodTypeRequestModel {
    private FoodType foodType;

    public FoodTypeRequestModel(FoodType foodType) {
        this.foodType = foodType;
    }

    public FoodTypeRequestModel() {
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }
}
