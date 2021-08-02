package recipes.demo.rest.dishtypecontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recipes.demo.repository.dishtyperepository.entity.DishType;
import recipes.demo.repository.tagrepository.entity.Tag;
import recipes.demo.rest.dishtagcontroller.model.TagResponseModel;
import recipes.demo.rest.dishtypecontroller.model.DishTypeResponseModel;
import recipes.demo.service.dishtagservice.TagService;
import recipes.demo.service.dishtypeservice.DishTypeService;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/dish/type")
public class DishTypeController {

    private final DishTypeService dishTypeService;

    public DishTypeController(DishTypeService dishTypeService) {
        this.dishTypeService = dishTypeService;
    }
    //
//    @PostMapping
//    public ResponseEntity<TagResponseModel> postTag(@RequestBody final TagRequestModel dishRequestModel) {
//        tagService.postTag(tagRequestModel);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }


        @GetMapping
        public ResponseEntity<List<DishTypeResponseModel>> getAllDishTypes() {
            List<DishType> allDishTypes = dishTypeService.getAllDishTypes();
            List<DishTypeResponseModel> dishTypeResponseModels = new ArrayList<>();
            for (DishType dishType : allDishTypes) {
                dishTypeResponseModels.add(new DishTypeResponseModel(dishType));
            }
            return new ResponseEntity<>(dishTypeResponseModels, HttpStatus.OK);
        }

        @GetMapping("/{id}")
        public ResponseEntity<DishTypeResponseModel> getDishTypeById(@PathVariable("id") Long dishTypeId) {
            //System.out.println("Id in the GetMapping -> " + dishId);
            return new ResponseEntity<>(new DishTypeResponseModel(dishTypeService.getDishTypeById(dishTypeId)), HttpStatus.OK);
        }

//    @PutMapping
//    public ResponseEntity<?> updateDish(@RequestBody DishRequestModel dishRequestModel) {
//        try {
//            dishService.updateDish(dishRequestModel);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException ex) {
//            // log the error message
//            System.out.println(ex.getMessage());
//            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
//        }
//    }

        // Delete user record
        @DeleteMapping("/{id}")
        public ResponseEntity<?> deleteDishType(@PathVariable Long id) {
            try {
                dishTypeService.deleteDishTypeById(id);
                return new ResponseEntity<>(HttpStatus.OK);
            } catch (RuntimeException ex) {
                // log the error message
                System.out.println(ex.getMessage());
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }
