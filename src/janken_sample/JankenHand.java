package janken_sample;

public enum JankenHand {
    Rock,
    Scissors,
    Paper;

    public String displayHand() {
        switch(this) {
            case Rock:
                return "グー";
            case Scissors:
                return "チョキ";  
            case Paper:
                return"パー";
            default:
                return "";
        }
    }
}
