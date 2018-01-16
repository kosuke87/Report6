package jp.ac.uryukyu.ie.e175757;
import java.util.*; //Scannerが必要になるからimportした
public class Main  {
    public static void main(String[] args){
        Judgment judge =new Judgment();
        NumJudge numjudge = new NumJudge();

        Scanner sc=new Scanner(System.in);

        int player1;// player１の入力した値を保存する
        int player2;// player２の入力した値を保存する
        int count=0;// 何回目かをカウントするためのもの
        int[]num1=new int[13];//player1の入力した数字を保存
        int[]num2=new int[13];//player2の入力した数字を保存
        /*
        *for文で13回回す。
        * player1とplayer2別で入力する。
        * Judgmentのjudgeにplayer1とplayer2とカウントの引数を渡す。
        * voidなので戻り値はなし。
        * */
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
        /*
        * 合計勝利数を導き出す。
        * */
        judge.count();
    }

}
