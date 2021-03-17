package app.database;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {
    private String _pseudo = "";
    private Integer _health = 0;
    private List<Spell> _spells = new ArrayList<Spell>();

    public Player(String pseudo, Integer health) {
        _pseudo = pseudo;
        _health = health;
    }

    public void setPseudo(String pseudo) {
        _pseudo = pseudo;
    }
    public String getPseudo() {
        return _pseudo;
    }

    public void setHealth(Integer health) {
        _health = health;
    }
    public Integer getHealth() {
        return _health;
    }

    public void addSpell(Spell spell) {
        _spells.add(spell);
    }
    public List<Spell> getSpells() {
        return _spells;
    }
}