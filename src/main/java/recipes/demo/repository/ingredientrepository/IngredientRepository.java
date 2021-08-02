package recipes.demo.repository.ingredientrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipes.demo.repository.ingredientrepository.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
