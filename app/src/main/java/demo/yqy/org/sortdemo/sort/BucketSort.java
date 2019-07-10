package demo.yqy.org.sortdemo.sort;

/**
 * @author yqy
 * @create 19-7-10
 * @Describe 桶排序 - 实现线性排序，但当元素间值得大小有较大差距时会带来内存空间的较大浪费。
 * 首先，找出待排序列中得最大元素max，申请内存大小为max + 1的桶（数组）并初始化为0；
 * 然后，遍历排序数列，并依次将每个元素作为下标的桶元素值自增1；
 * 最后，遍历桶元素，并依次将值非0的元素下标值载入排序数列（桶元素>1表明有值大小相等的元素，
 * 此时依次将他们载入排序数列），遍历完成，排序数列便为有序数列。
 * <p>
 * 时间复杂度：O(x*N) 　　稳定性：稳定
 * <p>
 * 稳定性说明:
 * 假定在待排序的记录序列中，存在多个具有相同的关键字的记录，若经过排序，
 * 这些记录的相对次序保持不变，即在原序列中，r[i]=r[j]，且r[i]在r[j]之前，
 * 而在排序后的序列中，r[i]仍在r[j]之前，则称这种排序算法是稳定的；否则称为不稳定的。
 */
public class BucketSort {

    public static int[] bucketSort(int data[]) {
        int n = data.length;
        int bask[][] = new int[10][n];
        int index[] = new int[10];
        int max = Integer.MIN_VALUE;

        /**
         * 计算数组中,最大数的长度,比如99,长度为max就是2,199max的长度就是3
         */
        for (int i = 0; i < n; i++) {
            max = max > (Integer.toString(data[i]).length()) ? max : (Integer.toString(data[i]).length());
        }


        String str;
        for (int i = max - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                str = "";
                if (Integer.toString(data[j]).length() < max) {
                    for (int k = 0; k < max - Integer.toString(data[j]).length(); k++) {
                        str += "0";
                    }
                }

                str += Integer.toString(data[j]);
                System.out.println("");
                System.out.println("str =" + str+" str.charAt(i) - '0'"+(str.charAt(i) - '0')+" "+(index[str.charAt(i) - '0']++));
                bask[str.charAt(i) - '0'][index[str.charAt(i) - '0']++] = data[j];
            }

            int pos = 0;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < index[j]; k++) {
                    data[pos++] = bask[j][k];
                }
            }
            for (int x = 0; x < 10; x++) {
                index[x] = 0;
            }
        }
        return data;
    }
}
