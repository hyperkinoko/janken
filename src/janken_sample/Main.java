package janken_sample;

import java.util.*;

public class Main {
    static final int JANKEN_COUNT = 10; // 定数

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerWin = 0;

        for(int i = 0; i < JANKEN_COUNT; i++) {
            System.out.print("手を入力してください（グー：0　チョキ：1　パー：2）> ");
            int playerNum = scanner.nextInt();
            JankenHand playerHand = JankenHand.fromInt(playerNum);

            System.out.println("あなたの手：" + playerHand);

            Pc pc = new Pc();
            JankenHand pcHand = pc.nextHand();

            System.out.println("PCの手：　" + pcHand);

            if(playerHand.winTo(pcHand)) {
                System.out.println("あなたの勝ちです");
                playerWin++;
            } else if(playerHand.loseTo(pcHand)){
                System.out.println("あなたの負けです");
            } else {
                System.out.println("あいこです");
            }
        }
        System.out.println(JANKEN_COUNT + "戦中" + playerWin + "回勝ちました");
        scanner.close();
    }
}