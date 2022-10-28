

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

       plane.pausetime = 2;
        plane.startingAngle(-60);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(0, 91, 237);
        plane.move(150);
        plane.turn(-120);
        plane.setColor(178,123,232);
        plane.move(150);
        plane.turn(-120);
        plane.setColor(255,237,79);
        plane.move(150);

    }


}
