package demo.yqy.org.sortdemo.sort;


/**
 * @author yqy
 * @create 19-7-9
 * @Describe 插入排序的基本操作就是将一个数据插入到已经排好序的有序数据中，
 * 从而得到一个新的、个数加一的有序数
 */
public class InserSort {

    public static int[] insertSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int indx = 0;
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
