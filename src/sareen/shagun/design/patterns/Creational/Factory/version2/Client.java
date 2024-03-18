package sareen.shagun.design.patterns.Creational.Factory.version2;

public class Client {
    public static void main(String[] args) {
        Database db = new MySqlDatabase();
        Query q = db.createQuery();
    }
}
