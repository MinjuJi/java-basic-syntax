package overriding;

public class PrinterApp {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        p1.print();

        ColorPrinter p2 = new ColorPrinter();
        p2.print();

        Printer p3 = new ColorPrinter();
        p3.print();
        System.out.println(p3.black);
        System.out.println(((ColorPrinter) p3).black);

//      ColorPrinter p4 = new Printer(); // 오류
    }
}
