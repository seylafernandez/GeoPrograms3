public class Hogwarts extends World {

    public void go(){
        plane.isTrail=true;
        //square(1)
        pickShape(2);
    }
public void pickShape(int x){
        if(x==1){
            mysquare(100);
        }
        if(x==2){
        tri(100);
        }
}
    public void tri(int size){
        plane.pausetime = 2;
        plane.startingAngle(-60);
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.setColor(0, 91, 237);
        plane.move(size);
        plane.turn(-120);
        plane.setColor(178,123,232);
        plane.move(size);
        plane.turn(-120);
        plane.setColor(255,237,79);
        plane.move(size);
        plane.turn(90);
    }

    public void square(){
        plane.trailWidth = 5;
        plane.setColor(199,58,175);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
    }

    public void mysquare(int length){
        plane.trailWidth = 5;
        plane.setColor(199,58,175);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
    }


}
