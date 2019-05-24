package algorithm4Test;

/**
 * 插入排序
 */

public class InsertionSort {

    private  void insertSort(int arr[]){

        int length = arr.length;

        for (int i = 0 ; i < length; i++ ){
            //这个条件很巧妙，把第一个放过去
            for(int j = i ; j > 0 && arr[j] > arr[j-1]; j--){
                    swap(arr,j,j - 1);
            }
            soutArr(arr);
        }

    }

    private void swap (int arr[], int indexA ,int indexB){
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    private void soutArr(int arr[]){

        String result = "";

        for(int i = 0;  i < arr.length; i++ ){
            result = result +arr[i] + ",";
        }
        System.out.println(result);
    }



    public static void main(String[] args) {
        int testArr[] = {2,5,1,6,8,3,0,7};

        InsertionSort insertionSort = new InsertionSort();

        insertionSort.insertSort(testArr);
        insertionSort.soutArr(testArr);
    }
}
