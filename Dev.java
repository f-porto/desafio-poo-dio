import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public record Dev(String name, Set<Content> subscribedContents, Set<Content> finishedContents) {
    public Dev(String name) {
        this(name, new LinkedHashSet<>(), new LinkedHashSet<>());
    }

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.subscribedContents.addAll(bootcamp.contents());
        bootcamp.subscriptions().add(this);
    }

    public void progress() {
        this.subscribedContents.stream().findFirst().ifPresentOrElse(
                (content) -> {
                    this.finishedContents.add(content);
                    this.subscribedContents.remove(content);
                },
                () -> System.err.println("You are not subscribed in any content")
        );
    }

    public double computeXP() {
        return this.finishedContents.stream().mapToDouble(Content::computeXP).sum();
    }
}
