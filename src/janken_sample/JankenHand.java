package janken_sample;

public enum JankenHand {
    Rock,
    Scissors,
    Paper;
 
    public static JankenHand fromInt(int n) {
        switch(n % 3) {
            case 0:
                return Rock;
            case 1:
                return Scissors;
            case 2:
                return Paper;
            default:
                return null;
        }
    }

    public boolean winTo(JankenHand hand){
        switch(this) {
            case Rock:
                return hand == Scissors;
            case Scissors:
                return hand == Paper;
            case Paper:
                return hand == Rock;
            default:
                return false;
        }
    }

    public boolean loseTo(JankenHand hand) {
        return this != hand && !this.winTo(hand);
    }

    @Override
    public String toString() {
        switch(this) {
            case Rock:
                return "✊";
            case Scissors:
                return "チョキ";  
            case Paper:
                return "✋";
            default:
                return "";
        }
    }
}
