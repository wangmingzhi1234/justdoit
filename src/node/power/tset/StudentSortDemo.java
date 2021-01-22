package node.power.tset;
/*
    学生成绩管理系统:
        1. 对成绩进行排序
        2. 计算数学、语文、英语升级的平均分
        3. 获取某个学科的最高分、最低分
            英语最高分  汪浩  99   是否查看其它学科分数   语文 、 数学成绩
 */
import java.util.Scanner;

public class StudentSortDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 定义数组 保存学生的 姓名  语文成绩  数学成绩  英语成绩
        String[] names = {"毛佳伟","赵子新","汪浩","匡攀"};
        int[] math = {66,99,88,55};
        int[] cn = {88,76,77,100};
        int[] en = {23,47,65,77};
        System.out.println("==================欢迎进入学生管理系统，信息如下：======================");
        print(names,math,cn,en);
        System.out.println("输入1按照语文成绩排序");
        System.out.println("输入2按照数学成绩排序");
        System.out.println("输入3按照英语成绩排序");
        System.out.println("输入0退出当前系统");
        System.out.println("=================================================================");
        a: while (true) {
            System.out.print("请输入操作选项：");
            int number = input.nextInt();
            switch (number) {
                case 1:
                    sort(cn,math,en,names);
                    print(names,math,cn,en);
                    break;
                case 2:
                    sort(math,cn,en,names);
                    print(names,math,cn,en);
                    break;
                case 3:
                    sort(en,math,cn,names);
                    print(names,math,cn,en);
                    break;
                case 0:
                    break a;
                default:
                    System.out.println("没有对应的功能，请联系管理员！");
            }
        }

        System.out.println("HelloWorld");
    }
    // 排序
    public static void sort( int[] mainScore , int[] score1 , int[]  score2 , String[] names ) {
        // 排序
        for( int i = 0; i < mainScore.length - 1; i++ ) {
            for( int j = i + 1; j < mainScore.length; j++ ) {
                if( mainScore[i] > mainScore[j]) {
                    // 交换数据
                    int temp = mainScore[i];
                    mainScore[i] = mainScore[j];
                    mainScore[j] = temp;

                    // 交换其它两门成绩

                    temp = score1[i];
                    score1[i] = score1[j];
                    score1[j] = temp;

                    temp = score2[i];
                    score2[i] = score2[j];
                    score2[j] = temp;

                    // 交换姓名
                    String str = names[i];
                    names[i] = names[j];
                    names[j] = str;
                }
            }
        }
    }

    // 定义方法，打印数组中的数据
    public static void print(String[] names, int[] math , int[] cn, int[] en ) {
        for( int i = 0; i < names.length; i++ ) {
            System.out.println( names[i] + "的数学成绩是:" + math[i] + "，\t语文成绩是:" + cn[i] + "，\t英语成绩是:" + en[i] );
        }

    }
}
