public class scene extends World {
    public void go(){

   for(int x=0; x<plane.random(5,150); x=x+1)
   {
       plane.teleport(plane.random(1, 1000), 700);
       pick(plane.random(1, 4));
   }


    }

    public void pick(int x){
        if(x==1){
            flower();
        }
        if (x==2){
            house(plane.random(1,1000));
        }
        if (x==3){
            grass();
        }
    }

public void house(int x){
        plane.isTrail=true;
        plane.setColor(240,196,125);
        plane.teleport(x, 600);
        plane.trailWidth=5;
        plane.house(100);


}

   public void flower() {
        plane.turn(180);
        plane.isTrail = true;
    plane.trailWidth = 10;
    plane.setColor(15,112,41);
    plane.move(50);
    plane.setColor(plane.random(100,255), plane.random(100,255), plane.random(100,255));
    plane.turn(90);
    plane.move(9);
    plane.turn(-40);
    plane.move(25);
    plane.turn(-50);
    plane.move(25);
    plane.turn(-40);
    plane.move(15);
    plane.turn(-100);
    plane.move(15);
    plane.turn(100);
    plane.move(15);
    plane.turn(-100);
    plane.move(15);
    plane.turn(100);
    plane.move(15);
    plane.turn(-100);
    plane.move(15);
    plane.turn(-40);
    plane.move(25);
    plane.turn(-50);
    plane.move(25);
    plane.turn(-40);
    plane.move(8);
    plane.turn(90);


   }

   public void grass(){
        plane.setColor(15,112,41);
        plane.turn(180);
        plane.trailWidth = 7;
        plane.isTrail = true;
       plane.turn(-40);
      plane.move(15);
       plane.turn(-100);
       plane.move(15);
       plane.turn(100);
       plane.move(25);
       plane.turn(-100);
       plane.move(25);
       plane.turn(100);
       plane.move(15);
       plane.turn(-100);
       plane.move(15);
       plane.turn(-40);


   }

}
