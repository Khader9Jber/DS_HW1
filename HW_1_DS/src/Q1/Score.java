package Q1;

public class Score {

    private int score;

    public Score(int score) {
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int compareBetween(Score score) {
        if (this.score > score.getScore())
            return 1;
        else if (this.score == score.getScore())
            return 0;
        else
            return -1;
    }
}