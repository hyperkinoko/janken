package janken_sample;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("手を入力してください（グー：0　チョキ：1　パー：2）> ");
        Scanner scanner = new Scanner(System.in);

        int playerNum = scanner.nextInt();
        JankenHand player = JankenHand.fromInt(playerNum);

        scanner.close();

        System.out.println("あなたの手：" + player);

        int pcNum = new Random().nextInt(3);
        JankenHand pc = JankenHand.fromInt(pcNum);

        System.out.println("PCの手：　" + pc);

        if(player.winTo(pc)) {
            System.out.println("あなたの勝ちです");
        } else if(player.loseTo(pc)){
            System.out.println("あなたの負けです");
        } else {
            System.out.println("あいこです");
        }
        // switch(player) {
        //     case 0:
        //         switch(pc) {
        //             case 0:
        //                 System.out.println("あいこです");
        //                 break;
        //             case 1:
        //                 System.out.println("勝ち!!!");
        //                 break;
        //             case 2:
        //                 System.out.println("あなたの負けです");
        //                 break;
        //         }
        //         break;
        //     case 1:
        //         switch(pc) {
        //             case 0:
        //                 System.out.println("あなたの負けです");
        //                 break;
        //             case 1:
        //                 System.out.println("あいこです");
        //                 break;
        //             case 2:
        //                 System.out.println("勝ち!!!");
        //                 break;
        //         }
        //         break;
        //     case 2:
        //         switch(pc) {
        //             case 0:
        //                 System.out.println("あなたの勝ちです");
        //                 break;
        //             case 1:
        //                 System.out.println("");
        //                 break;
        //             case 2:
        //                 System.out.println("あいこです");
        //                 break;
        //         }
        //         break;
        // }
    }
}