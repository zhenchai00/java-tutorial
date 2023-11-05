import java.util.Random;
public class test {
     public static void main(String[] args) {
        String currentState = "q0";
        boolean condition = true;  // Initialize loop condition
        Random random = new Random();
        while (condition != false) {
            boolean inputIsTrue = random.nextBoolean(); // Generate a random boolean value
            System.out.println(inputIsTrue);
            System.out.println(condition);
            // The loop's body goes here
            if (currentState.equals("q0")) {
                System.out.println("q0 start");
                currentState = "q1";
                System.out.println("q0 end");
            }

            if (currentState.equals("q1")) {
                System.out.println("q1 start");
                currentState = "q2";
                System.out.println("q1 end");
            }

            if (currentState.equals("q2")) {
                System.out.println("q2 start");
                if (inputIsTrue) {
                    currentState = "q3";
                } else {
                    currentState = "q4";
                }
                System.out.println("q2 end");
            }

            if (currentState.equals("q3")) {
                System.out.println("q3 start");
                if (inputIsTrue) {
                    currentState = "q5";
                }
                System.out.println("q3 end");
            }

            if (currentState.equals("q4")) {
                System.out.println("q4 start");
                if (!inputIsTrue) {
                    currentState = "q4";
                    break;
                }
                System.out.println("q4 end");
            }

            if (currentState.equals("q5")) {
                System.out.println("q5 start");
                if (!inputIsTrue) {
                    currentState = "q6";
                } else{
                    currentState = "q7";
                System.out.println("q5 end");
                }
            }

            if (currentState.equals("q6")) {
                System.out.println("q6 start");
                if (inputIsTrue) {
                    currentState = "q7";
                } else {
                    currentState = "q9";
                }
                System.out.println("q6 end");
            }

            if (currentState.equals("q7")) {
                System.out.println("q7 start");
                if (inputIsTrue) {
                    currentState = "q8";
                    condition = false;  // Loop ends (first accept state)
                }
                System.out.println("q7 end");
            }

            if(inputIsTrue){
                break; // Loop ends (go to second accept state)
            } else {
                condition = false; // Loop ends (go to second accept state as well) <-----(new)
            }
        }
    }
}
