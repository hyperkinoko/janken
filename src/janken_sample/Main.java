package janken_sample;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("手を入力してください（グー：0　チョキ：1　パー：2）> ");
        Scanner scanner = new Scanner(System.in);

        int playerNum = scanner.nextInt();
        JankenHand player;

        switch(playerNum) {
            case 0:
                player = JankenHand.Rock;
                break;
            case 1:
                player = JankenHand.Scissors;
                break;
            case 2:
                player = JankenHand.Paper;
                break;
            default:
                return;
        }

        System.out.println("あなたの手：" + player);

        int pc = new Random().nextInt(3);

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
            default:
                return;
        }

        // switch(player) {
        //     case 0:
        //         switch(pc) {
        //             case 0:
        //                 System.out.println("あいこです");
        //                 break;
        //             case 1:
        //                 System.out.println("あなたの勝ちです");
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
        //                 System.out.println("あなたの勝ちです");
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