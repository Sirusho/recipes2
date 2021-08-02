package recipes.demo.rest.dishtagcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import recipes.demo.repository.tagrepository.entity.Tag;
import recipes.demo.rest.dishcontroller.model.DishResponseModel;
import recipes.demo.rest.dishtagcontroller.model.TagResponseModel;
import recipes.demo.service.dishtagservice.TagService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tag")
public class TagController {
    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }
//
//    @PostMapping
//    public ResponseEntity<TagResponseModel> postTag(@RequestBody final TagRequestModel dishRequestModel) {
//        tagService.postTag(tagRequestModel);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }


    @GetMapping
    public ResponseEntity<List<TagResponseModel>> getAllTags() {
        List<Tag> allTags = tagService.getAllTags();
        List<TagResponseModel> tags = new ArrayList<>();
        for (Tag tag : allTags) {
            tags.add(new TagResponseModel(tag));
        }
        return new ResponseEntity<>(tags, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TagResponseModel> getTagById(@PathVariable("id") Long tagId) {
        //System.out.println("Id in the GetMapping -> " + dishId);
        return new ResponseEntity<>(new TagResponseModel(tagService.getTagById(tagId)), HttpStatus.OK);
    }
    /*
    @GetMapping("/hello")
ResponseEntity<String> hello() {
    return new ResponseEntity<>("Hello World!", HttpStatus.OK);
}
     */

//    @PutMapping
//    public ResponseEntity<?> updateDish(@RequestBody DishRequestModel dishRequestModel) {
//        try {
//            dishService.updateDish(dishRequestModel);
//            return new ResponseEntity<>(HttpStatus.OK);
//        } catch (NoSuchElementException ex) {
//            // log the error message
//            System.out.println(ex.getMessage());
//            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
//        }
//    }

    // Delete user record
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteDish(@PathVariable Long id) {
        try {
            tagService.deleteTagById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (RuntimeException ex) {
            // log the error message
            System.out.println(ex.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
