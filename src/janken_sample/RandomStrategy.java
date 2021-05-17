package janken_sample;

import java.util.Random;

public class RandomStrategy implements JankenStrategy {

    @Override
    public JankenHand nextHand() {
        int pcNum = new Random().nextInt(3);
        return JankenHand.fromInt(pcNum);
    }
    
}
