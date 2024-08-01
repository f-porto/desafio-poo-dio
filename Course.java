public class Course extends Content {
    private int hours;

    public Course(String title, String description, int hours) {
        super(title, description);
        this.hours = hours;
    }

    @Override
    public double computeXP() {
        return DEFAULT_XP * hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title=" + getTitle() +
                ", description=" + getDescription() +
                ", hours=" + hours +
                '}';
    }
}
