package recipes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipes.demo.repository.dishrepository.entity.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {

}
