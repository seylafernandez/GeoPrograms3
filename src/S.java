public class S extends World{

    public void go(){
        letter(2);
    }

    public void letter(int size){
       plane.isTrail=true;
       plane.trailWidth=10;
       plane.setColor(60,70,80);
        plane.turn(90);
       plane.move(size*20);
        plane.turn(90);
        plane.move(size*20);
        plane.turn(90);
        plane.move(size*20);
        plane.turn(-90);
        plane.move(size*20);
        plane.turn(-90);
        plane.move(size*20);
    }


}
