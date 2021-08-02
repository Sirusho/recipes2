package recipes.demo.service.dishtypeservice;

import org.springframework.stereotype.Service;
import recipes.demo.repository.dishtyperepository.entity.DishType;
import recipes.demo.rest.dishtypecontroller.model.DishTypeRequestModel;

import java.util.List;


public interface DishTypeService {
    DishType postDishType(DishTypeRequestModel dishTypeRequestModel);

    DishType getDishTypeById(Long tagId);

    void updateDishType(DishTypeRequestModel dishTypeRequestModel);

    void deleteDishTypeById(Long dishId);

    List<DishType> getAllDishTypes();
}
