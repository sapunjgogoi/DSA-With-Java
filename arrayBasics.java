import java.util.*;

class arrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arrSize = sc.nextInt();

        int[] arr = new int[arrSize];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<arrSize; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for(int i=0; i<arrSize; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}