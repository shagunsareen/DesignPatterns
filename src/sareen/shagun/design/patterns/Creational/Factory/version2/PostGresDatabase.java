package sareen.shagun.design.patterns.Creational.Factory.version2;

public class PostGresDatabase implements Database{
    @Override
    public Query createQuery() {
        return new PostGresQuery();
    }
}
