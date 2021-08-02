package recipes.demo.rest.foodtypecontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recipes.demo.repository.dishtyperepository.entity.DishType;
import recipes.demo.repository.foodtyperepository.entity.FoodType;
import recipes.demo.rest.dishtypecontroller.model.DishTypeResponseModel;
import recipes.demo.rest.foodtypecontroller.model.FoodTypeResponseModel;
import recipes.demo.service.foodtypeservice.FoodTypeService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/food/type")
public class FoodTypeController {
    private final FoodTypeService foodTypeService;

    public FoodTypeController(FoodTypeService foodTypeService) {
        this.foodTypeService = foodTypeService;
    }

    @GetMapping
    public ResponseEntity<List<FoodTypeResponseModel>> getAllFoodTypes() {
        List<FoodType> allFoodTypes = foodTypeService.getAllFoodTypes();
        List<FoodTypeResponseModel> foodTypeResponseModels = new ArrayList<>();
        for (FoodType foodType : allFoodTypes) {
            foodTypeResponseModels.add(new FoodTypeResponseModel(foodType));
        }
        return new ResponseEntity<>(foodTypeResponseModels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FoodTypeResponseModel> getFoodTypeById(@PathVariable("id") Long foodTypeId) {
        //System.out.println("Id in the GetMapping -> " + dishId);
        return new ResponseEntity<>(new FoodTypeResponseModel(foodTypeService.getFoodTypeById(foodTypeId)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteFoodType(@PathVariable Long id) {
        try {
            foodTypeService.deleteFoodTypeById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException ex) {
            // log the error message
            System.out.println(ex.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
