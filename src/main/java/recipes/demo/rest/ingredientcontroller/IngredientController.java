package recipes.demo.rest.ingredientcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import recipes.demo.repository.ingredientrepository.entity.Ingredient;
import recipes.demo.rest.ingredientcontroller.model.IngredientResponseModel;
import recipes.demo.service.ingredientservice.IngredientService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ingredient")
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }


    @GetMapping
    public ResponseEntity<List<IngredientResponseModel>> getAllIngredients() {
        List<Ingredient> allIngredients = ingredientService.getAllIngredients();
        List<IngredientResponseModel> ingredientResponseModels = new ArrayList<>();
        for (Ingredient ingredient : allIngredients) {
            ingredientResponseModels.add(new IngredientResponseModel(ingredient));
        }
        return new ResponseEntity<>(ingredientResponseModels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IngredientResponseModel> getIngredientById(@PathVariable("id") Long ingredientId) {
        //System.out.println("Id in the GetMapping -> " + dishId);
        return new ResponseEntity<>(new IngredientResponseModel(ingredientService.getIngredientById(ingredientId)), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteIngredient(@PathVariable Long id) {
        try {
            ingredientService.deleteIngredientById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException ex) {
            // log the error message
            System.out.println(ex.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
