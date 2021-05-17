package janken_sample;

public interface JankenStrategy {
    // どんなメソッドがあるのか羅列している
    public JankenHand nextHand();
    public default void prevHands(JankenHand myHand, JankenHand enemyHand) { }
}
