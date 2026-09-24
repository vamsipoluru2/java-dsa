import java.util.ArrayList;

public class diceamazon {
    public static void main(String[] args) {
        dice("", 4);
        System.out.println("");
        System.out.print(dicelist(" ", 5));
        
        //n face die
        // diceface("", 8,9);
        System.out.println("");
        System.out.print(dicefacelist(" ", 5,9));


        
    }

    static void dice(String p, int target){
        if(target ==0){
            System.out.print(p+",");
            return;
        }
        for(int i=1; i<=6 && i<=target; i++){//for i to use till required target
            dice(p+i, target-i);
        }

    }

    //n face die

    static void diceface(String p, int target,int face){
        if(target ==0){
            System.out.println(p+",");
            return;
        }
        for(int i=1; i<=face && i<=target; i++){//for i to use till required target
            diceface(p+i, target-i,face);
        }

    }
    static ArrayList<String> dicelist(String p, int target){
        if(target ==0){
           
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        for(int i=1; i<=6 && i<=target; i++){//for i to use till required target
            list.addAll(dicelist(p+i, target-i));

        }
        return list;

    }

    //die face return in arraylist
    
    static ArrayList<String> dicefacelist(String p, int target,int face){
        if(target ==0){
           
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        for(int i=1; i<=face && i<=target; i++){//for i to use till required target
            list.addAll(dicefacelist(p+i, target-i,face));

        }
        return list;

    }
    
}
