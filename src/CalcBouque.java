public class CalcBouque {
    public double calcBouque( Flower rose, int n1, Flower criz, int n2, Flower pion, int n3, Flower gips, int n4){
        double summ = (rose.getCost() * n1 +criz.getCost()*n2+ pion.getCost()* n3 + gips.getCost()*n4);
        summ += summ * 0.1;
        return summ;
    }
    public int days(Flower rose,  Flower criz,  Flower pion,  Flower gips){
        int minDay = rose.lifeSpan;
        if(minDay> criz.lifeSpan){
            minDay = criz.lifeSpan;
        }
        if(minDay> pion.lifeSpan){
            minDay = pion.lifeSpan;
        }
        if(minDay> gips.lifeSpan){
            minDay = gips.lifeSpan;
        }
        return minDay;

    }
}
