package typingPractice.util;

import typingPractice.obj.Typing;

public class TypingUtil {
    public static Typing getTyping(double start, double end, int correctCount, int totalCount) {
        return new Typing(start, end, correctCount, totalCount);
    }
    public static Typing getTyping(Typing... typings) {
        System.out.println("typing 갯수: " + typings.length);
        double duration = 0;
        int correctCount = 0;
        int totalCount = 0;

        for (Typing typing : typings ) {
            if (typing != null) {
                System.out.println(typing.getDuration()+"여기어떄!!!!!!!!");
                duration += typing.getDuration();
                correctCount += typing.getCorrectCount();
                totalCount += typing.getTotalCount();
            }
        }
        return new Typing(duration, correctCount, totalCount);
    }

    public static int countTypingCharacters(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (isKoreanCharacter(ch)) {
                count += 3; // 초성, 중성, 종성 세 개의 타수로 계산
            } else {
                count++; // 한글이 아닌 경우에는 1타로 계산
            }
        }
        return count;
    }

    public static boolean isKoreanCharacter(char ch) {
        // 한글 유니코드 범위: 가(0xAC00) ~ 힣(0xD7A3)
        return (ch >= '\uAC00' && ch <= '\uD7A3');
    }
}
