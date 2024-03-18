package sareen.shagun.design.patterns.Creational.Factory.version3;

public class MySqlDatabaseFactory implements DatabaseFactory{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    //here I can have the implementation of createConnection(), createTransaction() etc.
}
