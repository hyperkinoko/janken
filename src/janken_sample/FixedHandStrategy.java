package janken_sample;

public class FixedHandStrategy implements JankenStrategy {
    private final JankenHand hand;

    public FixedHandStrategy(JankenHand hand) {
        this.hand = hand;
    }

    @Override
    public JankenHand nextHand() {
        return this.hand;
    }
    
}
