import java.util.Objects;

public class Author {
    private final String name;

    public Author(String name) {
        this.name = name;

    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name);
    }

    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
