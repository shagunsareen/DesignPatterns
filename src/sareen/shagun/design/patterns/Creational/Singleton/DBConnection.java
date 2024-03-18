package sareen.shagun.design.patterns.Creational.Singleton;

public class DBConnection {
    public String url;
    public String username;
    public String password;
    private static DBConnection dbConnection;

    private DBConnection() {
    }

    public static DBConnection getDBConnection() {
        if (dbConnection == null) {
            synchronized (DBConnection.class) {
                if (dbConnection == null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}
