package recipes.demo.service.dishservice;

import recipes.demo.rest.dishcontroller.model.DishRequestModel;
import recipes.demo.repository.dishrepository.entity.Dish;

import java.util.List;

public interface DishService {

    Dish postDish(DishRequestModel dishRequest);

    Dish getDishById(Long dishId);

    void updateDish(DishRequestModel dishRequestModel);

    void deleteDishById(Long dishId);

    List<Dish> getAllDishes();

    List<Dish> getDishByDifficulty(int difficulty);

    List<Dish> getDishByTag(Long tag);

    List<Dish> getDishByName(String name);




}
