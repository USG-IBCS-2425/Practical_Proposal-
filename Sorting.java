import java.util.*;

class Sorting {

    public static void BubbleSort(ArrayList<Integer> a) {
    	//the first loop that allows us to control the length/ scope of the second loop
        for (int i = 0; i < a.size() - 1; i++) { 
        	//here the size of the second loop is controlled by i
            for (int x = 0; x < a.size() - 1 - i; x++) {
            	//the two values being compared is getted here
                int current = a.get(x);       
                int next = a.get(x + 1);      

                //if statement allows us to compare the two values
                if (current > next) {
                    a.set(x, next);
                    //if the case has been met, the two values switch
                    a.set(x + 1, current);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
		int n = 2000;
		//method to generate an arraylist that has 100 random generated numbers
		for (int i = 0; i < n; i++) {
			int newNum = 1 + (int)(Math.random()*n);
			a.add(newNum);
		}
		System.out.println(a);

        System.out.println("Original list: " + a);

        //here is the method to record the time
        long start = System.nanoTime();
		BubbleSort(a);
		long end = System.nanoTime();
		long total = end - start;

        System.out.println("Sorted list: " + a);

        System.out.println("Bubble Sort took " + total + " nanoseconds!");

        
    }
}
