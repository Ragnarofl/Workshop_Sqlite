package app.database;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class Dao<T> {
   public Object _mutex = new Object();
   public Connection _connection = null;
   public Statement _statement = null;

   public abstract void init();
   public abstract void printAll();
   public abstract List<T> getAll();
   public abstract T get(String str);
}