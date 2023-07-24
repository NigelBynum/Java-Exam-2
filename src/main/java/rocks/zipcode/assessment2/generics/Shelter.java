package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> implements Iterable  {

    List<Ageable>ageable;

    public Shelter() {

         this.ageable = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return ageable.size() -1 ;
    }

    public void add(Object object) {
    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
    }

    public Object get(Integer index) {
        return ageable.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}