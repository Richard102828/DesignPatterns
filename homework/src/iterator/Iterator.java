package iterator;

public interface Iterator {

    Object first();

    Boolean hasNext();

    Object next();

    Object currentElement();
}
