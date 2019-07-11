package demo.yqy.org.sortdemo.sort;

/**
 * @author yqy
 * @create 19-7-10
 * @Describe 基数排序 - 桶排序的改进版，桶的大小固定为10，减少了内存空间的开销。
 * 首先，找出待排序列中得最大元素max，并依次按max的低位到高位对所有元素排序；
 * 桶元素10个元素的大小即为待排序数列元素对应数值为相等元素的个数，即每次遍历待排序数列，
 * 桶将其按对应数值位大小分为了10个层级，桶内元素值得和为待排序数列元素个数。
 * <p>
 * 时间复杂度：O(x*N) 　　稳定性：稳定
 * <p>
 * <p>
 * 第一步
 * 以LSD为例，假设原来有一串数值如下所示：
 * 73, 22, 93, 43, 55, 14, 28, 65, 39, 81
 * 首先根据个位数的数值，在走访数值时将它们分配至编号0到9的桶子中：
 * 0
 * 1 81
 * 2 22
 * 3 73 93 43
 * 4 14
 * 5 55 65
 * 6
 * 7
 * 8 28
 * 9 39
 * 第二步
 * 接下来将这些桶子中的数值重新串接起来，成为以下的数列：
 * 81, 22, 73, 93, 43, 14, 55, 65, 28, 39
 * 接着再进行一次分配，这次是根据十位数来分配：
 * 0
 * 1 14
 * 2 22 28
 * 3 39
 * 4 43
 * 5 55
 * 6 65
 * 7 73
 * 8 81
 * 9 93
 * 第三步
 * 接下来将这些桶子中的数值重新串接起来，成为以下的数列：
 * 14, 22, 28, 39, 43, 55, 65, 73, 81, 93
 * 这时候整个数列已经排序完毕；如果排序的对象有三位数以上，则持续进行以上的动作直至最高位数为止。
 */
public class CountSort {

    public static void countSort(int arr[]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        /**
         * 计算数组中,最大数的长度,比如99,长度为max就是2,199max的长度就是3
         */
        for (int i = 0; i < n; i++) {
            max = max > (Integer.toString(arr[i]).length()) ? max : (Integer.toString(arr[i]).length());
        }

        sort(arr, max);
    }

    /**
     * @param arr
     * @param d   表示最大的数有多少位
     */
    private static void sort(int arr[], int d) {
        int k = 0;
        int n = 1;
        int m = 1;
        int temp[][] = new int[10][arr.length];
        int order[] = new int[10];

        while (m <= d) {
            for (int i = 0; i < arr.length; i++) {
                /**
                 * 当n = 1的时候求的是个位置的值
                 * 当n = 10的时候求的是10位置的值
                 */
                int lsd = ((arr[i] / n) % 10);

                /**
                 * 将值放入到对应的桶中
                 * [lsd]:第几个桶
                 * [order[lsd]]:这个桶总第几个位置,一个桶中有可能存放多个
                 */
                temp[lsd][order[lsd]] = arr[i];
                order[lsd]++;
            }


            /**
             * 桶子中的数值重新串接起来
             */
            for (int i = 0; i < 10; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        arr[k] = temp[i][j];
                        k++;
                    }
                    order[i] = 0;
                }
            }

            n *= 10;
            k = 0;
            m++;
        }
    }


}
