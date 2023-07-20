import java.util.Queue;
import java.util.Stack;

public class ParenthesesChecker {

    private Stack<String> elements;

    public boolean checkParentheses(String testString){
        elements = new Stack<String>();
        for (int i = 0; i < testString.length(); i++){
            char num = testString.charAt(i);
            elements.add(Character.toString(num));
        }
        int counterLeftBracket = 0;
        int counterRightBracket = 0;
        int counterLeftSquareBracket = 0;
        int counterRightSquareBracket = 0;
        int counterLeftAngleBracket = 0;
        int counterRightAngleBracket = 0;
        int counterLeftCurlyBracket = 0;
        int counterRightCurlyBracket = 0;

        for (String element : elements){
            if (element.equals("(") ){
                counterLeftBracket += 1;
            } else if (element.equals(")")) {
                counterRightBracket += 1;
            } else if (element.equals("[") ){
                counterLeftSquareBracket += 1;
            } else if (element.equals("]")) {
                counterRightSquareBracket += 1;
            } else if (element.equals("<") ){
                counterLeftAngleBracket += 1;
            } else if (element.equals(">")) {
                counterRightAngleBracket += 1;
            } else if (element.equals("{") ){
                counterLeftCurlyBracket += 1;
            } else if (element.equals("}")) {
                counterRightCurlyBracket += 1;
            }
        }

        return counterLeftBracket == counterRightBracket && counterLeftSquareBracket == counterRightSquareBracket && counterLeftAngleBracket == counterRightAngleBracket && counterRightCurlyBracket == counterLeftCurlyBracket;
    }


}
