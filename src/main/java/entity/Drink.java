package entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "drinks")
public class Drink extends Item{

    private Boolean hasIceCubes;

    public Boolean getHasIceCubes() {
        return hasIceCubes;
    }

    public void setHasIceCubes(Boolean hasIceCubes) {
        this.hasIceCubes = hasIceCubes;
    }

}
