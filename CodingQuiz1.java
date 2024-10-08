import java.util.*;

class CodingQuiz1 {
	public static String printArray(int[] a){
		String answera = " ";
		for (int i= 0; i < a.length; i++){
			answera = answera + a[i] + ",";
		}
		return answera;
	}

	public static int[] powersOf2(int b){

		int[] answerb = new int[5];

		int two = 2;

		for(int i = 1; i < b; i++){

				two = two * 2;

				answerb[i] = two;

				return answerb;

			}

		if (b == 1){

			two = 2;

			answerb[1] = two;

		}

		return answerb;

	}





	public static void main(String[] args) {
		int[] a= {3,6,7,1,10};
		System.out.println("[" + printArray(a) + "]");
		int b = 5;
		System.out.println("["+ powersOf2(b) + "]");
	}
}