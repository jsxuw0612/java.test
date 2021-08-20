package cn.xrx.test;

import lombok.extern.slf4j.Slf4j;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/6/17 16:46
 */
@Slf4j
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1332802,1177178,1514891,871248,753214,123866,1615405,328656,1540395,968891,1884022,252932,1034406,1455178,821713,486232,860175,1896237,852300,566715,1285209,1845742,883142,259266,520911,1844960,218188,1528217,332380,261485,1111670,16920,1249664,1199799,1959818,1546744,1904944,51047,1176397,190970,48715,349690,673887,1648782,1010556,1165786,937247,986578,798663};
        QuickSort quickSort = new QuickSort();

        quickSort.quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            log.info(i + ",");
        }
    }

    private void quickSort(int[] arr, int left, int right) {

        int i;
        int j;
        int temp;
        int t;
        if (left > right) {
            return;
        }
        i = left;
        j = right;
        temp = arr[left];

        while (i < j) {
            while (temp <= arr[j] && i < j) {
                j--;
            }
            while (temp >= arr[i] && i < j) {
                i++;
            }
            if (i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[left] = arr[i];
        arr[i] = temp;

        quickSort(arr, left, i-1);
        quickSort(arr, j+1, right);
    }

}
