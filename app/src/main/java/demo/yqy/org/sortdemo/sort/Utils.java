package demo.yqy.org.sortdemo.sort;

import java.util.Random;

public class Utils {

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void prinArr(int arr[]) {
        if (arr == null) {
            return;
        }
        if (arr.length <= 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("-" + arr[i]);
            }
        }
    }

    private static Random random = new Random();

    /**
     * 创建数组
     *
     * @param len
     * @return
     */
    public static int[] createArr(int len, int max) {
        int[] arr = new int[len];

        /**
         * 生成随机数
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(max);
        }
        return arr;
    }
}
