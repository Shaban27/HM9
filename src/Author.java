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
       public String toString() {
        return "Author{" +"name='" + name + '\'' +", surname='" + surname + '\'' +'}';
    }
}


