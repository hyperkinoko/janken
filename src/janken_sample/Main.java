package janken_sample;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int JANKEN_COUNT = 5;

        int playerWin = 0;

        for(int i = 0; i < JANKEN_COUNT; i++) {
            System.out.print("手を入力してください（グー：0　チョキ：1　パー：2）> ");
            int playerNum = scanner.nextInt();
            JankenHand player = JankenHand.fromInt(playerNum);

            System.out.println("あなたの手：" + player);

            int pcNum = new Random().nextInt(3);
            JankenHand pc = JankenHand.fromInt(pcNum);

            System.out.println("PCの手：　" + pc);

            if(player.winTo(pc)) {
                System.out.println("あなたの勝ちです");
                playerWin++;
            } else if(player.loseTo(pc)){
                System.out.println("あなたの負けです");
            } else {
                System.out.println("あいこです");
            }
        }
        System.out.println(JANKEN_COUNT + "戦中" + playerWin + "回勝ちました");
        scanner.close();
    }
}