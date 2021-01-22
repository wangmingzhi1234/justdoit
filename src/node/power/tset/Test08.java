package node.power.tset;
// 数组的排序有7种 :  选择排序
public class Test08 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = { 3,12,-3,0,8,22,5 }; // { -3,0,3,5,8,12,22 };
        System.out.print("排序前:");
        print(arr);
        // 排序
        sortArray(arr);
        System.out.print("排序后:");
        print(arr);
    }

    // 数组排序
    public static void sortArray( int[] arr ) {
        for( int i = 0; i < arr.length - 1; i++ ) {
            for( int j = i + 1; j < arr.length; j++ ) {
                // 判断比较两个数据的大小关系
                if( arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    // 定义打印数组
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
