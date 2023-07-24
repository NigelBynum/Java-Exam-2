package rocks.zipcode.assessment2.collections;


import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;
/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    List<String> strings;
    Map<String, Integer> mapOfInventory;

    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {



    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.strings = new ArrayList<>();
        this.mapOfInventory = new TreeMap<>();

    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (!mapOfInventory.containsKey(item)){
         mapOfInventory.put(item,1);
     }
     else mapOfInventory.put(item, (mapOfInventory.get(item)));
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        mapOfInventory.put(item, mapOfInventory.get(item) - 1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if(mapOfInventory.containsKey(item)){
            return mapOfInventory.get(item);
        }
        else
        return 0;
    }
}
