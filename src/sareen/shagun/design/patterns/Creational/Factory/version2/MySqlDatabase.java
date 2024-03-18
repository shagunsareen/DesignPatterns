package sareen.shagun.design.patterns.Creational.Factory.version2;

public class MySqlDatabase implements Database{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }
}
