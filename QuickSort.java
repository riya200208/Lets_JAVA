import java.util.Scanner;

class sort {
    static void bubble_sort(int arr[]) {
        int l = arr.length;
        int temp;
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int l;
        System.out.println("Enter the length of the array ");
        l = sc.nextInt();
        int ar[] = new int[l];
        System.out.println("Enter the array ");
        for (int i = 0; i < l; i++) {
            ar[i] = sc.nextInt();
        }
        // System.out.println("hh");
        bubble_sort(ar);
        for (int i = 0; i < l; i++) {
            System.out.print(ar[i] + " ");
        }
        sc.close();
    }
}
