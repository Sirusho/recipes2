package recipes.demo.service.ingredientservice.impl;

import org.springframework.stereotype.Service;
import recipes.demo.repository.ingredientrepository.IngredientRepository;
import recipes.demo.repository.ingredientrepository.entity.Ingredient;
import recipes.demo.rest.ingredientcontroller.model.IngredientRequestModel;
import recipes.demo.service.ingredientservice.IngredientService;

import java.util.List;
@Service
public class IngredientImpl implements IngredientService {
    private final IngredientRepository ingredientRepository;

    public IngredientImpl(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient postIngredient(IngredientRequestModel IngredientRequestModel) {
        return null;
    }

    @Override
    public Ingredient getIngredientById(Long ingredientId) {
        return ingredientRepository.getById(ingredientId);
    }

    @Override
    public void updateIngredient(IngredientRequestModel ingredientTypeRequestModel) {

    }

    @Override
    public void deleteIngredientById(Long ingredientId) {
        ingredientRepository.delete(ingredientRepository.getById(ingredientId));
    }

    @Override
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }
}
