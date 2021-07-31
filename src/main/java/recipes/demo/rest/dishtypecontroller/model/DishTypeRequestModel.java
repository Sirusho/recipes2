package recipes.demo.rest.dishtypecontroller.model;

public class DishTypeRequestModel {
    private int id;
    private String dishTypeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDishTypeName() {
        return dishTypeName;
    }

    public void setDishTypeName(String dishTypeName) {
        this.dishTypeName = dishTypeName;
    }
}
