import java.util.Objects;

public record Person(String name, int age) {
    public Person {
        Objects.requireNonNull(name);
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
