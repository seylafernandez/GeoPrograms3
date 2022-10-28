public class FinalProject extends World {

    public void go() {
        plane.showBackGround();
        plane.pausetime=1;
        paintGrid();


    }
    public void paintGrid(){
        plane.isTrail=true;
        for(int row = 0; row<4; row = row + 1){
            paintRow(row);}
    }

    public void paintRow(int row) {
        for (int col = 0; col < 10; col = col + 1) {
            plane.teleport(col * 150, row * 150);
            pick(plane.random(1, 4));
        }
    }

    public void pick(int x){
        if(x==1){
            bubble();
        }
        if (x==2){
            fish();
        }
        if (x==3){
            star();
        }
    }
    public void bubble() {
        plane.trailWidth=3;
        plane.setColor(122,217,255);
        for (int t = 0; t < 100; t = t + 1) {
            plane.isTrail=true;
            plane.turn(5);
            plane.move(1);
        }
        plane.isTrail=false;
        plane.move(50);

        for (int t=0; t<50; t=t+1) {
            plane.isTrail=true;
            plane.turn(8);
            plane.move(1);
        }
    }

    public void fish(){
    plane.trailWidth=8;
    plane.setColor(plane.random(100,255), plane.random(100,255), plane.random(100,255));
    plane.isTrail=true;
    plane.move(70);
    plane.turn(60);
    plane.move(50);
    plane.turn(100);
    plane.move(50);
    plane.turn(60);
    plane.move(70);
    plane.turn(-60);
    plane.move(40);
    plane.turn(130);
    plane.move(70);
    plane.turn(130);
    plane.move(40);

    }

    public void star(){
    for(int x=0; x < 5; x = x+1) {
        plane.isTrail=true;
        plane.trailWidth=6;
        plane.setColor(235,59,88);
        plane.move(70);
        plane.turn(145);
    }
    }
}
