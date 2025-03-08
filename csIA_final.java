import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class csIA_final { 
	private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    static int adv = 0;
    static int part = 0;
    static int Pilates = 0;
    static int quote = 0;

    static class ButtonDemo {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    static int adv = 0;
    static int part = 0;
    static int Pilates = 0;
    static int quote = 0;

    public ButtonDemo() {
        mainFrame = new JFrame("Button Examples");
        mainFrame.setSize(3000,1000);
        mainFrame.setLayout(new GridLayout(3, 1));
        headerLabel = new JLabel("",JLabel.CENTER );
        statusLabel = new JLabel("",JLabel.CENTER);        
        statusLabel.setSize(500,100);
      
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }        
        });    
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    public void showWelcome() {

        headerLabel.setText("Are you in the mood of doing Pilates today?"); 

        JButton yesButton = new JButton("yes");
        JButton noButton = new JButton("no");

        yesButton.setActionCommand("yes");
        noButton.setActionCommand("no");

        yesButton.addActionListener(new ButtonClickListener()); 
        noButton.addActionListener(new ButtonClickListener());

        controlPanel.add(yesButton);
        controlPanel.add(noButton);
    
        mainFrame.setVisible(true);

        //https://stackoverflow.com/questions/29441968/how-does-addactionl
        //istenere-work-is-it-better-than-an-actionlistener

        yesButton.addActionListener(e -> showLevel());
        noButton.addActionListener(e -> showQuote1());
    }

    public void showLevel() { 
            
            //https://java-buddy.blogspot.com/2014/02/java-swing-example-add-and-remove-ui.html
            controlPanel.removeAll();

            //https://stackoverflow.com/questions/1097366/java-swing-revalidate-vs-repaint
            mainFrame.revalidate(); 
            mainFrame.repaint();

            headerLabel.setText("Thank you! Let's continue. What level are you for Pilates?");

            JButton beginnerButton = new JButton("Beginner Level");
            JButton intermediateButton = new JButton("Intermediate level");
            JButton advancedButton = new JButton("Advanced level");

            beginnerButton.setActionCommand("Beginner Level");
            intermediateButton.setActionCommand("Intermediate level");
            advancedButton.setActionCommand("Advanced level");

            beginnerButton.addActionListener(new ButtonClickListener()); 
            intermediateButton.addActionListener(new ButtonClickListener());
            advancedButton.addActionListener(new ButtonClickListener());

            controlPanel.add(beginnerButton);
            controlPanel.add(intermediateButton);
            controlPanel.add(advancedButton);

            mainFrame.setVisible(true);

            beginnerButton.addActionListener(e -> showBody());
            intermediateButton.addActionListener(e -> showBody());
            advancedButton.addActionListener(e -> showBody());

    }

    public void showBody() {
        controlPanel.removeAll();

        mainFrame.revalidate(); 
        mainFrame.repaint();

                headerLabel.setText("Thank you. Let's continue. What body part do you want to work on today?");

                JButton absButton = new JButton("the abs");
                JButton backButton = new JButton("the back muscle");
                JButton glutesButton = new JButton("the glutes");
                JButton hipsButton = new JButton("the hips");
                JButton pelvisButton = new JButton("the pelvis");

                absButton.setActionCommand("the abs");
                backButton.setActionCommand("the back muscle");
                glutesButton.setActionCommand("the glutes");
                hipsButton.setActionCommand("the hips");
                pelvisButton.setActionCommand("the pelvis");
        
                absButton.addActionListener(new ButtonClickListener()); 
                backButton.addActionListener(new ButtonClickListener());
                glutesButton.addActionListener(new ButtonClickListener());
                hipsButton.addActionListener(new ButtonClickListener());
                pelvisButton.addActionListener(new ButtonClickListener());

                controlPanel.add(absButton);
                controlPanel.add(backButton);
                controlPanel.add(glutesButton);
                controlPanel.add(hipsButton);
                controlPanel.add(pelvisButton); 

                mainFrame.setVisible(true);

                absButton.addActionListener(e -> showPilates());
                backButton.addActionListener(e -> showPilates());
                glutesButton.addActionListener(e -> showPilates());
                hipsButton.addActionListener(e -> showPilates());
                pelvisButton.addActionListener(e -> showPilates());
    }

    public void showQuote1() {
        controlPanel.removeAll();
        mainFrame.revalidate(); 
        mainFrame.repaint();

        headerLabel.setText("Do you need something to cheer you up?"); 

        JButton yesButton = new JButton("yes");
        JButton noButton = new JButton("no");

        yesButton.setActionCommand("yes1");
        noButton.setActionCommand("no1");

        yesButton.addActionListener(new ButtonClickListener()); 
        noButton.addActionListener(new ButtonClickListener());

        controlPanel.add(yesButton);
        controlPanel.add(noButton);
    
        mainFrame.setVisible(true);

        yesButton.addActionListener(e -> showQuote2());
        noButton.addActionListener(e -> showEnd());

    }

    public void showQuote2() {
        controlPanel.removeAll();
        mainFrame.revalidate(); 
        mainFrame.repaint();

        headerLabel.setText("It seems like you are in more of a mood"
                                +  "to learn an inspiration quote.");

        JButton thankButton = new JButton("Thank you");

        thankButton.setActionCommand("thankyou");

        thankButton.addActionListener(new ButtonClickListener()); 

        controlPanel.add(thankButton);

        mainFrame.setVisible(true); 

        /*double specific = getWeb(1,3);
		double ran = getLevel(1,3);
		webpage(specific, ran);*/
		new WebsiteLoader().execute();

    }

    public void showPilates() {
        controlPanel.removeAll();
        mainFrame.revalidate(); 
        mainFrame.repaint();

        headerLabel.setText("It seems like you are in more of a mood "
                                + "to learn something about Pilates.");

        JButton thankButton = new JButton("Thank you");

        thankButton.setActionCommand("thankyou");

        thankButton.addActionListener(new ButtonClickListener()); 

        controlPanel.add(thankButton);

        mainFrame.setVisible(true);

        /*double specific = getWeb(1,3);
		double ran = getLevel(1,3);
		webpage(specific, ran);*/
		new WebsiteLoader().execute();
    }

    public void showEnd() {
        controlPanel.removeAll();
        mainFrame.revalidate(); 
        mainFrame.repaint();

        headerLabel.setText("Thank you for using this generator. Hope I can help you next time."); 

        JButton thankButton = new JButton("Thank you");

        thankButton.setActionCommand("thankyou");

        thankButton.addActionListener(new ButtonClickListener()); 

        controlPanel.add(thankButton);

        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            String command = e.getActionCommand(); 

        if (command.equals("yes")) {
            Pilates++;
            } else if (command.equals("Beginner Level")) {
                adv++;   
                } else if (command.equals("the abs")) {
                    part++;
                } else if (command.equals("the back muscle")) {
                    part = part+2;
                } else if (command.equals("the glutes")) {
                    part = part+3;
                } else if (command.equals("the hips")) {
                    part = part+4;
                } else if (command.equals("the pelvis")){
                    part = part+5;
                } else if (command.equals("Intermediate Level")) {
                    adv = adv + 2; 
                } else if (command.equals("advanced Level")){
                adv = adv + 3; 
                } else if (command.equals("no")){
                Pilates = Pilates - 1;
                } else if(command.equals("yes1")){
                quote++;
                } else {
                quote = quote - 1;
            }

        }

    }

}

	public static double getWeb(int min, int max) {
    double dob = ((Math.random() * (max - min)) + min);
    return dob; 
	}

	public static double getLevel(int min, int max) {
    double ran = ((Math.random() * (max - min)) + min);
    return ran; 
	}

	public static void webpage(double specific, double ran){

    	int a = (int) specific;
    	int b = (int) adv;
    	int c = (int) part;
    	int d = (int) ran;

		try{
		File file = new File("web.html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		if (quote == 1 ) {
			if(a == 1) {
				bw.write("<html><head>DAILY INSPIRATION QUOTE<title>New Page"
					+ "</title></head><body><p>The universe is full of magical things"
					+ " patiently waiting for our wits to grow sharper. -- Eden Phillpotts"
					+ "</p><img src='patience.jpg' alt='rocks next to river'></body></html>");
				bw.flush();
				bw.close();
			} else if (a == 2) {
				bw.write("<html><head>DAILY INSPIRATION QUOTE<title>New Page"
					+ "</title></head><body><p>From our first babblings to our"
					+ " last word, we make but one statement, and that is our life."
					+ " -- Richard Paul Evans</p><img src='life.jpg' alt='a shoot'></"
					+ "body></html>");
				bw.flush();
				bw.close();
			} else if (a == 3) {
				bw.write("<html><head>DAILY INSPIRATION QUOTE<title>New Page</title>"
					+ "</head><body><p>You mustn't confuse a single failure with a final"
					+ " defeat. -- F. Scott Fitzgerald</p><img src='failure.jpg' alt='men "
					+ "doing rock climbing'></body></html>");
				bw.flush();
				bw.close();
			}
		} else if (Pilates == 1) {
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
        ButtonDemo a = new ButtonDemo();
        a.showWelcome();


	}
}