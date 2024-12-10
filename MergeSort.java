/*
 * https://www.geeksforgeeks.org/problems/merge-sort
*/

import java.util.*;

class MergeSort {

    void mergeSort(int arr[], int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, r, mid, mid+1);
    }
    
    void merge(int[] arr, int low, int high, int mid1, int mid2) {
        ArrayList<Integer> sArr = new ArrayList<>();
        int l = low;
        int r = mid2;
        while (l <= mid1 && r <= high) {
            if (arr[l] <= arr[r]) sArr.add(arr[l++]);
            else sArr.add(arr[r++]);
        }
        while (l <= mid1) sArr.add(arr[l++]);
        while (r <= high) sArr.add(arr[r++]);
        for (int i = low; i <= high; i++) arr[i] = sArr.get(i-low);
    }
}
