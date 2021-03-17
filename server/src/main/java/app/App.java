package app;

import app.database.PlayerDao;
import app.database.*;

public class App 
{
    public static void main( String[] args )
    {
        PlayerDao dao = PlayerDao.getInstance();

        dao.init();
        dao.addPlayer("Boris", 100);

        Player tmp = dao.get("Boris");
        if (tmp != null) {
            System.out.println(tmp.getPseudo());
        }
    }
}
