package all;
/**
 * 
 * @author Hadi Vahabpour Roudsari
 */
public class Manikur extends Decorator{
    public Manikur(IBarber i) {
        super(i);
        System.out.println("manikur construct");
    }

    @Override
    public void makeup() {
        super.makeup();
        System.out.println("hand nail...");
    }
}
