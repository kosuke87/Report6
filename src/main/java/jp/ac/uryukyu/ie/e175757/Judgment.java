package jp.ac.uryukyu.ie.e175757;

public class Judgment {
    private int player1=0,player2=0;//勝利数をカウントするためのもの
    /*
    * 数字が大きい方の処理その中で、1は13に勝てるような処理をした。
    * 引き分けの処理
    * */
    public void judge(int a,int b,int c) {
        if (a < b || b < a) {
            if ((a == 1 || b == 1) && (a == 13 || b == 13)) {
                if (a < b) {
                    System.out.println(c + "回戦目player1の勝ち");
                    player1 += 1;
                } else {
                    System.out.println(c + "回戦目player2の勝ち");
                    player2 += 1;
                }
            } else if (a > b) {
                System.out.println(c + "回戦目player1の勝ち");
                player1 += 1;
            } else {
                System.out.println(c + "回戦目player2の勝ち");
                player2 += 1;
            }
        } else if (a == b) {
            System.out.println(c + "回戦目は引き分け");
        }
    }
    /*
    * 勝利判定
    * */
    public void count(){
        if(player1>player2){
            System.out.println("player1の"+player1+"回勝利");
        }else if(player2>player1){
            System.out.println("player2の"+player2+"回勝利");
        }else{
            System.out.println("引き分け");
        }
    }
}
