package abstraction;

public class ChartApp {
    public static void main(String[] args) {
        Chart c1 = new LineChart();
        Chart c2 = new BarChart();

        c1.draw();
        c2.draw();
    }
}
