public class Human {
    int yearOfBrith;
    String name;
    String town;
    String post;


    public Human(int yearOfBrith, String name, String town, String post){
        this.yearOfBrith = yearOfBrith;
        this.name = name;
        this.town = town;
        this.post = post;
    }

    public int getYearOfBrith() {
        return yearOfBrith;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public void setYearOfBrith(int yearOfBrith) {
        this.yearOfBrith = yearOfBrith;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public String toString() {
        return "Привет, меня зовут "+ name +" я из города "+ town + " я родился в " + yearOfBrith+" году" +
                " я работаю " + post;
    }
}
