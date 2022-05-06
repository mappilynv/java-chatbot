import java.util.Scanner;

public class chatBot {
    public static void main(String[] args) {
        greeting();
        repeatName();
        guessAge();
        counting();
        javaTest();
        story();
        guessExactAge();

    }

    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Hello~. Welcome to the my Chat Bot World.");
        System.out.println("How should I call you?");
        scanner.nextLine();
    }
    public static String repeatName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wait sorry I am a goldfish. What is your name again?");
        String name = scanner.nextLine();
        System.out.println("Thanks for talking to me "+name+".");
        return name;
    }
    public static void guessAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you tell me the year you were born?");
        int ageInput = Integer.valueOf(scanner.nextLine());
        int ageValue = 2022 - ageInput;
        System.out.println("...............");
        System.out.println("Your are "+ageValue+"ish years old!");
        System.out.println("See, I spend a lot of time learning math ha!");
    }
    public static void counting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's test my math skills again shall we?");
        System.out.println("Now I want you to give me any number. I will count to that number!");
        int numInput = Integer.valueOf(scanner.nextLine());
        System.out.println("Okay number "+numInput+" here we come.");
        for(int i = 1; i <= numInput; i++){
            System.out.println(i);
        }
    }
    public static void javaTest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now let's see how good you are at Java!");
        System.out.println("Here comes the question: ");
        System.out.println("Which is correct way to arrange Java data type from smaller to larger size?");
        System.out.println("Don't worry, I have 4 choices for you.");
        System.out.println("A: byte, short, int, boolean");
        System.out.println("B: byte, short, float, int");
        System.out.println("C: byte, short, char, boolean");
        System.out.println("D: byte, short, boolean, float");
        while(true){
            String answer = scanner.nextLine();
            String answerUpper = answer.toUpperCase();
            if (answerUpper.equals("A")){
                System.out.println("Correct! Wow you got it right :)");
                break;
            } else if (answerUpper.equals("B")){
                System.out.println("Nope. Try again.");
                continue;
            } else if (answerUpper.equals("C")){
                System.out.println("Hmm. I don't think so. Try again.");
                continue;
            } else if (answerUpper.equals("D")){
                System.out.println("A big NONO. Try again.");
                continue;
            } else {
                System.out.println("Not in the option!");
                continue;
            }
        }
    }

    public static void story(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("OK. After the math challenges, I am going to tell you your story.");
        System.out.println("But, I need to get some info from you.");
        System.out.println("What is your favorite food?");
        String favFood = scanner.nextLine();
        System.out.println("What is you favorite veggie?");
        String favVeg = scanner.nextLine();
        System.out.println("What is your favorite fruit?");
        String favFruit = scanner.nextLine();
        String name = repeatName();
        System.out.println("Here is "+name+"'s Story.");
        System.out.println(name+" really enjoy eating "+favFood+", "+favVeg+", and "+favFruit+".");
        System.out.println("So "+name+" mix them all together in one bowl and eat it.");
        System.out.println("Is it a good story? I think it is");

    }

    public static void guessExactAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Next, I am going to guess your exact age. If it's correct, type Yes. If not, just hit enter. Please hit enter to start.");
        int max = 70;
        int min = 1;
        int range = max - min + 1;
        for(int i=0; i<=70; i++) {
            int random = (int) (Math.random() * range) + min;
            String userInput = scanner.nextLine();
            String userInputUpper = userInput.toUpperCase();
            if (userInputUpper.equalsIgnoreCase("YES")) {
                break;
            }
            System.out.println(random);
        }
    }
}
