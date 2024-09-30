class LoopArrayPractice {

	//Middle Value
	public int middleValue(int[] a) {

	int positiona = a.length;

	int positionb = positiona / 2 ; 

	return positionb; 

	}

	//Number Matches 
	//identifier expected???
	public int numMatches(String[] c, String check) {

	int number = 0;

	//what's the other way again
	for (int i = 0; i < c.length; i++) { 

		if (c[i].equals(check)) {

			number = number + 1;

		}

	}

	return number;

}

	//In Order
	public boolean inOrder(int[] e){

	boolean ascending = true;

	boolean descending = true;


	for (int i = 0; i < e.length-1; i++) {

		if (e[i] > e[ i + 1 ]) {

			ascending = false;

		//we cannot use .equal here as e[i] is a primitive data
		//changed structure
		} else if (e[i] < e[ i + 1 ]){

			descending = false;

		}

	}

		if (ascending) {

            System.out.println("The array is in ascending order.");

        } else if (descending) {

            System.out.println("The array is in descending order.");

		}

		return ascending || descending;

	}

	//Double Letter
	public boolean doubleLetter(String h){

	for(int i = 0; i < h.length-1; i++){

		if (h[i].equals(h[i+1])) {

			return true;
			
		} else {

			return false;

		}

	}


    }

    public boolean[] ddoubleLetter(String[] h) {

    	boolean[] results = new boolean[h.length];

    	for (int i = 0; i < h.length; i++) {

            results[i] = doubleLetter(h[i]); 

        }

        return results; 


    }

    public String[] bookEnds(String[]){
    	   
    	int count = 0;

    	    for (String word : words) {

    	        if (word.length() > 0 && word.charAt(0) == word.charAt(word.length() - 1)) {
    	            count++;

    	        }

    	    }

    	   
    	String[] result = new String[count];
    	       
    	int index = 0;

    	    for (String word : words) {

    	        if (word.length() > 0 && word.charAt(0) == word.charAt(word.length() - 1)) {

    	            result[index] = word;

    	            index++;

    	        }

    	    }

    	    return result; 
    	}


    }


	public static void main(String[] args) {

		int[] a = {1,2,3,4,5,6,7,8,9};

		//creating an instance here, but why?
		LoopArrayPractice b = new LoopArrayPractice();

		//how to access a function
		System.out.println(b.middleValue(a)); 

		String[] c = {"Amy", "Amy", "Amy", "Amy", "Amy", "Abby", "Abby"};

		String check = "Amy";

		//for every method we need a new instance?
		LoopArrayPractice d = new LoopArrayPractice();

		System.out.println(d.numMatches(c, check)); 

		int[] e = {8,7,6,5,2};

		LoopArrayPractice f = new LoopArrayPractice();

		System.out.println(f.inOrder(e)); 

		LoopArrayPractice g = new LoopArrayPractice();	

		String[] h = {"Considine", "Phillips", "Vankatesh", "Elliott", "Droubay", "Woolley"};

        boolean[] output = g.ddoubleLetter(input);

		System.out.print("Consecutive letters results: ");

        for (boolean hasDouble : output) {

            System.out.print(hasDouble + " ");

        }

        String[] input = {"bob", "jim", "sally", "anna", "joe", "elle", "zbhskdjez"};

    	String[] output = practice.bookEnds(input); 

    	System.out.print("Words that start and end with the same character: ");

    	for (String word : output) {

        System.out.print(word + " ");

    	}

    	System.out.println();

		}
