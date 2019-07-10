package demo.yqy.org.sortdemo.sort;

import java.util.Random;

/**
 * @author yqy
 * @create 19-7-9
 * @Describe 冒泡排序
 * 依次比较相邻两元素，若前一元素大于后一元素则交换之，直至最后一个元素即为最大；然后重新从首元素开始重复同样的操作，
 * 直至倒数第二个元素即为次大元素；依次类推。如同水中的气泡，依次将最大或最小元素气泡浮出水面。
 *
 * 时间复杂度：O(N2) 　　稳定性：稳定
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
