package recipes.demo.rest.dishtagcontroller.model;

import recipes.demo.repository.tagrepository.entity.Tag;

public class TagResponseModel {
    private Tag tag;

    public TagResponseModel(Tag tag) {
        this.tag = tag;
    }

    public TagResponseModel() {
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
