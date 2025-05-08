package arraylist;
import java.util.*;

public class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Step 1: Input elements until -1 is entered
        System.out.println("Enter numbers (-1 to stop):");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            list.add(n);
        }

        System.out.println("Original List: " + list);

        // Step 2: Rotate the list to the left by 2 times
        // 1 2 3 4 5 
        //4 5 1 2 3
        int m=sc.nextInt();
        for (int j = 0; j < m; j++) {
            int first = list.get(0);  // Save first element
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(i, list.get(i + 1));  // Shift elements left
            }
            list.set(list.size() - 1, first);  // Place first at the end
            System.out.println("After " + (j + 1) + " rotation: " + list);
        }

        sc.close();
    }
}
