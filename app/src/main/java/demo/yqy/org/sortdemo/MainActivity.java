package demo.yqy.org.sortdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import demo.yqy.org.sortdemo.sort.BobbleSort;
import demo.yqy.org.sortdemo.sort.BucketSort;
import demo.yqy.org.sortdemo.sort.CountSort;
import demo.yqy.org.sortdemo.sort.HeapSort;
import demo.yqy.org.sortdemo.sort.InserSort;
import demo.yqy.org.sortdemo.sort.QuickSort;
import demo.yqy.org.sortdemo.sort.SelectSort;
import demo.yqy.org.sortdemo.sort.ShellSort;
import demo.yqy.org.sortdemo.sort.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = Utils.createArr(5, 100);
        Utils.prinArr(arr);


        //BobbleSort.bubbleSort(arr);//冒泡排序
        //InserSort.insertSort(arr);//插入排序
        //QuickSort.quickSort(arr,0,arr.length-1);//快速排序
        //SelectSort.selectSort(arr);//选择排序
        //ShellSort.shellSort(arr);//希尔排序
        //HeapSort.heapSort(arr);//堆排序
        //BucketSort.bucketSort(arr);//桶序
        CountSort.countSort(arr);//基数排序

        System.out.println("");
        Utils.prinArr(arr);

    }
}
