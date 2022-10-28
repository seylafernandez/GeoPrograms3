

/**
 * Created by chales on 3/3/2018.
 */
public class RunMyProgram {
    public static void main(String[] args) {
        World run;
        run = (new FinalProject());
        run.pictureFileName="underthesea.jpeg";
       run.WIDTH=1000;
       run.HEIGHT=749;
        run.Refresh();

        //new Thread(run).start();
    }
}
