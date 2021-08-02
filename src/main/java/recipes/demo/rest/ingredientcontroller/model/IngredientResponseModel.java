package recipes.demo.rest.ingredientcontroller.model;

import recipes.demo.repository.ingredientrepository.entity.Ingredient;

public class IngredientResponseModel {
    private Ingredient ingredient;

    public IngredientResponseModel(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
