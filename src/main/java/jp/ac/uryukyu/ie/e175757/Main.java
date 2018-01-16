package jp.ac.uryukyu.ie.e175757;
import java.util.*;
public class Main  {
    public static void main(String[] args){
        Judgment judge =new Judgment();

        Scanner sc=new Scanner(System.in);

        int player1;
        int player2;
        int count=0;
        for(int i=0;i<13;i++) {
            count+=1;
            player1 = sc.nextInt();
            player2 = sc.nextInt();
            judge.judge(player1,player2,count);
        }
        judge.count(count);


    }

}
