package demo.yqy.org.sortdemo.sort;

import java.util.Random;

/**
 * @author yqy
 * @create 19-7-9
 * @Describe 冒泡排序
 */
public class BobbleSort {


    public static int[] bubbleSort(int arr[]) {
        if (arr == null) {
            return null;
        }
        if (arr.length <= 0) {
            return null;
        }

        for (int i = 0; i < arr.length; i++) {

            /**
             * （arr.length - i - 1 ）：j要不断的往前移，
             */
            for (int j = 0; j < arr.length - i - 1; j++) {

                /**
                 * 相邻之间相互比较
                 */
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

}
