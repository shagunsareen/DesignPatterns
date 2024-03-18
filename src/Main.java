import sareen.shagun.design.patterns.Creational.Singleton.DBConnection;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //creating 2 objects of singleton class
        DBConnection dbConn1 = DBConnection.getDBConnection();
        DBConnection dbConn2 = DBConnection.getDBConnection();

        System.out.println(dbConn1 + " - "+ dbConn2);
    }
}