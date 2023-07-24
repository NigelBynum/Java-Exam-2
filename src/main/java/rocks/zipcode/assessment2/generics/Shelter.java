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
public class Shelter<_> implements Iterable {

    List<Ageable>agea;

    public Shelter() {

         this.agea = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return agea.size() ;
    }

    public void add(Object object) {if(object instanceof  Ageable){
        agea.add((Ageable) object);
    }
    }

    public Boolean contains(Object object) {
          return agea.contains((Ageable)object);
    }

    public void remove(Object object) {agea.remove((Ageable) object);
    }

    public Object get(Integer index) {
        return agea.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return agea.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}