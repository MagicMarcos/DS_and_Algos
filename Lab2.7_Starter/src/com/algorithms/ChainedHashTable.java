package com.algorithms;

import java.util.LinkedList;

public class ChainedHashTable<K, V> implements HashTable<K, V> {
    private final HashProvider<K> hashProvider;
    private LinkedList<Pair<K, V>>[] array;

    public ChainedHashTable(int capacity, HashProvider<K> hashProvider) {
        array = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) array[i] = new LinkedList<>();
        this.hashProvider = hashProvider;
    }

    public void put(K key, V value) {
        // 1. get the int hash value by calling the hashKey( ) method of the hashProvider
        // passing to it the key argument and the length of the array
        // because this is a remainder hash, this method will return a number
        // between 0 and the length of the array
        int hashValue = hashProvider.hashKey(key, array.length);
        // 2. then use this value to find the appropriate element of the array
        // and add a new Pair (key, value) to the beginning of the LinkedList
        Pair<K,V> kVPair = new Pair<>(key, value);
        array[hashValue].addFirst(kVPair);
    }

    public V get(K key) {
        // 1. get the int hash value by calling the hashKey( ) method of the hashProvider
        // passing to it the key argument and the length of the array
        // because this is a remainder hash, this method will return a number
        // between 0 and the length of the array
        int hashValue = hashProvider.hashKey(key, array.length);

        // 2. get a linked list of Pair<K, V> using the hashValue as the index off the array
        // we are using the java.util.LinkedList
        LinkedList<Pair<K, V>> kVList = array[hashValue];

        // 3. Next, get each Pair<K, V> from the list
        // get each Pair
        for(Pair<K,V> pair : kVList ) {
            if(pair.getKey().equals(key)) {
                return pair.getValue();

            }
        }
        return null;
            // now get the key
            // 4. get the key from the retrieved Pair\
            // 5. if the retrieved key is equal to the key argument passed in
            // then return the value associated with that pair
            // return null if a key match is never made

        // if not found, return null

        // lambda and stream code shown here
//        return array[hashValue].stream()
//                .filter(keyValue -> keyValue.getKey().equals(key))
//                .findFirst()
//                .map(Pair::getValue)
//                .orElse(null);
//        return null;
    }

    public void remove(K key) {
        if (key == null) {
            return;
        }
        int hashValue = hashProvider.hashKey(key, array.length);
//  lambda code here
//  array[hashValue].removeIf(p -> p.getKey().equals(key));

        LinkedList<Pair<K, V>> lList = array[hashValue];
        K curKey = null;
        Pair<K, V> pair = null;
        for (Pair<K, V> p : lList) {
            curKey = p.getKey();
            if (curKey.equals(key)) {
                // once we find the right key, we have to remove the associated Pair outside the loop
                pair = p;
                break;
            }
        }
        lList.remove(pair);
    }

    public static void main(String args[]) {
        ChainedHashTable<Integer, String> chainedHashTable = new ChainedHashTable<>(10, new RemainderHashing());
        chainedHashTable.put(12,"Isabel");
        chainedHashTable.put(22,"Ruth");
        chainedHashTable.put(32,"Michelle");
        chainedHashTable.put(11,"James");
        chainedHashTable.put(21,"John");
        chainedHashTable.put(31,"Peter");
        System.out.println(chainedHashTable.get(12));
        System.out.println(chainedHashTable.get(22));
        System.out.println(chainedHashTable.get(32));
        System.out.println(chainedHashTable.get(11));
        System.out.println(chainedHashTable.get(21));
        System.out.println(chainedHashTable.get(31));
        System.out.println(chainedHashTable.get(42));
        System.out.println(chainedHashTable.get(45));
        chainedHashTable.remove(31);
        System.out.println(chainedHashTable.get(31));
    }
}

