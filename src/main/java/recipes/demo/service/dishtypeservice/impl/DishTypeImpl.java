package recipes.demo.service.dishtypeservice.impl;

import org.springframework.stereotype.Service;
import recipes.demo.repository.dishtyperepository.DishTypeRepository;
import recipes.demo.repository.dishtyperepository.entity.DishType;
import recipes.demo.rest.dishtypecontroller.model.DishTypeRequestModel;
import recipes.demo.service.dishtypeservice.DishTypeService;

import java.util.List;
@Service
public class DishTypeImpl implements DishTypeService {

    private final DishTypeRepository dishTypeRepository;

    public DishTypeImpl(DishTypeRepository dishTypeRepository) {
        this.dishTypeRepository = dishTypeRepository;
    }

    @Override
    public DishType postDishType(DishTypeRequestModel dishTypeRequestModel) {
        return null;
    }

    @Override
    public DishType getDishTypeById(Long dishId) {
        return dishTypeRepository.getById(dishId);
    }

    @Override
    public void updateDishType(DishTypeRequestModel dishTypeRequestModel) {

    }

    @Override
    public void deleteDishTypeById(Long dishId) {
        dishTypeRepository.delete(dishTypeRepository.getById(dishId));

    }

    @Override
    public List<DishType> getAllDishTypes() {
        return dishTypeRepository.findAll();
    }
}
