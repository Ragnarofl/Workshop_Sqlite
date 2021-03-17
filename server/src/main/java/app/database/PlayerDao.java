package app.database;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import app.database.*;

public class PlayerDao extends Dao<Player> {

    private PlayerBuilder _builder = new PlayerBuilder();
    private static final PlayerDao instance = new PlayerDao();

    private PlayerDao() {
    }

    public static final PlayerDao getInstance() {
        return instance;
    }

    public void init() {
        try {
            _connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            _statement = _connection.createStatement();
            _statement.setQueryTimeout(30);

            _statement.executeUpdate("create table if not exists player " 
                                                        + "(pseudo string, " 
                                                        + "health int)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void printAll() {
    }

    public void addPlayer(String pseudo, Integer health) {
        try {
            //add code there
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePlayer(String pseudo) {
        try {
            //add code there
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Player> getAll() {
        List<Player> playerList = new ArrayList<Player>();
        try {
            ResultSet rs_player = _statement.executeQuery("select * from player");
            Player tmp = null;

            while (rs_player.next()) {
                tmp = get(rs_player.getString("pseudo"));
                playerList.add(tmp);
            }
            return playerList;
        } catch (SQLException e) {
            e.printStackTrace();
            return playerList;
        }
    }

    public Player get(String pseudo) {
        try {
            Player tmp = null;
            
            //add code there to get the correct values into the builder

            tmp = _builder.setPseudo("pseudo").setHealth(0).build();
            return tmp;
        } catch (SQLException e) {
            // e.printStackTrace();
            return null;
        }
    }
}