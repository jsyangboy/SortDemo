package demo.yqy.org.sortdemo.sort;

/**
 * @author yqy
 * @create 19-7-10
 * @Describe 选择排序
 * 首先初始化最小元素索引值为首元素，依次遍历待排序数列，
 * 若遇到小于该最小索引位置处的元素则刷新最小索引为该较小元素的位置，
 * 直至遇到尾元素，结束一次遍历，并将最小索引处元素与首元素交换；然后，
 * 初始化最小索引值为第二个待排序数列元素位置，同样的操作，
 * 可得到数列第二个元素即为次小元素；以此类推。
 * <p>
 * 时间复杂度：O(N2) 　　稳定性：不稳定
 */
public class SelectSort {

    /**
     * 选择排序
     *
     * @param arr
     * @return
     */
    public static int[] selectSort(int arr[]) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            /**
             * 无序区的最小数据数组下标
             */
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {

                /**
                 * 在无序区中找到最小数据并保存其数组下标
                 */
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            /**
             * 在无序区中找到最小数据并保存其数组下标
             */
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}
