package jp.ac.uryukyu.ie.e175757;

public class Judgment {
    int player1=0,player2=0;
    public void judge(int a,int b,int c) {
        NumJudge numjudge = new NumJudge();

        a = numjudge.numjudge(a);
        b = numjudge.numjudge(b);

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
    public void count(int c){

    }
}
