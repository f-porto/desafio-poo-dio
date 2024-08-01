import java.time.LocalDate;

public class Mentorship extends Content {
    private LocalDate date;

    public Mentorship(String title, String description, LocalDate date) {
        super(title, description);
        this.date = date;
    }

    @Override
    public double computeXP() {
        return DEFAULT_XP + 20;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentorship{" +
                "title=" + getTitle() +
                ", description=" + getDescription() +
                ", date=" + date +
                '}';
    }
}
