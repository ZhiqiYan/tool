package com.yzq.manage.test.algorithm;

import java.util.Arrays;

/**
 * @description: 排序相关算法
 *  1.冒泡排序
 *  2.选择排序
 *  3二分查找
 *  4.Arrays.sort()
 *  5.Arrays.binarySearch()
 *  6.Arrays.toString()
 *
 * @author: yanzhiqi
 * @create: 2018-07-31 13:22
 **/
public class SortTest {
    //待排序的数组
    private static Integer[] waitSortArray= new Integer[]{67,23,86,99,45,78,33,56,21,17};

    public static void main(String[] args) {
        Integer[] sortedArray = new Integer[]{};
        //冒泡排序
//        sortedArray = bubbleSort(waitSortArray);
//        printArray(sortedArray);

        Arrays.sort(waitSortArray);
        printArray(waitSortArray);
        System.out.println(Arrays.toString(waitSortArray));

        int index = Arrays.binarySearch(waitSortArray, 88);
        System.out.println(index);

//        //选择排序：
//        sortedArray = selectSort(waitSortArray);
//        //打印排序后的数组
//        printArray(sortedArray);
    }


    /***
     * 冒泡排序：
     * 相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
     * @param waitSortArray
     */
    private static Integer[] bubbleSort(Integer[] waitSortArray){
        if(waitSortArray == null){
            return waitSortArray;
        }
        for (int i = 0; i < waitSortArray.length; i++) {        //外层循环控制排序趟数
            for (int j = 0; j < waitSortArray.length - i - 1; j++) {  //内层循环控制每一趟排序多少次
                if(waitSortArray[j] > waitSortArray[j+1]){
                    int temp =  waitSortArray[j+1];
                    waitSortArray[j+1] = waitSortArray[j];
                    waitSortArray[j]= temp;
                }
            }

        }
        return waitSortArray;
    }

    /***
     * 选择排序
     * 从0索引开始，依次和后面元素比较，大的往后放，第一次完毕，最大值出现在了最大索引处
     * @param waitSortArray
     * @return
     */
    private static Integer[] selectSort(Integer[] waitSortArray){
        if(waitSortArray == null){
            return waitSortArray;
        }
        for(int i = 0;i < waitSortArray.length - 1;i++){
            for(int j = i+1;j < waitSortArray.length;j++){
                if(waitSortArray[i] > waitSortArray[j]){
                    int temp =  waitSortArray[j];
                    waitSortArray[j] = waitSortArray[i];
                    waitSortArray[i]= temp;
                }
            }
        }
        return waitSortArray;
    }

    private static void printArray(Integer[] array){
        if(array == null){
            return;
        }
        StringBuffer sb = new StringBuffer();
        for (Integer integer : array) {
            sb.append(integer).append(", ");
        }
        System.out.println(sb.toString());

    }


}
