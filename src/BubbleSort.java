class BubbleSort {
    public static void main(String[] args){
        int[] array1 = {5, 2, 9, 1, 5, 6};
        int[] array2 = {3, 20, 15, 2, 4, 1};

        System.out.println("Original array");
        printArray(array2);

        bubbleSort(array2);

        System.out.println("\nSorted Array");
        printArray(array2);
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++){
            swapped = false;

            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped){
                break;
            }
        }
    }

    // utility method to print the sorted array
    public static void printArray(int[] arr){
        for (int item: arr){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}