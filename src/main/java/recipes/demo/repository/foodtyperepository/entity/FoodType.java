package recipes.demo.repository.foodtyperepository.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
@Entity(name = "food_type")
public class FoodType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
//    @OneToMany(mappedBy = "foodType", fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, orphanRemoval = true)
//    private List<Ingredient> ingredientList;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public List<Ingredient> getIngredientList() {
//        return ingredientList;
//    }
//
//    public void setIngredientList(List<Ingredient> ingredientList) {
//        this.ingredientList = ingredientList;
//    }

    public FoodType() {
    }
}
