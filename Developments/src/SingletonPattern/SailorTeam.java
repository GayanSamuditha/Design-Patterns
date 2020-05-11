package SingletonPattern;

/**
 * @author Gayan Samuditha
 * @created 11/05/2020 - 4:52 PM
 */
public class SailorTeam {
    public static void main(String[] args) {


        System.out.println("Singleton Pattern Demostration ! ");
        System.out.println("Scenario: MAKE A CAPTAIN");
        MakeACaptain makeACaptain1 = MakeACaptain.getCaptain();
        System.out.println("Trying to select a captain for the sailor's team");

        MakeACaptain makeACaptain2 = MakeACaptain.getCaptain();

        if (makeACaptain1 == makeACaptain2){
            System.out.println("makeACaptain1 and makeACaptain2 are same instance");
        }


    }
}
