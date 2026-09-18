public class bsSquareroot {
    public static void main(String[] args) {
        int n=40;
        int p=3;// pression till what number ir has to stop   
        System.out.printf("%3.f",squrt(n,p));
    }

    static double squrt(int n, int p) {
        int s = 0;
        int e = n;
    double root=0.0;

    while(s<=e){
        int m=s+(e-s)/2;
        if(m*m ==n){
            return m;

           }
           if(m*m>n){
            e=m-1;
            // root=(root+m)/2;
           }else{
            s=m+1;
            // root=(root+m)/2;
           }
        }

        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root*root <=n){
                root += incr;
            }
            root -= incr;
            incr /= 10;//for second decimal place
        }
        return root;
    }
}
