package Binary_Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberArrayList
    // I used no modifer for class Binary_Search.RandomNumberArrayList
    // because I want it to be package-private.
{
    static List<Integer> RandomIntList(){
        //I used the static modifier for the method RandomIntList
        //because I want to be able to call it without creating an object of the
        // class Binary_Search.RandomNumberArrayList ib Binary_Search.Main.java

        List<Integer> randomList = new ArrayList<>();
        // the above line declares an ArrayList of Integers,
        // where Integer is a wrapper class for the primitive type int.
        // Why do we need to use a wrapper class?
        // Because ArrayLists can only store objects, not primitive types.
        //Why can't ArrayLists store primitive types?
        //Because ArrayLists are generic classes, and generic classes can only store objects.

        Random rand = new Random();
        // limit the size of the array to <= 20
        int size = rand.nextInt(20);

        // generate random numbers that are greater than 0 and less than 100
        for(int i =0; i < size; i++){
            randomList.add(rand.nextInt(100));

        }
        return randomList;
    }
}
