package all;
/**
 * 
 * @author Hadi Vahabpour Roudsari
 */
public class Test {
    public static void main(String[] args) {

       IBarber maniPediKur=new Manikur(new Pedikur(new MakeUpArtist()));
        maniPediKur.makeup();

    }

}