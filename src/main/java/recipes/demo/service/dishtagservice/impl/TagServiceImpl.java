package recipes.demo.service.dishtagservice.impl;

import org.springframework.stereotype.Service;
import recipes.demo.repository.tagrepository.TagRepository;
import recipes.demo.repository.tagrepository.entity.Tag;
import recipes.demo.rest.dishtagcontroller.model.TagRequestModel;
import recipes.demo.service.dishtagservice.TagService;

import java.util.List;
@Service
public class TagServiceImpl implements TagService {
    private final TagRepository tagRepository;

    public TagServiceImpl(TagRepository tagRepository) {
        this.tagRepository = tagRepository;
    }

    @Override
    public Tag postTag(TagRequestModel tagRequestModel) {
        return null;
    }

    @Override
    public Tag getTagById(Long tagId) {
        return tagRepository.getById(tagId);
    }

    @Override
    public void updateTag(TagRequestModel tagRequestModel) {

    }

    @Override
    public void deleteTagById(Long tagId) {
        tagRepository.delete(tagRepository.getById(tagId));

    }

    @Override
    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }
}
