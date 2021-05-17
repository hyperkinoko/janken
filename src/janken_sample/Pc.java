package janken_sample;

import java.util.Random;

// track上ではPlayerクラス
public class Pc implements JankenStrategy {
    public JankenHand nextHand() {
        int pcNum = new Random().nextInt(3);
        return JankenHand.fromInt(pcNum);
    }
}
