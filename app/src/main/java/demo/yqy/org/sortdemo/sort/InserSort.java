package demo.yqy.org.sortdemo.sort;


/**
 * @author yqy
 * @create 19-7-9
 * @Describe 数列前面部分看为有序，依次将后面的无序数列元素插入到前面的有序数列中，
 * 初始状态有序数列仅有一个元素，即首元素。在将无序数列元素插入有序数列的过程中，
 * 采用了逆序遍历有序数列，相较于顺序遍历会稍显繁琐，但当数列本身已近排序状态效率会更高。
 * <p>
 * 时间复杂度：O(N2) 　　稳定性：稳定
 */
public class InserSort {

    public static int[] insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int indx = 0;

            /**
             * 每一次都从排序好的数组进行大小比较
             */
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    indx = j - 1;
                } else {
                    break;
                }
                arr[indx] = temp;
            }
        }
        return arr;
    }
}
