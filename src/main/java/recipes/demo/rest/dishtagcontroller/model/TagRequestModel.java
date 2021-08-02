package recipes.demo.rest.dishtagcontroller.model;

import recipes.demo.repository.tagrepository.entity.Tag;

public class TagRequestModel {
    private Tag tag;

    public TagRequestModel(Tag tag) {
        this.tag = tag;
    }

    public TagRequestModel() {
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
