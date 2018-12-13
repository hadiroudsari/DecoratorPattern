package all;
/**
 * 
 * @author Hadi Vahabpour Roudsari
 */
public class Decorator implements IBarber {

    IBarber iBarber;

    public Decorator(IBarber i) {
        System.out.println("decorator constrct");
        iBarber = i;
    }

    @Override
    public void makeup() {
        iBarber.makeup();
    }
}
