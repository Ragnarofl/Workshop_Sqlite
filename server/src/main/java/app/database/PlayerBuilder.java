package app.database;

import app.database.Player;
import app.database.Builder;

public class PlayerBuilder extends Builder<Player> {
    private String _pseudo = "";
    private Integer _health = 0;

    public PlayerBuilder() {
    }

    public PlayerBuilder setPseudo(String str) {
        _pseudo = str;
        return this;
    }
    public PlayerBuilder setHealth(Integer value) {
        _health = value;
        return this;
    }

    public Player build() {
        return new Player(_pseudo, _health);
    }
}