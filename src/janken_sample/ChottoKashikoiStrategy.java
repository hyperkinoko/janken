package janken_sample;

public class ChottoKashikoiStrategy implements JankenStrategy {
    private JankenHand prevMyHand;
    private JankenHand prevEnemyHand;

    @Override
    public JankenHand nextHand() {
        if(prevMyHand == null || prevEnemyHand == null) {
            return new RandomStrategy().nextHand();
        }
        if(prevMyHand.winTo(prevEnemyHand)) {
            return JankenHand.fromInt(prevMyHand.ordinal() + 1);
        } else if (prevMyHand.loseTo(prevEnemyHand)) {
            return prevEnemyHand;
        } else {
            return prevMyHand;
        }
    }

    public void prevHands(JankenHand myHand, JankenHand enemyHand) {
        this.prevMyHand = myHand;
        this.prevEnemyHand = enemyHand;
    }

    
}
