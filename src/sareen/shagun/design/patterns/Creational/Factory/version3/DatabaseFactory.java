package sareen.shagun.design.patterns.Creational.Factory.version3;


//This should contain all the factory methods for a particular database
public interface DatabaseFactory {
    Query createQuery();

    //createConnection
    //createTransaction
    //createSecurityLayer
}
