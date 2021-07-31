package recipes.demo.repository.dishrepository.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
//Table [dish_step] contains physical column name [dish_id] referred to by multiple logical column names: [dish_id], [dishId]
@Entity(name = "dish_step")
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   // private int dishId;
    private int time;
    private String description;
    private int stepNo;
    @JsonBackReference
    @ManyToOne
    private Dish dish;

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


//    public int getDishId() {
//        return dishId;
//    }
//
//    public void setDishId(int dishId) {
//        this.dishId = dishId;
//    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStepNo() {
        return stepNo;
    }

    public void setStepNo(int stepNo) {
        this.stepNo = stepNo;
    }

    public Step() {
    }
}
