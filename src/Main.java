public class Main {
    public static void main(String[] args) {
        Human maxim = new Human(1988,"Максим","Минск","Бренд менеджер");
        Human anna = new Human(1993,"Аня","Москва","методист образовательных программ");
        Human kata = new Human(1992,"Катя","Калининград","продакт менеджер");
        Human artem = new Human(1995,"Артем","Москва","директор по развитию бизнеса ");
        Human pavel = new Human(-1,null,"","");
        Human vladimir = new Human(2001,"Владимир","Казань","");
        System.out.println(maxim.toString());
        System.out.println(anna.toString());
        System.out.println(kata.toString());
        System.out.println(artem.toString());
        System.out.println(pavel.toString());
        System.out.println(vladimir.toString());

        vladimir.setTown("");
        System.out.println(vladimir);
        System.out.println();
        System.out.println();
        Flower arch = new Flower("Архидея","Красный",12.51,5);
        System.out.println(arch.toString());
        Flower rose = new Flower("Роза",35.59,"Голландия",0);
        Flower criz = new Flower("Хризантема",15.0,"",5);
        Flower pion = new Flower("Пион",69.9,"Англия",1);
        Flower gipso = new Flower("Гипсофила",19.5,"Турция",10);
        System.out.println(rose.toString());
        System.out.println(criz.toString());
        System.out.println(pion.toString());
        System.out.println(gipso.toString());
        System.out.println();
        System.out.println();

        CalcBouque summ = new CalcBouque();
        System.out.println("Стоимость букета составит " +
                summ.calcBouque(rose, 2, criz, 2, pion, 2, gipso, 2) + " рублей " + " и простоит " +
        summ.days(rose,criz,pion,gipso) + " дней");

    }
}