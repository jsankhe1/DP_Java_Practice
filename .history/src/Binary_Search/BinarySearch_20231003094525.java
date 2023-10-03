package Binary_Search;

import java.util.List;

public class BinarySearch {
    public void binarySearch(List<Integer> randomList, int searchNumber) {
        int size = randomList.size();
        int lower, upper;
        lower = 0;
        upper = size - 1;
        int middle = (lower + upper) / 2;

        while (lower <= upper) {
            // if the search number is in middle of list.
            if (searchNumber == randomList.get(middle)) {
                System.out.println("The number was found, it's at index " + randomList.indexOf(searchNumber));
                return;
            } else if (searchNumber < randomList.get(middle)) {
                upper = middle - 1;
            } else {
                lower = middle + 1;
            }
            middle = (upper + lower) / 2;


        }
        System.out.println("Your number isn't in our database");
//        return;
    }
}
