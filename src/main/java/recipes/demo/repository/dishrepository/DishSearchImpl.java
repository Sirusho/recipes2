package recipes.demo.repository.dishrepository;

import recipes.demo.repository.dishrepository.entity.Dish;

import java.util.List;

public class DishSearchImpl implements DishSearchRepository {
    private final DishRepository dishRepository;

    public DishSearchImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public List<Dish> getDishByDifficulty(int difficulty) {

        return dishRepository.getDishByDifficulty(difficulty);
    }

//    @Override
//    public List<Dish> getDishByIngredient(Long[] ingredients) {
//        return null;
//    }
//

    @Override
    public List<Dish> getDishByTag(Long tagId) {
        return dishRepository.getDishByTag(tagId);
    }

    @Override
    public List<Dish> getDishByName(String name) {
        return dishRepository.getDishByName(name);
    }


}
