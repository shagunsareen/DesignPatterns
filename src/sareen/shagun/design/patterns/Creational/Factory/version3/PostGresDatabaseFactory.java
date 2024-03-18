package sareen.shagun.design.patterns.Creational.Factory.version3;

public class PostGresDatabaseFactory implements DatabaseFactory {
    @Override
    public Query createQuery() {
        return new PostGresQuery();
    }

    //we can have more implementations classes for PostGresDBFactory
}
