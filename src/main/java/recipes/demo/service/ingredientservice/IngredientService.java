package recipes.demo.service.ingredientservice;

import recipes.demo.repository.ingredientrepository.entity.Ingredient;
import recipes.demo.rest.ingredientcontroller.model.IngredientRequestModel;

import java.util.List;

public interface IngredientService {

    Ingredient postIngredient(IngredientRequestModel IngredientRequestModel);

    Ingredient getIngredientById(Long ingredientTypeId);

    void updateIngredient(IngredientRequestModel ingredientTypeRequestModel);

    void deleteIngredientById(Long ingredientTypeId);

    List<Ingredient> getAllIngredients();
}
