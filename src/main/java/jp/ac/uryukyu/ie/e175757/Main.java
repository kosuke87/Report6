package jp.ac.uryukyu.ie.e175757;
import java.util.*;
public class Main  {
    public static void main(String[] args){
        Judgment judge =new Judgment();
        NumJudge numjudge = new NumJudge();

        Scanner sc=new Scanner(System.in);

        int player1;
        int player2;
        int count=0;
        int[]num1=new int[13];
        int[]num2=new int[13];
        for(int i=0;i<13;i++) {
            count+=1;

            System.out.println((i+1)+"回戦");
            System.out.println("player1のターン\n使用した数字");
            System.out.println(Arrays.toString(num1));
            player1 = sc.nextInt();
            num1[i]=player1;

            System.out.println("player2のターン\n使用した数字");
            System.out.println(Arrays.toString(num2));
            player2 = sc.nextInt();
            num2[i]=player2;

            judge.judge(player1,player2,count);
        }
        judge.count(count);
    }

}
