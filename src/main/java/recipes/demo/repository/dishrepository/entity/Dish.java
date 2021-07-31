package recipes.demo.repository.dishrepository.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import recipes.demo.repository.userrepository.entity.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity(name = "dish")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dishName;
    private String description;

    @OneToOne
    private DishType dishType;

    @JsonManagedReference(value = "dish-tag")
    @ManyToMany
    private Set<Tag> dishTags;

    @OneToMany(mappedBy = "dish", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<Step> stepList;

    @JsonManagedReference
    @OneToMany(mappedBy = "dish",  cascade = {CascadeType.ALL}, orphanRemoval = true)
    private List<DishIngredient> dishIngredientList;

    @JsonBackReference(value = "dish-user")
    @ManyToOne
    private User user;

    private int totalTime;//minutes
    private int difficulty;//1-3
    private String imageURL;
    private int portion;
    private Date publishedDate;

    public List<DishIngredient> getDishIngredientList() {
        return dishIngredientList;
    }

    public void setDishIngredientList(List<DishIngredient> dishIngredientList) {
        this.dishIngredientList = dishIngredientList;
    }

    public Set<Tag> getDishTags() {
        return dishTags;
    }

    public void setDishTags(Set<Tag> dishTags) {
        this.dishTags = dishTags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }


    public List<Step> getStepList() {
        return stepList;
    }

    public void setStepList(List<Step> stepList) {
        this.stepList = stepList;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }

    public Dish() {
    }
}

