package janken_sample;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 手を入力してもらう
        System.out.print("手を入力してください（グー：0　チョキ：1　パー：2）> ");
        int player = scanner.nextInt();
        
        // 手を表示する
        System.out.print("あなたの手：　");
        switch(player) {
            case 0:
                System.out.println("グー");
                break;
            case 1:
                System.out.println("チョキ");
                break;
            case 2:
                System.out.println("パー");
                break;
        }

        // pc側：ランダムに0〜2を入れる
        int pc = new Random().nextInt(3);

        // 手を表示する
        System.out.print("PCの手：　");
        switch(pc) {
            case 0:
                System.out.println("グー");
                break;
            case 1:
                System.out.println("チョキ");
                break;
            case 2:
                System.out.println("パー");
                break;
        }

        // 勝ち負けの判定
        switch(player) {
            case 0:
                switch(pc) {
                    case 0:
                        System.out.println("あいこです");
                        break;
                    case 1:
                        System.out.println("あなたの勝ちです");
                        break;
                    case 2:
                        System.out.println("あなたの負けです");
                        break;
                }
                break;
            case 1:
                switch(pc) {
                    case 0:
                        System.out.println("あなたの負けです");
                        break;
                    case 1:
                        System.out.println("あいこです");
                        break;
                    case 2:
                        System.out.println("あなたの勝ちです");
                        break;
                }
                break;
            case 2:
                switch(pc) {
                    case 0:
                        System.out.println("あなたの勝ちです");
                        break;
                    case 1:
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("あいこです");
                        break;
                }
                break;
        }
    }
}

