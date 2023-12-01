package enum_;

public class GradeApp {

    public static void main(String[] args) {

        Grade grade1 = Grade.GOLD;
        Grade grade2 = Grade.SILVER;
        Grade grade3 = Grade.BRONZE;

        // String name()
        String name1 = grade1.name();
        String name2 = grade2.name();
        String name3 = grade3.name();
        System.out.println("열거상수 이름: " + name1);
        System.out.println("열거상수 이름: " + name2);
        System.out.println("열거상수 이름: " + name3);

        // int ordinal()
        int index1 = grade1.ordinal();
        int index2 = grade2.ordinal();
        int index3 = grade3.ordinal();
        System.out.println("열거객체 순번: " + index1);
        System.out.println("열거객체 순번: " + index2);
        System.out.println("열거객체 순번: " + index3);

        // enum valueOf(String name)
        Grade gold = Grade.valueOf("GOLD");
        System.out.println(gold.name());

    }
}