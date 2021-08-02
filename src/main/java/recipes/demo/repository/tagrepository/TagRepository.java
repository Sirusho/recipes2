package recipes.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import recipes.demo.repository.tagrepository.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
