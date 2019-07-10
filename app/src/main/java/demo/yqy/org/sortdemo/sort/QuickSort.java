package demo.yqy.org.sortdemo.sort;

/**
 * @author yqy
 * @create 19-7-10
 * @Describe
 * 类似于选择排序的定位思想）选一基准元素，依次将剩余元素中小于该基准元素的值放置其左侧，
 * 大于等于该基准元素的值放置其右侧；然后，取基准元素的前半部分和后半部分分别进行同样的处理；
 * 以此类推，直至各子序列剩余一个元素时，即排序完成（类比二叉树的思想，from up to down）
 *
 * 时间复杂度：O(NlogN) 　　稳定性：不稳定
 *
 */
public class QuickSort {

    public static void quickSort(int arr[], int low, int height) {
        if (arr == null || arr.length <= 0) {
            return;
        }
        if (low < height) {
            int index = getIndex(arr, low, height);
            quickSort(arr, 0, index);
            quickSort(arr, index + 1, height);
        }
    }

    private static int getIndex(int arr[], int low, int height) {
        if (arr == null || arr.length <= 0) {
            return 0;
        }
        int temp = arr[low];
        while (low < height) {

            while (low < height && arr[height] >= temp) {
                height--;
            }

            arr[low] = arr[height];

            while (low < height && arr[low] <= temp) {
                low++;
            }
            arr[height] = arr[low];
        }

        arr[low] = temp;
        return low;
    }
}
