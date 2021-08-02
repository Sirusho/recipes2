package recipes.demo.repository.dishrepository.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import recipes.demo.repository.ingredientrepository.entity.Ingredient;

import javax.persistence.*;

@Entity(name = "dish_ingredient")
public class DishIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonBackReference
    @ManyToOne
    private Dish dish;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    private Ingredient ingredient;

    private int quantity;

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public Dish getDish() {
//        return dish;
//    }
//
//    public void setDish(Dish dish) {
//        this.dish = dish;
//    }
}
