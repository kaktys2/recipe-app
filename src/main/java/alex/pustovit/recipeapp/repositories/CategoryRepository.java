package alex.pustovit.recipeapp.repositories;

import alex.pustovit.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
