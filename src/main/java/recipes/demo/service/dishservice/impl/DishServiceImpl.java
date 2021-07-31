package recipes.demo.service.dishservice.impl;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import recipes.demo.rest.dishcontroller.model.DishRequestModel;
import recipes.demo.repository.dishrepository.entity.Dish;
import recipes.demo.repository.DishRepository;
import recipes.demo.service.dishservice.DishService;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    private final DishRepository repository;

    public DishServiceImpl(DishRepository repository) {
        this.repository = repository;
    }

//    public Dish buildDishFromRequestModel(DishRequestModel dishRequestModel){
//        final Dish dish=new Dish();
//        dish.setDescription(dishRequestModel.getDescription());
//        dish.setDifficulty(dishRequestModel.getDifficulty());
//        dish.setDishName(dishRequestModel.getDishName());
//        dish.setImageURL(dishRequestModel.getImageUrl());
//        dish.setPortion(dishRequestModel.getPortion());
//        dish.setTotalTime(dishRequestModel.getTotalTime());
//        return dish;
//    }

    @Override
    public Dish postDish(DishRequestModel dishRequest) {
        return repository.save(dishRequest.getDish());
    }

    @Override
    public Dish getDishById(Long dishId) {
        return repository.findById(dishId).get();
    }
    @Override
    public List<Dish> getAllDishes(){
        return repository.findAll();
    }

    @Override
    public void updateDish(DishRequestModel dish) {
       // repository.save(dish);
    }

    @Override
    public void deleteDishById(Long dishId) {
        try {
            repository.deleteById(dishId);
        }catch(DataAccessException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
}
