package recipes.demo.rest.ingredientcontroller.model;

import recipes.demo.repository.ingredientrepository.entity.Ingredient;

public class IngredientRequestModel {
    private final Ingredient ingredient;

    public IngredientRequestModel(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }
}
