package algorithm4Test;

/**
 * 选择排序:
 * 先选一个最大（最小的）拿出来排序，然后在未排序的元素继续上面的操作
 * （这个要注意循环的设置，我设置一个length-1，直接导致后面的顺序有两个没排上）
 */
public class SelectSort {

    private void selectSortMethod( int arr[]){
        int length = arr.length;

        for(int i = 0 ; i < length; i++){
            for(int j = i+1; j < length ; j++){
                if( arr[i] < arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            soutArr(arr);
        }
    }

    private void soutArr(int arr[]){
        String result = "";
       for(int i = 0 ;i < arr.length; i ++ ){
           result = result + arr[i];
       }
        System.out.println(result);
    }

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int arrTest[] = {1,3,4,6,9,2};
        selectSort.selectSortMethod(arrTest);

        for(int n = 0; n < arrTest.length; n++){
            System.out.println(arrTest[n]);
        }
        selectSort.soutArr(arrTest);
    }


}
