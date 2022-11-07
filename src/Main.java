public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988,"Максим","Минск","Бренд менеджер");
        Human anna = new Human(1993,"Аня","Москва","методист образовательных программ");
        Human kata = new Human(1992,"Катя","Калининград","продакт менеджер");
        Human artem = new Human(1995,"Артем","Москва","директор по развитию бизнеса ");
        System.out.println(maxim.toString());
        System.out.println(anna.toString());
        System.out.println(kata.toString());
        System.out.println(artem.toString());
    }
}