package out.readings;

import java.time.LocalDateTime;

public abstract class Reading {
    private final LocalDateTime date;
    private final int measuring;

    protected Reading(LocalDateTime date, int measuring) {
        this.date = date;
        this.measuring = measuring;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getMeasuring() {
        return measuring;
    }

    @Override
    public String toString() {
        return "date=" + date +
                ", measuring=" + measuring;
    }
}
