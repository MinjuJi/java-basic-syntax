package gradeapp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScoreRepository {
    private ArrayList<Score> list = new ArrayList<>();

    public ScoreRepository() {
        list.add(new Score(22, "김유신", 70, 50, 90));
        list.add(new Score(11, "강감찬", 80, 60, 90));
        list.add(new Score(33, "이순신", 90, 70, 90));
        list.add(new Score(44, "류관순", 70, 50, 90));
        list.add(new Score(88, "안중근", 80, 60, 90));
        list.add(new Score(66, "김좌진", 90, 70, 90));
        list.add(new Score(99, "홍범도", 70, 50, 90));
        list.add(new Score(55, "정약용", 80, 60, 90));
        list.add(new Score(77, "안창호", 90, 70, 90));
    }

    public void save(Score socre) {
        list.add(socre);
    }

    public List<Score> findAll() {
        return (List<Score>) list.clone();
    }

    public Score findByNo(int no) {
        for (Score score : list) {
            if (score.getNo() == no) {
                return score;
            }
        }
        return null;
    }

    public List<Score> findByName(String name) {
        List<Score> foundScores = new ArrayList<>();
        for (Score score : list) {
            if (score.getName().equals(name)) {
                foundScores.add(score);
            }
        }
        return foundScores;
    }

    public void deleteByNo(int no) {
        Iterator<Score> itr = list.iterator();
        while (itr.hasNext()) {
            Score score = itr.next();
            if (score.getNo() == no) {
                itr.remove();
                break;
            }
        }
    }
}
