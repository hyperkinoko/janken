package janken_sample;

public class FixedHandStrategy implements JankenStrategy {

    @Override
    public JankenHand nextHand() {
        return JankenHand.Rock;
    }
    
}
