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


    public static int[] arr = new int[20];
    private static Random random = new Random();

    public static void main(String[] args) {

        /**
         * 生成随机数
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        prinArr(arr);
        bubbleSort(arr);
        System.out.println("");
        prinArr(arr);
    }

    private static void prinArr(int arr[]) {
        if (arr == null) {
            return;
        }
        if (arr.length <= 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("-" + arr[i]);
        }
    }

}
