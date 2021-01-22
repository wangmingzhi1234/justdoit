package node.power.tset;

import java.util.Random;

/*
     需求: 数组中保存30个随机字符，计算数组中数字字符、小写字母字符、大写字母字符的个数
     分析：
        1. 创建字符数组，长度定义为30
        2. 定义方法，使用随机数生产33-145之间的随机数据保存到字符数组中，就会变成对应字符
        3. 定义方法，对保存了随机字符的数组进行遍历，取出每个字符数据判断类型保存到对应的变量中
            3.1 将结果输出
     注：可以定义遍历数组的方法，查看数组中的字符数据。
 */
public class Test06 {
    public static void main(String[] args) {
        // 1. 创建字符数组，长度定义为30
        char[] arr = new char[30];
        setArray(arr);
        print(arr);
        getCount(arr);


    }
    // 3. 定义方法，对保存了随机字符的数组进行遍历，取出每个字符数据判断类型保存到对应的变量中
    public static void getCount( char[] arr ) {
        // 定义3个变量 ，保存数据
        int numberCount = 0; // 数字
        int maxCount = 0; // 大写字母
        int minCount = 0; // 小写字母
        for( int i = 0; i < arr.length;i++ ) {
            // 判断类型
            if( arr[i] >= '0' && arr[i] <= '9' ) {
                numberCount++;
            } else if( arr[i] >= 'a' && arr[i] <= 'z') {
                minCount++;
            } else if( arr[i] >= 'A' && arr[i] <= 'Z') {
                maxCount++;
            }
        }
        System.out.println( numberCount + ".." + maxCount + "..." + minCount);
    }
    // 2. 定义方法，使用随机数生产33-145之间的随机数据保存到字符数组中，就会变成对应字符
    public static void setArray(char[] arr) {
        // 创建随机数对象
        Random r = new Random();
        for( int i = 0; i < arr.length ;i++ ) {
            arr[i] = (char)(r.nextInt(145 - 33 + 1) + 33);
        }
    }
    //可以定义遍历数组的方法，查看数组中的字符数据。
    public static void print(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
