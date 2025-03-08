import java.util.*;
import java.io.*;
import java.awt.Desktop;
//import java.awt.event.*;
//import javax.swing.*;


public class csIA_final2 { 
	static int adv = 0;
	static int part = 0;

	public static int questionnaire(){

		int Pilates = 0;
		int quote = 0;

		Scanner input = new Scanner(System.in); 

		System.out.println("Hello, this is your personalized Pilates generator."); 
		System.out.println("We will start with a short questionnaire");
		
		//questions 1: the user name
		System.out.println("What is your name?");

		String answer_name = input.nextLine();

		System.out.println("Hello" + " " + answer_name + "!");

    	//question 2: mood?
    while(true){
    	System.out.println("Are you in the mood of doing Pilates today? Please answer by a yes or no."); 
		 
		String answer_Pilates = input.nextLine();

		if (answer_Pilates.equals("yes")){
    		System.out.println("Thank you! Let's continue.");

    		while(true){
    		//question 2.5: level of Pilates
    		System.out.println("What level are you for Pilates?");
    		System.out.println("1. Beginner Level");
    		System.out.println("2. Intermediate level");
    		System.out.println("3. Advanced level");
    		System.out.println("Please let me know how skilled you are by typing in" +
    							" the number in front of your choice.");
    		String answer_Pilates2 = input.nextLine();
    		Pilates = Pilates + 1;
    		if(answer_Pilates2.equals("1")){
    			System.out.println("Thank you! Let's continue.");
    			adv++;
    			System.out.println("What body part do you want to work on today?");
    			System.out.println("1. the abs");
    			System.out.println("2. the back muscle");
    			System.out.println("3. the glutes");
    			System.out.println("4. the hips");
    			System.out.println("5. the pelvis");
    			String answer_Pilates3 = input.nextLine();

    			if(answer_Pilates3.equals("1")){
    			System.out.println("Thank you! Let's continue.");
    			part++;
    			break;
    		} else if (answer_Pilates3.equals("2")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 2;
    			break;
    		} else if (answer_Pilates3.equals("3")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 3;
    			break;
    		} else if (answer_Pilates3.equals("4")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 4;
    			break;
    		} else if (answer_Pilates3.equals("5")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 5;
    			break;
    		}

    	} else if (answer_Pilates2.equals("2")) {
    			System.out.println("Thank you! Let's continue.");
    			adv = adv + 2;
    			System.out.println("What body part do you want to work on today?");
    			System.out.println("1. the abs");
    			System.out.println("2. the back muscle");
    			System.out.println("3. the glutes");
    			System.out.println("4. the hips");
    			System.out.println("5. the pelvis");
    			String answer_Pilates3 = input.nextLine();

    			if(answer_Pilates3.equals("1")){
    			System.out.println("Thank you! Let's continue.");
    			part++;
    			break;
    		} else if (answer_Pilates3.equals("2")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 2;
    			break;
    		} else if (answer_Pilates3.equals("3")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 3;
    			break;
    		} else if (answer_Pilates3.equals("4")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 4;
    			break;
    		} else if (answer_Pilates3.equals("5")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 5;
    			break;
    		} else {
				System.out.println("Sorry, I don't understand. Please answer"
									+ " again through the number in front of your choice."); 			
    		}
    		} else if (answer_Pilates2.equals("3")) {
    			System.out.println("Thank you! Let's continue.");
    			adv = adv + 3;
    			System.out.println("What body part do you want to work on today?");
    			System.out.println("1. the abs");
    			System.out.println("2. the back muscle");
    			System.out.println("3. the glutes");
    			System.out.println("4. the hips");
    			System.out.println("5. the pelvis");
    			String answer_Pilates3 = input.nextLine();
    			
    			if(answer_Pilates3.equals("1")){
    			System.out.println("Thank you! Let's continue.");
    			part++;
    			break;
    		} else if (answer_Pilates3.equals("2")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 2;
    			break;
    		} else if (answer_Pilates3.equals("3")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 3;
    			break;
    		} else if (answer_Pilates3.equals("4")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 4;
    			break;
    		} else if (answer_Pilates3.equals("5")) {
    			System.out.println("Thank you! Let's continue.");
    			part = part + 5;
    			break;
    		}

    		} else {
				System.out.println("Sorry, I don't understand. Please answer again through the number in front of your choice."); 			
    		}
    	}
    	break;

    	} else if (answer_Pilates.equals("no")) {
    		System.out.println("Thank you! Let's continue.");
    		Pilates = Pilates - 1;
    		//question 3: inspiration quote
				while(true){
					System.out.println("Do you need something to cheer you up?");
					System.out.println("Please answer by yes or no.");

					String answer_quote = input.nextLine();

					if (answer_quote.equals("yes")) {
						System.out.println("Okay!");
						quote = quote + 1;
						break;
					} else if (answer_quote.equals("no")) {
						System.out.println("Alright!");
						quote = quote - 1;
						break;
					} else {
						System.out.println("Sorry, I don't understand. Please answer again through a yes or no.");
					}

				}
    			break;
		} else {
			System.out.println("Sorry, I don't understand. Please answer again through a yes or no.");
		}
	}

		

	int result = calculate(quote, Pilates);
	return result;

}

	public static int calculate(int quote, int Pilates) {
		int result = 0;

		if(quote > Pilates){
			System.out.println("It seems like you are in more of a mood "
								+ "to learn an inspiration quote.");
			result = 1;
		} else if (quote < Pilates) {
			System.out.println("It seems like you are in more of a mood "
								+ "to learn something about Pilates.");
			result = 2;
		} 
		return result;
	}

	public static double getWeb(int min, int max) {
    double dob = ((Math.random() * (max - min)) + min);
    return dob; 
	}

	public static double getLevel(int min, int max) {
    double ran = ((Math.random() * (max - min)) + min);
    return ran; 
	}

	public static void webpage(int result, double dob, double ran){

    	int a = (int) dob;
    	int b = (int) adv;
    	int c = (int) part;
    	int d = (int) ran;

		try{
		File file = new File("web.html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		if (result == 1) {
			if(a == 1) {
				bw.write("<html><head>DAILY INSPIRATION QUOTE<title>New Page"
					+ "</title></head><body><p>The universe is full of magical things"
					+ " patiently waiting for our wits to grow sharper. -- Eden Phillpotts"
					+ "</p><img src='patience.jpg' alt='rocks next to river'></body></html>");
			} else if (a == 2) {
				bw.write("<html><head>DAILY INSPIRATION QUOTE<title>New Page"
					+ "</title></head><body><p>From our first babblings to our"
					+ " last word, we make but one statement, and that is our life."
					+ " -- Richard Paul Evans</p><img src='life.jpg' alt='a shoot'></"
					+ "body></html>");
			} else if (a == 3) {
				bw.write("<html><head>DAILY INSPIRATION QUOTE<title>New Page</title>"
					+ "</head><body><p>You mustn't confuse a single failure with a final"
					+ " defeat. -- F. Scott Fitzgerald</p><img src='persistence.jpg' alt='men "
					+ "doing rock climbing'></body></html>");
			}
		} else if (result == 2) {
			if(b == 1) {
				if(c == 1) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https://www."
							+ "youtube.com/embed/VyvuWt3XVRI?si=KWYIMlBFzHu2dsHQ\" title="
							+ "\"YouTube video player\" frameborder=\"0\" allow=\"acceleromete;"
							+ "autoplay; clipboard-write; encrypted-media; gyroscope; "
							+ "picture-in-picture; web-share\" referrerpolicy\""
							+ "=strict-origin-when-cross-origin\" allowfullscreen></iframe"
							+ "></body></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https:"
							+ "//www.youtube.com/embed/oXRVRYLHt5A?si=kC7ZJDgPGLLm0A6V\" "
							+ "title=\"YouTube video player\" frameborder=\"0\" allow=\""
							+ "accelerometer; autoplay; clipboard-write; encrypted-media;"
							+ " gyroscope; picture-in-picture; web-share\" referrerpolicy=\"s"
							+ "trict-origin-when-cross-origin\" allowfullscreen></iframe>"
							+ "</body></html>");

					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/G16eeqO2U7g?si=LXMr-glHOaDTOwDN\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 2) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https:"
							+ "//www.youtube.com/embed/sacNb0RrptE?si=7YDoMC1EEOjUfTvy\" ti"
							+ "tle=\"YouTube video player\" frameborder=\"0\" allow=\"acce"
							+ "lerometer; autoplay; clipboard-write; encrypted-media; gyrosc"
							+ "ope; picture-in-picture; web-share\" referrerpolicy=\"strict"
							+ "-origin-when-cross-origin\" allowfullscreen></iframe>></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https:"
							+ "//www.youtube.com/embed/ChYOlljDZ8s?si=qB1ebNP_LTfZcWEV\" ti"
							+ "tle=\"YouTube video player\" frameborder=\"0\" allow=\"acce"
							+ "lerometer; autoplay; clipboard-write; encrypted-media; gyrosc"
							+ "ope; picture-in-picture; web-share\" referrerpolicy=\"strict"
							+ "-origin-when-cross-origin\" allowfullscreen></iframe>></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https://"
							+ "www.youtube.com/embed/UJ-YhIpnyBY?si=jM6EK6I0OyBjudpP\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"a"
							+ "ccelerometer; autoplay; clipboard-write; encrypted-media; "
							+ "gyroscope; picture-in-picture; web-share\" referrerpolicy=\"s"
							+ "trict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 3) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https:/"
							+ "/www.youtube.com/embed/qpyHGCCx2cM?si=7Q3Qilx9HgmxdNmX\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"ac"
							+ "celerometer; autoplay; clipboard-write; encrypted-media; gy"
							+ "roscope; picture-in-picture; web-share\" referrerpolicy=\"s"
							+ "trict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https://"
							+ "www.youtube.com/embed/q45JADC-FLU?si=stX0zCh8G97dFiJ-\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"ac"
							+ "celerometer; autoplay; clipboard-write; encrypted-media; g"
							+ "yroscope; picture-in-picture; web-share\" referrerpoli"
							+ "cy=\"strict-origin-when-cross-origin\" allowfullscreen></ifr"
							+ "ame></body></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https:/"
							+ "/www.youtube.com/embed/I6LqZwKtJJM?si=06dZJF7YuA1e4jUS\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"ac"
							+ "celerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"stric"
							+ "t-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 4) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https://"
							+ "www.youtube.com/embed/-I-8SWoEFTE?si=mvgo2yFeYoUACDH0\" ti"
							+ "tle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyro"
							+ "scope; picture-in-picture; web-share\" referrerpolicy=\"stri"
							+ "ct-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https:/"
							+ "/www.youtube.com/embed/NrByRRLs-sk?si=XnfJP_aBnsB9AKzr\" ti"
							+ "tle=\"YouTube video player\" frameborder=\"0\" allow=\"ac"
							+ "celerometer; autoplay; clipboard-write; encrypted-media; gy"
							+ "roscope; picture-in-picture; web-share\" referrerpolicy=\"st"
							+ "rict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");	
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https:/"
							+ "/www.youtube.com/embed/ISiJbX-6dGs?si=6jSFCn2HLWdnjE_d\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"ac"
							+ "celerometer; autoplay; clipboard-write; encrypted-media; gy"
							+ "roscope; picture-in-picture; web-share\" referrerpolicy=\"st"
							+ "rict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 5) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https:/"
							+ "/www.youtube.com/embed/vC_oO_Qm-V0?si=hgV2WjrnLXkpVc4Q\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"ac"
							+ "celerometer; autoplay; clipboard-write; encrypted-media; gy"
							+ "roscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/h25xnqmTkaY?si=jVVbJIbTveSfGabR\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/68YgEdcR1Rk?si=pm_To6Fgg0Iggj4s\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				}
			} else if (b == 2) {
				if(c == 1) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/U5LwQW_IQOc?si=LIdhgVXknwoA3E3C\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/KQ6b-_dC1Mo?si=PcaYidtjxHEokImS\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/sQp904QUFc0?si=6wJpwK_LDKAqX5HC\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 2) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/AMLSBnAxLbU?si=pjK3CUy2fOuEcN9a\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/XvqHUMXjQ68?si=xy9PEYz8UKKF61-E\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/oiToJsf_SQ4?si=kuDbq9-tlaedrQ9j\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 3) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/vELfo3PbGhE?si=X2rIDTos_8LuvNIk\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/bn8f3EAS0UQ?si=f6eYOjSiXpbLQSMz\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/kF3xvsvm_ZM?si=NxJjZu2ocGgCyNkx\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 4) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/UyoqRHklKjc?si=pHKREAGvt5AUSHDs\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/1ltZQ9rJiFw?si=DjqgA__7_0G-ExQT\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/XDt6xS3dI60?si=jh5hwBpJ5PO6iurt\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 5) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/yywNPwneVMc?si=CDGUZjZOzfCY7iAx\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/Mq1ip1AAkA8?si=mpeyO8ab7z7sH5M\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/MQx_miaKNwo?si=R9_N9plop4o2T9fS\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				}
			} else if (b == 3) {
				if(c == 1) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/zv7kSlx7mqE?si=BiymCyZl1aKePEr5\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/em90DnK629o?si=7tYvbZWXeKwy8nvA\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/-1wOKgtrT-w?si=DquJ9G9euapW8QzN\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 2) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/_HnWLkHL1hU?si=3sRV_TYZJHcIrAcM\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/o062bxRT1EA?si=BGx7NWJ6ZYiNdegu\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/jyWEHAkgI2g?si=jvD2QDR1R_re6y1T\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 3) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/yU5uWAMed7k?si=TGVtFgp0lhRzTg22\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/C3dOmoBtwoM?si=gAojGxKXN6bOmjOi\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/usPZYAW56z0?si=QQYp0ALQR8jG8EFV\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 4) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/jK0MFj1tKos?si=L7IK3VNfUoVsXrVr\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/R1IGZKl6v-U?si=Mi6WhGfkCOUjP6q8\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/NrByRRLs-sk?si=0Jmme9snVSkLccbN\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				} else if (c == 5) {
					if (d == 1) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/frXOYImfZx8?si=cw1JDkazUo9J3U5B\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 2) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/v1io7RUEgdY?si=FlbpqfwnHGRG1ywR\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} else if (d == 3) {
						bw.write("<html><head><title>PILATE EXERCISE"
							+ "</title></head><body><p>Here is a video for you today."
							+ "</p><iframe width=\"1000\" height=\"600\" src=\"https"
							+ "://www.youtube.com/embed/wap38dcIhtE?si=9HsGZErtmFA6qE_z\" t"
							+ "itle=\"YouTube video player\" frameborder=\"0\" allow=\"acc"
							+ "elerometer; autoplay; clipboard-write; encrypted-media; gyr"
							+ "oscope; picture-in-picture; web-share\" referrerpolicy=\"str"
							+ "ict-origin-when-cross-origin\" allowfullscreen></iframe></bo"
							+ "dy></html>");
					} 
				}
			}
		} 

		bw.close();
		Desktop.getDesktop().browse(file.toURI());

	} catch (IOException x){
		System.out.println("Error occured.");
	}
	}

	public static void main(String[] args) { 

		int result = questionnaire();
		double specific = getWeb(1,3);
		double ran = getLevel(1,3);
		webpage(result, specific, ran);

	}

}

