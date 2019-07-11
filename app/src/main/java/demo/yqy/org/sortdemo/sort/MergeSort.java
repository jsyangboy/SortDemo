package demo.yqy.org.sortdemo.sort;

/**
 * @author yqy
 * @create 19-7-10
 * @Describe 归并排序 - 采用了分治和递归的思想，递归&分治-排序整个数列如同排序两个有序数列，
 * 依次执行这个过程直至排序末端的两个元素，
 * 再依次向上层输送排序好的两个子列进行排序直至整个数列有序（类比二叉树的思想，from down to up）。
 * <p>
 * 时间复杂度：O(NlogN) 　　稳定性：稳定
 * <p>
 * 归并操作(merge)，也叫归并算法，指的是将两个顺序序列合并成一个顺序序列的方法。
 * 如　设有数列{6，202，100，301，38，8，1}
 * 初始状态：6,202,100,301,38,8,1
 * 第一次归并后：{6,202},{100,301},{8,38},{1}，比较次数：3；
 * 第二次归并后：{6,100,202,301}，{1,8,38}，比较次数：4；
 * 第三次归并后：{1,6,8,38,100,202,301},比较次数：4；
 * 总的比较次数为：3+4+4=11
 * <p>
 * <p>
 * <p>
 * 归并操作的工作原理如下：
 * 第一步：申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
 * 第二步：设定两个指针，最初位置分别为两个已经排序序列的起始位置
 * 第三步：比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
 * 重复步骤3直到某一指针超出序列尾
 * 将另一序列剩下的所有元素直接复制到合并序列尾
 */
public class MergeSort {

    public static int[] mergeSort(int arr[]) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        return sort(arr, 0, arr.length - 1);
    }

    private static int[] sort(int[] arr, int l, int h) {
        if (l == h) {
            return new int[]{arr[l]};
        }

        int mid = l + (h - l) / 2;

        /**
         * 左有序数组
         */
        int leftArr[] = sort(arr, l, mid);

        /**
         * 右有序数组
         */
        int rightArr[] = sort(arr, mid + 1, h);

        /**
         * 新有序数组
         */
        int newNum[] = new int[leftArr.length + rightArr.length];

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            newNum[m++] = leftArr[i] < rightArr[j] ? leftArr[i++] : rightArr[j++];
        }

        while (i < leftArr.length) {
            newNum[m++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            newNum[m++] = rightArr[j++];
        }
        return newNum;
    }

}
