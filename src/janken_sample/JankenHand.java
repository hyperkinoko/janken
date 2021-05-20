package janken_sample;

import java.util.*;
public enum JankenHand {
    Rock,
    Scissors,
    Paper;
    @Override
    public String toString(){
        switch(this){
            case Rock:
                return "グー";
            case Scissors:
                return "チョキ";
            case Paper:
                return "パー";
            default:
                return "";
        }
    }
    public static JankenHand fromInt(int n){
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
    public boolean winTo(List<JankenHand> list){
        if(list.contains(Rock) == false && list.get(0) == Paper){
            return this == Scissors;
        }
        else if(list.contains(Scissors) == false && list.get(0) == Rock){
            return this == Paper;
        }
        else if(list.contains(Paper) == false && list.get(0) == Scissors){
            return this == Rock;
        }
        return false;
    }
    public boolean loseTo(List<JankenHand> list){
        if(list.contains(Rock) == false && list.get(0) == Scissors){
            return this == Paper;
        }
        if(list.contains(Scissors) == false && list.get(0) == Paper){
            return this == Rock;
        }
        if(list.contains(Paper) == false && list.get(0) == Rock){
            return this == Scissors;
        }
        return false;
    }
    public boolean equals(JankenHand hand){
        if(hand instanceof JankenHand){
            JankenHand hand1 = (JankenHand)hand;
            return Rock.equals(hand1) || Scissors.equals(hand1) || Paper.equals(hand1);
        }
        return false;
    }
}