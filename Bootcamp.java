import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public record Bootcamp(String name, String description, LocalDate initialDate, LocalDate finalDate,
                       Set<Dev> subscriptions, Set<Content> contents) {
    public Bootcamp(String name, String description, LocalDate date) {
        this(name, description, date, date.plusDays(45), new HashSet<>(), new LinkedHashSet<>());
    }
}
