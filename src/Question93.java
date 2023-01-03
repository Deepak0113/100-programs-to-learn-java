//93.Java Program to sort the characters in a word in descending using recursion

public class Question93 {
    // merge sort
    static void merge(char arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

        char L[] = new char[n1];
        char R[] = new char[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(char[] arr, int l, int r){
        if(l<r){
            int m = l + (r-l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    static String sortDesc(String string){
        char[] arr = string.toCharArray();
        mergeSort(arr, 0, arr.length-1);

        return new String(arr);
    }

    public static void main(String[] args) {
        String word = "working";
        System.out.println(sortDesc(word));
    }
}