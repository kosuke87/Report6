package jp.ac.uryukyu.ie.e175757;
import java.util.Scanner;

/*
* 同じ数字を打った時の処理をしたかった
*
* */
public class NumJudge {
    static int numjudge(int a,int[]num){

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<13;i++){
            if(num[i]==a){
                a=sc.nextInt();
            }else if(num[i]!=a){
                num[i]=a;
                break;
            }
        }
        return a;
    }
}
