package recipes.demo.rest.foodtypecontroller.model;

import recipes.demo.repository.foodtyperepository.entity.FoodType;

public class FoodTypeResponseModel {
    private FoodType foodType;

    public FoodTypeResponseModel(FoodType foodType) {
        this.foodType = foodType;
    }

    public FoodTypeResponseModel() {
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }


}
