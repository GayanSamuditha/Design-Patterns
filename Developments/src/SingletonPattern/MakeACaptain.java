package SingletonPattern;

/**
 * @author Gayan Samuditha
 * @created 11/05/2020 - 4:53 PM
 */
public class MakeACaptain {

    private static MakeACaptain captain;

    public MakeACaptain(){}

    public static synchronized MakeACaptain getCaptain(){
        if(captain == null){
            captain = new MakeACaptain();
            System.out.println("New Captain selected for the sailors team !!!");
        }else {
            System.out.println("Already have a captain for sailor team !!!");
            System.out.println("Connection end...");
        }

        return captain;
    }
}
