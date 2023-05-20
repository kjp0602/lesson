package date0520;

public class Student {

    public static void main(String[] args) {

        int[][] score = {
                { 70, 80, 60, 0, 0, 1 },
                { 80, 90, 90, 0, 0, 1 },
                { 90, 80, 90, 0, 0, 1 },
                { 75, 80, 80, 0, 0, 1 },
                { 60, 70, 70, 0, 0, 1 }
        };
        // 총점 평군
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < 3; j++) {
                score[i][3] = score[i][3] + score[i][j];
            }
            score[i][4] = score[i][3] / 3;
        }
        // 등수
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if(i == j) continue;
                if (score[i][3] < score[j][3]) {
                    score[i][5]++;
                }
            }
        }
        int[] tmp; //
        for(int i = 0; i < score.length; i++) {
            for(int j = i; j < score.length; j++) {
                if (i == j) continue;
                if (score[i][5] > score [j][5]) {
                    tmp = score[i];
                    score[i] = score[j];
                    score[j] = tmp;
                }
            }
        }

        for(int i = 0 ; i<score.length; i++) {
            for(int j = 0; j <score[i].length; j++){
                System.out.print(score[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
