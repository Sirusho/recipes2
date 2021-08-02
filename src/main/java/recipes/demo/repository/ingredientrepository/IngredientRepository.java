package recipes.demo.repository.ingredientcontroller;

import org.springframework.data.jpa.repository.JpaRepository;
import recipes.demo.repository.ingredientcontroller.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
