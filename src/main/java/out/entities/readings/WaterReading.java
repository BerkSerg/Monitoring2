package out.readings;

import java.time.LocalDateTime;

public class WaterReading extends Reading{
    private final String type = "water";
    private final boolean isHot;

    public WaterReading(LocalDateTime date, int measuring, boolean isHot) {
        super(date, measuring);
        this.isHot = isHot;
    }

    @Override
    public String toString() {
        return "WaterReading{" +
                super.toString() +
                "type='" + type + '\'' +
                ", isHot=" + isHot +
                '}';
    }
}
