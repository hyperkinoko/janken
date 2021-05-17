package janken_sample;


// track上ではPlayerクラス
public class Pc {
    public JankenHand nextHand() {
        JankenStrategy strategy = new RandomStrategy();
        return strategy.nextHand();
    }
}
