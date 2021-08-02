package recipes.demo.repository.dishrepository;

import org.springframework.data.jpa.repository.Query;
import recipes.demo.repository.dishrepository.entity.Dish;

import java.util.List;

public interface DishSearchRepository {
    @Query(
            value = "SELECT * FROM DISH  WHERE DISH.difficulty = ?1",
            nativeQuery = true)
    List<Dish> getDishByDifficulty(int difficulty);


//    List<Dish> getDishByIngredient(Long ingredients[]);

    @Query(
            value = "SELECT * FROM DISH  WHERE DISH.id IN (SELECT dishes_id" +
                    " FROM dish_dish_tags t" +
                    " WHERE dish_tags_id=?1)",
            nativeQuery = true)
    List<Dish> getDishByTag(Long tagId);

    @Query(
            value = "SELECT * FROM dish WHERE lower(dish_name) LIKE %?1%",
            nativeQuery = true)
    List<Dish> getDishByName(String name);





}
