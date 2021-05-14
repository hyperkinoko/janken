package janken_sample;

public enum JankenHand {
    Rock,
    Scissors,
    Paper;

    public String displayHand() {
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
