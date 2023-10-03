package Binary_Search;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

class InputHandler {

    static void inputManager(){
        Scanner scanner = new Scanner(System.in);
        // call and store the return valye of a method from Binary_Search.RandomNumberArrayList
        List<Integer> randomList = RandomNumberArrayList.RandomIntList();
        //quicksort the array
        Collections.sort(randomList);
        System.out.println("Sorted arraylist: " + randomList);
        // From user, we take input for the number we want to search for in the list
        System.out.println("Enter a number to search for in the list: ");
        int searchNumber = scanner.nextInt();

        //send the number to a Binary_Search Method we created

        BinarySearch searchinAlgo = new BinarySearch();

        searchinAlgo.binarySearch(randomList, searchNumber);
        scanner.close();
    }

}
