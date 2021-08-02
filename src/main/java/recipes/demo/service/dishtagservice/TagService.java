package recipes.demo.service.dishtagservice;

import org.springframework.stereotype.Service;
import recipes.demo.repository.tagrepository.entity.Tag;
import recipes.demo.rest.dishtagcontroller.model.TagRequestModel;

import java.util.List;
public interface TagService {

    Tag postTag(TagRequestModel tagRequestModel);

    Tag getTagById(Long tagId);

    void updateTag(TagRequestModel tagRequestModel);

    void deleteTagById(Long dishId);

    List<Tag> getAllTags();

}
