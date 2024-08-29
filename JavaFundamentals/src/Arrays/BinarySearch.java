package Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int sortedArr[] = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int left = 0;
        int right = sortedArr.length - 1;
        
        boolean found = false;
        while (left <= right) {
            int midpoint = left + (right - left) / 2; // Correct calculation of midpoint
            
            if (target == sortedArr[midpoint]) {
                System.out.println("Target is found at index " + midpoint);
                found = true;
                break;
            } else if (target < sortedArr[midpoint]) {
                right = midpoint - 1; // Narrow search to the left half
            } else {
                left = midpoint + 1; // Narrow search to the right half
            }
        }
        
        if (!found) {
            System.out.println("Target not found");
        }
    }
}
