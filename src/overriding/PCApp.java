package overriding;

public class PCApp {
    public static void main(String[] args) {

        // 다양한 프린터 객체를 준비
        Printer p1 = new Printer();
        ColorPrinter p2 = new ColorPrinter();
        PhotoPrinter p3 = new PhotoPrinter();

        // 컴퓨터 객체를 준비
        PC pc = new PC();

        // 컴퓨터 객체와 프린터 객체를 조립 후 인쇄
        pc.p = p1;
        pc.printDocument();

        pc.p = p2;
        pc.printDocument();

        pc.p = p3;
        pc.printDocument();
    }
}
