package all;
/**
 * 
 * @author Hadi Vahabpour Roudsari
 */
public class Pedikur extends Decorator {
    public Pedikur(IBarber i) {
        super(i);
        System.out.println("pedikur construct");
    }

    @Override
    public void makeup() {
        super.makeup();
        System.out.println("foot nail");
    }
}
