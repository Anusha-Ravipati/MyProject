package assignment2;
public class MergeSortedArray {

	public static void main(String[] args) {
		

		int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            merged[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            merged[k] = arr2[j];
            j++;
            k++;
        }
        System.out.print("Merged array: ");
        for (int x = 0; x < merged.length; x++) {
            System.out.print(merged[x] + " ");
        }

       
	}

}
