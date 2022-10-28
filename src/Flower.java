public class Flower extends World {

    public void go(){
        stem(plane.random(100,1000));
        bloom(plane.random(100,200));

    }



    public void stem(int where){
        plane.isTrail = true;
        plane.setColor(30,130,30);
        plane.trailWidth = 10;
        plane.teleport(where,700);
        plane.turn(-180);
        plane.move(100);
        }

public void bloom(int red) {
    plane.setColor(red, 10,30);
    plane.turn(90);
    plane.move(18);
    plane.turn(-40);
    plane.move(50);
    plane.turn(-50);
    plane.move(50);
    plane.turn(-40);
    plane.move(30);
    plane.turn(-100);
    plane.move(30);
    plane.turn(100);
    plane.move(30);
    plane.turn(-100);
    plane.move(30);
    plane.turn(100);
    plane.move(30);
    plane.turn(-100);
    plane.move(30);
    plane.turn(-40);
    plane.move(50);
    plane.turn(-50);
    plane.move(50);
    plane.turn(-40);
    plane.move(17);
}










    }




