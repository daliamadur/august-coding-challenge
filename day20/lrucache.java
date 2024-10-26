import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class LRUcache<T> {
    private final int size;
    private Map<Integer, Map.Entry<Integer, T>> indices;
    private LinkedList<Map.Entry<Integer, T>> list;

    LRUcache(int size) { 
        this.size = size; 
        this.indices = new HashMap<>();
        this.list = new LinkedList<>();
    }

    T get(int key) {
        //lookup key in hashmap
        //-> if key is in there
        if (indices.containsKey(key)) {
            //copy node
            Map.Entry<Integer, T> node = indices.get(key);
            //remove node from linked list
            list.remove(node);
            // add node to front
            list.addFirst(node);

            return node.getValue();
        }
            
        return null;
    }

    void put(int key, T value) {
        //check value is already in cache
        if(indices.containsKey(key)) {
            Map.Entry<Integer, T> node = indices.get(key);
            //++overwrite value
            node.setValue(value);
            //remove node from linked list
            list.remove(node);
            // add node to front
            list.addFirst(node);
        } else{
            //check if cache is full
                if (indices.size() == size) {
                //-> if cache full, remove last node from linked list
                Map.Entry<Integer, T> node = list.removeLast();
                //and key value pair from hashmap
                indices.remove(node.getKey());
            }
            //-> add new value to front of linked list
            Map.Entry<Integer, T> new_node = new AbstractMap.SimpleEntry<>(key, value);
            list.addFirst(new_node);
            indices.put(key, new_node);
        }
    }
}
