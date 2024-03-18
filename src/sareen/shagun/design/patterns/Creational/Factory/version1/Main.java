package sareen.shagun.design.patterns.Creational.Factory.version1;

public class Main {
    public static void main(String[] args) {

        //Practical Factory Method -- create object on the basis of input type
        Database db = null;
        Query q;

        if (db instanceof MySqlDatabase) {
            q = new MySqlQuery();
        } else if (db instanceof PostGresDatabase) {
            q = new PostGresQuery();
        }
    }
}
