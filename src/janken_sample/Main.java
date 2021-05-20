package janken_sample;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        final int playcount = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("対戦相手の数を入力してください　：");
        int numberOfPc = scanner.nextInt();
        System.out.println("Cpの数 : " + numberOfPc);
        int count = 0;
        int playerWin = 0;
        while(count < playcount){
            System.out.print("手を入力してください(グー：0　チョキ：1　パー：2) > ");
            int playerNum = scanner.nextInt();
            JankenHand playerHand = JankenHand.fromInt(playerNum);
            System.out.println("あなたの手　:　" + playerHand);
            List<JankenHand> Cp = new ArrayList<>();
            List<Integer> PcNum = new ArrayList<>();
            for(int i = 0; i < numberOfPc; i++){
                PcNum.add(i, new Random().nextInt(3));
                Cp.add(i, JankenHand.fromInt(PcNum.get(i)));
                System.out.println("Cp"+ (i+1) + "の手 : " + Cp.get(i));
            }
            if(playerHand.winTo(Cp)){
                System.out.println("あなたの勝ちです");
                count ++;
                playerWin ++;
            }else if(playerHand.loseTo(Cp)){
                System.out.println("あなたの負けです");
                count ++;
            }else{
                System.out.println("あいこです");
            }
        }
        System.out.println( playcount + "戦中" + playerWin + "勝ちました。");
        scanner.close();
    }
}