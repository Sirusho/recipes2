package recipes.demo.service.foodtypeservice.impl;

import org.springframework.stereotype.Service;
import recipes.demo.repository.foodtyperepository.entity.FoodType;
import recipes.demo.rest.foodtypecontroller.model.FoodTypeRequestModel;
import recipes.demo.service.foodtypeservice.FoodTypeService;

import java.util.List;

@Service
public class FoodTypeServiceImpl implements FoodTypeService {
    @Override
    public FoodType postFoodType(FoodTypeRequestModel foodTypeRequestModel) {
        return null;
    }

    @Override
    public FoodType getFoodTypeById(Long tagId) {
        return null;
    }

    @Override
    public void updateFoodType(FoodTypeRequestModel foodTypeRequestModel) {

    }


    @Override
    public void deleteFoodTypeById(Long dishId) {

    }

    @Override
    public List<FoodType> getAllFoodTypes() {
        return null;
    }
}
