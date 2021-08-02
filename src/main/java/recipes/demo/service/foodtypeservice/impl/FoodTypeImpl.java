package recipes.demo.service.foodtypeservice.impl;

import org.springframework.stereotype.Service;
import recipes.demo.repository.foodtyperepository.FoodTypeRepository;
import recipes.demo.repository.foodtyperepository.entity.FoodType;
import recipes.demo.rest.foodtypecontroller.model.FoodTypeRequestModel;
import recipes.demo.service.foodtypeservice.FoodTypeService;

import java.util.List;

@Service
public class FoodTypeImpl implements FoodTypeService {

    private final FoodTypeRepository foodTypeRepository ;

    public FoodTypeImpl(FoodTypeRepository foodTypeRepository) {
        this.foodTypeRepository = foodTypeRepository;
    }

    @Override
    public FoodType postFoodType(FoodTypeRequestModel foodTypeRequestModel) {
        return null;
    }

    @Override
    public FoodType getFoodTypeById(Long tagId) {
        return foodTypeRepository.getById(tagId);
    }

    @Override
    public void updateFoodType(FoodTypeRequestModel foodTypeRequestModel) {

    }


    @Override
    public void deleteFoodTypeById(Long dishId) {
        foodTypeRepository.delete(foodTypeRepository.getById(dishId));
    }

    @Override
    public List<FoodType> getAllFoodTypes() {
        return foodTypeRepository.findAll();
    }
}
