package demo.yqy.org.sortdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import demo.yqy.org.sortdemo.sort.BobbleSort;
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
        int arr[] = Utils.createArr(25, 100);
        Utils.prinArr(arr);


        //BobbleSort.bubbleSort(arr);//冒泡排序
        //InserSort.insertSort(arr);//插入排序
        //QuickSort.quickSort(arr,0,arr.length-1);//快速排序
        //SelectSort.selectSort(arr);//选择排序
        ShellSort.shellSort(arr);

        System.out.println("");
        Utils.prinArr(arr);

    }
}
