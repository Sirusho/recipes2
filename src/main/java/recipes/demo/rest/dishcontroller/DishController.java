package recipes.demo.rest.dishcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recipes.demo.rest.dishcontroller.model.DishRequestModel;
import recipes.demo.repository.dishrepository.entity.Dish;
import recipes.demo.rest.dishcontroller.model.DishResponseModel;
import recipes.demo.service.dishservice.DishService;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/dish")
public class DishController {

    private final DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @PostMapping
    public ResponseEntity<DishResponseModel> postDish(@RequestBody final DishRequestModel dishRequestModel) {
        dishService.postDish(dishRequestModel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<DishResponseModel>> getAllDishes() {
        List<Dish> allDishes = dishService.getAllDishes();
        List<DishResponseModel> dishes = getDishResponseModels(allDishes);
        return new ResponseEntity<>(dishes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DishResponseModel> getDishById(@PathVariable("id") Long dishId) {
        //System.out.println("Id in the GetMapping -> " + dishId);
        return new ResponseEntity<>(new DishResponseModel(dishService.getDishById(dishId)), HttpStatus.OK);
    }
    @GetMapping("/searchByDifficulty/{difficulty}")
    public ResponseEntity<List<DishResponseModel>> getDishByDifficulty(@PathVariable("difficulty") int difficulty) {
        List<Dish> allDishes = dishService.getDishByDifficulty(difficulty);
        List<DishResponseModel> dishes = getDishResponseModels(allDishes);
        return new ResponseEntity<>(dishes, HttpStatus.OK);
    }
    @GetMapping("/searchByTag/{tag}")
    public ResponseEntity<List<DishResponseModel>> getDishByTag(@PathVariable("tag") Long tag) {
        List<Dish> allDishes = dishService.getDishByTag(tag);
        List<DishResponseModel> dishes = getDishResponseModels(allDishes);
        return new ResponseEntity<>(dishes, HttpStatus.OK);
    }
    @GetMapping("/searchByName/{name}")
    public ResponseEntity<List<DishResponseModel>> getDishByName(@PathVariable("name") String name) {
        List<Dish> allDishes = dishService.getDishByName(name);
        List<DishResponseModel> dishes = getDishResponseModels(allDishes);
        return new ResponseEntity<>(dishes, HttpStatus.OK);
    }




    private List<DishResponseModel> getDishResponseModels(List<Dish> allDishes) {
        List<DishResponseModel> dishes = new ArrayList<>();
        for (Dish dish : allDishes) {
            dishes.add(new DishResponseModel(dish));
        }
        return dishes;
    }



    /*
    @GetMapping("/hello")
ResponseEntity<String> hello() {
    return new ResponseEntity<>("Hello World!", HttpStatus.OK);
}
     */

    @PutMapping
    public ResponseEntity<?> updateDish(@RequestBody DishRequestModel dishRequestModel) {
        try {
            dishService.updateDish(dishRequestModel);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException ex) {
            // log the error message
            System.out.println(ex.getMessage());
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete user record
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDish(@PathVariable Long id) {
        try {
            dishService.deleteDishById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException ex) {
            // log the error message
            System.out.println(ex.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
