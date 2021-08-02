package recipes.demo.repository.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipes.demo.repository.userrepository.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
