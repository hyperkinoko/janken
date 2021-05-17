package janken_sample;


// track上ではPlayerクラス
public class Pc {
    private JankenStrategy strategy;

    public void setStrategy(JankenStrategy strategy) {
        this.strategy = strategy;
    }

    public void setPrevHandsToStrategy(JankenHand myHand, JankenHand enemyHand) {
        this.strategy.prevHands(myHand, enemyHand);
    }
    
    public JankenHand nextHand() {
        return this.strategy.nextHand();
    }
}
