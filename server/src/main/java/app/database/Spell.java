package app.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Spell {
    private String _name = "";
    private Integer _cost = 0;
    private Integer _damage = 0;

    public Spell(String name, Integer cost, Integer damage) {
        _name = name;
        _cost = cost;
    }

    public void setName(String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }

    public void setCost(Integer cost) {
        _cost = cost;
    }
    public Integer getCost() {
        return _cost;
    }

    public void setDamage(Integer damage) {
        _damage = damage;
    }
    public Integer getDamage() {
        return _damage;
    }
}