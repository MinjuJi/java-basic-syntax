package enum_;

public enum Grade2 {
    GOLD("골드", 0.1),
    SILVER("실버", 0.05),
    BRONZE("브론즈", 0.0125);

    private final String name;
    private final double depositRate;

    Grade2(String name, double depositRate) {
        this.name = name;
        this.depositRate = depositRate;
    }

    public String getName() {
        return name;
    }

    public double getDepositRate() {
        return depositRate;
    }
}
