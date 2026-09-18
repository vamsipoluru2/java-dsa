class Varargs {

	void sum(int... a) {//dynamically takes the arguments
		for(int i:a) {
			i+=i;
			System.out.println(i);
		}
		System.out.println("----------");
	}
    // method with varargs
    static void showNames(String... names) {
        System.out.println("Number of names: " + names.length);
        for (String n : names) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        showNames("Vamsi", "Rahul");
        showNames("Mudit", "Ravi", "Sruthi", "Bhavya");
        showNames(); // even zero arguments allowed
        System.out.println();
        Varargs v=new Varargs();
        v.sum(10);
        v.sum(20,30,40);
        v.sum(20,30);
        v.sum();
        
    }
}