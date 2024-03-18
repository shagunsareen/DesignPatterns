package sareen.shagun.design.patterns.Creational.Factory.version3;

public class MySqlDatabase implements Database{
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new MySqlDatabaseFactory();
    }
}
