import java.util.*;

class twentyQuestions1 {
    String[] possibleAnswers;
    ArrayList<String> currentPossibleAnswers;
    int questionsAsked;
    String lastQuestion;

    public twentyQuestions1(String[] inputPossibleAnswers) {
        possibleAnswers = inputPossibleAnswers;
        currentPossibleAnswers = new ArrayList<>(Arrays.asList(possibleAnswers));
        questionsAsked = 0;
        lastQuestion = "";
    }

    public String askQuestion() {
        questionsAsked++;
        
        if (questionsAsked == 1) {
            lastQuestion = "Is the character a princess?";
        } 

        else if (questionsAsked == 2) {
            if (currentPossibleAnswers.contains("Cinderella")) {
                lastQuestion = "Is the character blonde?";
            } else {
                lastQuestion = "Is the character human?";
            }
        }

        else if (questionsAsked == 3) {
            if (currentPossibleAnswers.contains("Cinderella")){
                lastQuestion = "Does the character has magic?";
            } else if(currentPossibleAnswers.contains("Belle")){
                lastQuestion = "Does the character talks to animals?";
            } else if(currentPossibleAnswers.contains("Aladdin")){ 
                lastQuestion = "Is the character from Middle Eastern areas?";
            } else {
                lastQuestion = "Is the characater living in a jungle?";
            }
        }


        else if (questionsAsked == 4) {
            if (currentPossibleAnswers.contains("Belle")) {
                lastQuestion = "Is this character friends with the Beast?";
            } else {
                lastQuestion = "Is this character a police officer?";
            }

        } else {
            lastQuestion = "No more questions.";
        }

        return lastQuestion;

    }
    

    public void updateAnswers(String userInput) {

        if (questionsAsked == 1) {
            if(userInput.contains("yes")){
                currentPossibleAnswers.remove("Micky Mouse");
                currentPossibleAnswers.remove("Aladdin");
                currentPossibleAnswers.remove("Simba");
                currentPossibleAnswers.remove("Judy Hopps");
                currentPossibleAnswers.remove("the Mad Hatter");
            } else {
                currentPossibleAnswers.remove("Cinderella");
                currentPossibleAnswers.remove("Elsa");
                currentPossibleAnswers.remove("Snow White");
                currentPossibleAnswers.remove("Belle");
                currentPossibleAnswers.remove("Jasmine");
            }
        }

        if (questionsAsked == 2) {
            if (lastQuestion.contains("Is the character blonde?")) {
                if(userInput.contains("yes")){
                    currentPossibleAnswers.remove("Belle");
                    currentPossibleAnswers.remove("Jasmine");
                    currentPossibleAnswers.remove("Snow White");
                }else{
                    currentPossibleAnswers.remove("Cinderella");
                    currentPossibleAnswers.remove("Elsa");
                }
                
            } else {
                    if(userInput.contains("yes")){
                    currentPossibleAnswers.remove("Micky Mouse");
                    currentPossibleAnswers.remove("Simba");
                    currentPossibleAnswers.remove("Judy Hopps");
                    } else {
                    currentPossibleAnswers.remove("Aladdin");
                    currentPossibleAnswers.remove("the Mad Hatter");
                    }
                }
            }

        if (questionsAsked == 3) {
            if (lastQuestion.contains("Does the character has magic?")) {
                if(userInput.contains("yes")){
                    currentPossibleAnswers.remove("Cinderella");
                } else {
                    currentPossibleAnswers.remove("Elsa");
                }
            } else if (lastQuestion.contains("Does the character talks to animals?")) {
                if(userInput.contains("yes")){
                    currentPossibleAnswers.remove("Belle");
                    currentPossibleAnswers.remove("Jasmine");
                } else {
                    currentPossibleAnswers.remove("Snow White");
                }
            } else if (lastQuestion.contains("Is the character from Middle Eastern areas?")){
                if(userInput.contains("yes")){
                    currentPossibleAnswers.remove("the Mad Hatter");
                } else {
                    currentPossibleAnswers.remove("Aladdin");
                }
            } else {
                if(userInput.contains("yes")){
                    currentPossibleAnswers.remove("Micky Mouse");
                    currentPossibleAnswers.remove("Judy Hopps");
                } else {
                    currentPossibleAnswers.remove("Simba");
                }
            }
        }

        if (questionsAsked == 4) {
            if (lastQuestion.contains("Is this character friends with the Beast?")) {
                if(userInput.contains("yes")){
                    currentPossibleAnswers.remove("Jasmine");
                }else{
                    currentPossibleAnswers.remove("Belle");
                }  
            } else { 
                if(userInput.contains("yes")){
                    currentPossibleAnswers.remove("Micky Mouse");
                    } else {
                    currentPossibleAnswers.remove("Judy Hopps");
                    }
            }
        }
    }

                
    public String guess() {
        String answer = "";
        if (currentPossibleAnswers.size() == 1) {
            return currentPossibleAnswers.get(0);
        } 
        return answer;
    }

    public static void main(String[] args) {
        String[] inputPossibleAnswers = {"Micky Mouse", "Cinderella", "Aladdin", "Elsa", "Simba", "Judy Hopps", "the Mad Hatter", "Belle", "Snow White", "Jasmine"};
        twentyQuestions1 d = new twentyQuestions1(inputPossibleAnswers);
        Scanner s = new Scanner(System.in);
        ArrayList<String> answers = new ArrayList<String>();

        while (true) {
            String question = d.askQuestion();
            System.out.println(question);
            String userInput = s.nextLine();
            d.updateAnswers(userInput);
            if (d.currentPossibleAnswers.size() == 1) {
                break;
            }
        }
        String guess = d.guess();
        System.out.println("I guess your answer is: " + guess);

        s.close();
    }
}