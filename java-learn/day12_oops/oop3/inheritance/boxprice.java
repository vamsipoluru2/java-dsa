package day12_oops.oop3.inheritance;

public class boxprice extends boxweight{//multilevel inhertance
    double cost;

    boxprice(){
        super();
        this.cost=-1;
    }

    boxprice(boxprice other){
        super(other);
        this.cost=other.cost;

    }

    public boxprice(double l,double h,double w,double weight,double cost){
        super(l,w,h,weight);
        this.cost=cost;
    }

    public boxprice(double side,double weight,double cost){
        super(side,weight);//box wweight that has two argumnets
        this.cost=cost;
    }
}
