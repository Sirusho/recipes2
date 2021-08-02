package recipes.demo.service.foodtypeservice;

import recipes.demo.repository.foodtyperepository.entity.FoodType;
import recipes.demo.rest.foodtypecontroller.model.FoodTypeRequestModel;

import java.util.List;

public interface FoodTypeService {

    FoodType postFoodType(FoodTypeRequestModel foodTypeRequestModel);

    FoodType getFoodTypeById(Long foodTypeId);

    void updateFoodType(FoodTypeRequestModel foodTypeRequestModel);

    void deleteFoodTypeById(Long foodTypeId);

    List<FoodType> getAllFoodTypes();
}
