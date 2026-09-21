public class GCP{
      public void finalize() {
            System.out.println("Object is being garbage collected");
        }
    public static void main(String[] args) {
        //to perfome any operation in between gc happening use finalize method
      
        // Suggesting garbage collection
        // System.gc();

        // // Creating objects to demonstrate garbage collection
        // for (int i = 0; i < 1000; i++) {
        //     new GCP(); // Creating many objects to increase chances of GC
        // }

        // // Suggesting garbage collection again
        // System.gc();


        //unused obj
        //un-ref obj
        //anonymous obj

        GCP gcp1=new GCP();
        GCP gcp2=new GCP();
        GCP gcp3=new GCP();
        //the GC wont collect bcs all are referenced by gcp1,gcp2,gcp3
        //when we make them null then they become un-ref obj and GC can collect them


        gcp1=null;// gcp1 is now unreferenced, so the object it referenced can be garbage collected
        gcp2=gcp3; // gcp2 now references the same object as gcp3, so the original object of gcp2 becomes unreferenced

        System.gc(); // Suggesting garbage collection again
            //finalize() is deprecated since Java 9 and marked for removal in future Java versions.
            //might possiable for warnings
    }
}