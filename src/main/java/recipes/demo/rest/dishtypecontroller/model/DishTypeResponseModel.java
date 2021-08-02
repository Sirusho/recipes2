package recipes.demo.rest.dishtypecontroller.model;

import recipes.demo.repository.dishtyperepository.entity.DishType;

public class DishTypeResponseModel {

    private DishType dishType;

    public DishTypeResponseModel(DishType dishType) {
        this.dishType = dishType;
    }

    public DishTypeResponseModel() {
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }
}
