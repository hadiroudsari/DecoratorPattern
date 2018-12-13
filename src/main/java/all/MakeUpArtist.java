package all;

/**
 * 
 * @author Hadi Vahabpour Roudsari
 */

public class MakeUpArtist implements IBarber {

    public MakeUpArtist(){
        System.out.println("MakeUp Artist Construct");
    }

    @Override
    public void makeup() {
        System.out.println(" shoru...");
    }
}
