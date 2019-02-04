package entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "burgers")
public class Burger extends Item{

    private String ingredients;

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }


}
