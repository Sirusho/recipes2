package recipes.demo.repository.dishtyperepository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipes.demo.repository.dishtyperepository.entity.DishType;

public interface DishTypeRepository extends JpaRepository<DishType, Long> {
}
