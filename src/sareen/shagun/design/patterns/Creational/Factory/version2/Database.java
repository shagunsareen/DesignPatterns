package sareen.shagun.design.patterns.Creational.Factory.version2;

public interface Database {

    //Factory method --> that needs implementation in each implementation class
    Query createQuery();
}
