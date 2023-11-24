package gradeapp;

import java.util.Comparator;
import java.util.List;

public class ScoreService {
    private ScoreRepository repo = new ScoreRepository();

    public void addNewScore(Score score) {
        Score savedScore = repo.findByNo(score.getNo());
        if (savedScore != null) {
            throw new RuntimeException("[" + score.getNo() + "] 성적정보가 이미 등록되어 있습니다.");
        }
        repo.save(score);
    }

    public List<Score> getAllScores() {
        List<Score> list = repo.findAll();
        list.sort(new Comparator<Score>() {
            // 각각의 성적 정보를 학번을 기준으로 오름차순 정렬시키기 위한 구현
            public int compare(Score s1, Score s2) {
                return s1.getNo() - s2.getNo();
            }
        });
        return list;
    }

    public List<Score> getSortedScores() {
        List<Score> list = repo.findAll();
        // 총점순으로 내림차순 정렬시키기
        list.sort((s1, s2) -> s2.getTotal() - s1.getTotal());
        return list;
    }

    public void updateScore(int no, int kor, int eng, int math) {
        Score savedScore = repo.findByNo(no);
        if (savedScore == null) {
            throw new RuntimeException("[" + no + "] 성적정보가 존재하지 않습니다.");
        }
        savedScore.setKor(kor);
        savedScore.setEng(eng);
        savedScore.setMath(math);

        savedScore.reduce();
    }
}
