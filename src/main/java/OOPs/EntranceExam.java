package OOPs;

public class EntranceExam {
    public int examId;
    public String examName;

    public EntranceExam(int examId, String examName) {
        this.examId = examId;
        this.examName = examName;
    }

    public EntranceExam(EntranceExam e) {
        this.examId = e.examId;
        this.examName = e.examName;
    }
}
