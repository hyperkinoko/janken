package janken_sample;

public enum JankenHand {
    Rock,
    Scissors,
    Paper;

    public void displayHand() {
        switch(this) {
            case Rock:
                System.out.println("グー");
                break;
            case Scissors:
                System.out.println("チョキ");  
                break;
            case Paper:
                System.out.println("パー");
                break;
            default:
                return;
        }
    }
}
