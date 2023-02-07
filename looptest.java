import java.util.Scanner;

public class looptest {
    public static void main(String[] args) {
        System.out.println("SOCCER TRAINING");
        System.out.println("........");
        System.out.println("1.dribbling ");
        System.out.println("2.Passing");
        System.out.println("3.shooting");
        System.out.println("4.physical test");
        System.out.println("5. mental capability");
        System.out.println("6.Team tryout");
        System.out.println("7.To Bad U Cant make it");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("teach you to dribble");
                System.out.println("modern way to teach simplicity of game");
                break;

            case 2:
                System.out.println("passing drills ");
                System.out.println("teach u to pass under pressure");
                System.out.println("teach u the way of vision");
                break;

            case 4:
                System.out.println("team physical strenth buildup");
                System.out.println("train with stamina");
                System.out.println("physical build");
                break;

            case 3:
                System.out.println("teach u technical way to shoot");
                System.out.println("shooting drills");
                break;

            case 5:
                System.out.println("teach u to play under pressure");
                System.out.println("put you in mental and stressed game");
                break;

            case 6:
                System.out.println("invitation to tryout");
                System.out.println("coach from throughtout bigger platform");
                break;

            case 7:
                System.out.println("sorry try your luck next time");

            default:
                System.out.println("cant u decide from above");
        }

    }
}
