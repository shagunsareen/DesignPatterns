package sareen.shagun.design.patterns.Creational.Factory.version3;

public class PostGresDatabase implements Database{
    @Override
    public DatabaseFactory createDatabaseFactory() {
        return new PostGresDatabaseFactory();
    }
}
