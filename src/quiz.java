import java.util.Scanner;
public class quiz {

    static void Options(){
        System.out.println("Enter your choice (1 or 2): ");
        System.out.println("1)Next Question");
        System.out.println("2) end game");
    }
    public static void main(String[] args){
        String[] Q = {"1) what is the capital of India",
                      "2) what is the capital of USA",
                      "3) what is the capital of Germany"};

        String [][] Options = {{"a) Delhi","b) Punjab","c) China","d) Hindi"},
                {"a) Washington DC","b) Punjab","c) China","d) New York"},
                {"a) Delhi","b) Munich","c) China","d) Berlin"}};

        char[] answers = {'a','a','d'};
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int X;
        do{
            Options();
            X = scan.nextInt();
            System.out.println(" ");
            if(X!=2){
                for(int i = 0; i<Q.length;i++) {
                    System.out.println(Q[i]);
                    String[] K = Options[i];
                    for (String p : K) {
                        System.out.println(p);
                    }
                    System.out.println();
                    System.out.println("enter your answer (only option)");
                    char J = scan.next().charAt(0);
                    if (J == answers[i]) {
                        System.out.println("Correct!");
                        score++;
                        System.out.println("________________");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    if (i == Q.length - 1) {
                        System.out.println("game over");
                        X = 2;
                    }
                }
            }
        }while(X != 2 );
        System.out.println(score);
    }
}
