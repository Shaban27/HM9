import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;
    public  Author (String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
    public String getIvanov (){
        return surname;
    }
    public String getIvan (){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String toString() {
        return "Author{" +"name='" + name + '\'' +", surname='" + surname + '\'' +'}';

    }

}


