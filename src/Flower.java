public class Flower {
    private String name;
    private String flowerColor;
    private double cost;
    private String country;
    int lifeSpan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    Flower (String name, String flowerColor, double cost, String country, int lifeSpan){
        this.name = name;
        if(flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()){
            this.flowerColor = "белый";
        }else{this.flowerColor = flowerColor;}
        if(cost<=0){
            this.cost = 1;
        }else{this. cost = cost;}
        if(country == null||country.isEmpty()||country.isBlank()){
            this.country = "Россия";
        }else{this.country = country;}
        if(lifeSpan <=0){
            this.lifeSpan = 3;
        }else{this.lifeSpan = lifeSpan;}
    }

    Flower (String name, double cost, String country, int lifeSpan){
        this.name = name;
        if(flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()){
            this.flowerColor = "белый";
        }else{this.flowerColor = flowerColor;}
        if(cost<=0){
            this.cost = 1;
        }else{this. cost = cost;}
        if(country == null||country.isEmpty()||country.isBlank()){
            this.country = "Россия";
        }else{this.country = country;}
        if(lifeSpan <=0){
            this.lifeSpan = 3;
        }else{this.lifeSpan = lifeSpan;}
    }

    Flower (String name, String flowerColor,  String country, int lifeSpan){
        this.name = name;
        if(flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()){
            this.flowerColor = "белый";
        }else{this.flowerColor = flowerColor;}
        if(cost<=0){
            this.cost = 1;
        }else{this. cost = cost;}
        if(country == null||country.isEmpty()||country.isBlank()){
            this.country = "Россия";
        }else{this.country = country;}
        if(lifeSpan <=0){
            this.lifeSpan = 3;
        }else{this.lifeSpan = lifeSpan;}
    }

    Flower (String name, String flowerColor, double cost,  int lifeSpan){
        this.name = name;
        if(flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()){
            this.flowerColor = "белый";
        }else{this.flowerColor = flowerColor;}
        if(cost<=0){
            this.cost = 1;
        }else{this. cost = cost;}
        if(country == null||country.isEmpty()||country.isBlank()){
            this.country = "Россия";
        }else{this.country = country;}
        if(lifeSpan <=0){
            this.lifeSpan = 3;
        }else{this.lifeSpan = lifeSpan;}
    }

    Flower (String name, String flowerColor, double cost, String country){
        this.name = name;
        if(flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty()){
            this.flowerColor = "белый";
        }else{this.flowerColor = flowerColor;}
        if(cost<=0){
            this.cost = 1;
        }else{this. cost = cost;}
        if(country == null||country.isEmpty()||country.isBlank()){
            this.country = "Россия";
        }else{this.country = country;}
        if(lifeSpan <=0){
            this.lifeSpan = 3;
        }else{this.lifeSpan = lifeSpan;}
    }

    @Override
    public String toString() {
        return "Название цветка - "+ name + " Цветок цвет - " + flowerColor + " стоимость " + cost + " страна " + country + " будет стоять " +
                lifeSpan + " дней ";
    }
}
