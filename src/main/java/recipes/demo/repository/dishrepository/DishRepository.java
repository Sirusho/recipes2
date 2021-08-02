package recipes.demo.repository.dishrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipes.demo.repository.dishrepository.entity.Dish;

import java.util.List;

public interface DishRepository extends JpaRepository<Dish, Long>, DishSearchRepository {

    List<Dish> getDishByDifficulty(int difficulty);


}
