import java.util.Objects;

public class Author {
    private  String firstName;
    private  String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toSting() {
        return firstName+" "+lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return toSting().equals(c2.toSting());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName,lastName);
    }
}

