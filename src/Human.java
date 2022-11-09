public class Human {
    int yearOfBrith;
    String name;
    String town;
    String post;


    public Human(int yearOfBrith, String name, String town, String post){
        if(yearOfBrith<0){
            this.yearOfBrith =0;
        }else{this.yearOfBrith = yearOfBrith;}
        if (name == null || name == "") {
            this.name = "Информация не указана ";
        }else{this.name = name;}
        if(town == null || town == ""){
            this.town = "Информация не указана ";
        }else{this.town = town;}
        if(post == null||post ==""){
            this.post = "Информация не указана ";
        }else{this.post = post;}
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
        if(yearOfBrith < 0 ){
            this.yearOfBrith = 0;
        }else {this.yearOfBrith = yearOfBrith;}
    }

    public void setName(String name) {
        if(name == "" || name.isEmpty() || name.isBlank()){
            this.name = "!Информация не указана!";
        }else{this.name = name;}
    }

    public void setTown(String town) {
        if(town == "" || town.isEmpty() || town.isBlank()){
            this.town = "!Информация не указана!";
        }else{this.town = town;}
    }

    @Override
    public String toString() {
        return "Привет, меня зовут "+ name +" я из города "+ town + " я родился в " + yearOfBrith+" году" +
                " я работаю " + post;
    }
}
