package gradeapp;

import java.util.List;
import java.util.Scanner;

public class ScoreUI {
    ScoreService service = new ScoreService();
    Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        ScoreUI ui = new ScoreUI();
        ui.신규등록();
        ui.성적수정하기();
        ui.학번순조회();
        ui.성적순조회();
    }

    public void 학번순조회() {
        System.out.println("\n[학번순 조회]");
        List<Score> scores = service.getAllScores();
        System.out.println("학번\t 이름\t국어\t영어\t수학\t총점\t평균");
        for (Score score : scores) {
            System.out.print(score.getNo() + "\t");
            System.out.print(score.getName() + "\t");
            System.out.print(score.getKor() + "\t");
            System.out.print(score.getEng() + "\t");
            System.out.print(score.getMath() + "\t");
            System.out.print(score.getTotal() + "\t");
            System.out.println(score.getAverage() + "\t");
        }
    }

    public void 성적순조회() {
        System.out.println("\n[성적순 조회]");
        List<Score> scores = service.getSortedScores();
        System.out.println("학번\t 이름\t국어\t영어\t수학\t총점\t평균");
        for (Score score : scores) {
            System.out.print(score.getNo() + "\t");
            System.out.print(score.getName() + "\t");
            System.out.print(score.getKor() + "\t");
            System.out.print(score.getEng() + "\t");
            System.out.print(score.getMath() + "\t");
            System.out.print(score.getTotal() + "\t");
            System.out.println(score.getAverage() + "\t");
        }
    }

    public void 신규등록() {
        System.out.println("\n[성적 정보 등록]");
        System.out.print("학번입력: ");
        int no = kb.nextInt();
        System.out.print("이름입력: ");
        String name = kb.next();
        System.out.print("국어입력: ");
        int kor = kb.nextInt();
        System.out.print("수학입력: ");
        int math = kb.nextInt();
        System.out.print("영어입력: ");
        int eng = kb.nextInt();

        Score score = new Score(no, name, kor, eng, math);
        service.addNewScore(score);
    }

    public void 성적수정하기() {
        System.out.println("\n[성적 정보 수정하기]");
        System.out.println("학번과 성적정보를 입력하세요.");
        System.out.print("학번 입력: ");
        int no = kb.nextInt();
        System.out.print("국어점수 입력: ");
        int kor = kb.nextInt();
        System.out.print("영어점수 입력");
        int eng = kb.nextInt();
        System.out.print("수합점수 입력: ");
        int math = kb.nextInt();

        service.updateScore(no, kor, eng, math);
    }
}
