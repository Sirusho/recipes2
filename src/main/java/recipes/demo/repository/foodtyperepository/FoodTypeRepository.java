package recipes.demo.repository.foodtyperepository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipes.demo.repository.foodtyperepository.entity.FoodType;

public interface FoodTypeRepository extends JpaRepository<FoodType, Long> {
}
