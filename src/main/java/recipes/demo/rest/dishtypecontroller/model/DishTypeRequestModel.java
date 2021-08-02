package recipes.demo.rest.dishtypecontroller.model;

import recipes.demo.repository.dishtyperepository.entity.DishType;

public class DishTypeRequestModel {
   private DishType dishType;

    public DishTypeRequestModel() {
    }

    public DishTypeRequestModel(DishType dishType) {
        this.dishType = dishType;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }
}
