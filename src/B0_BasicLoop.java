public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        squareGrid();
        }

        public void squareGrid(){
            plane.isTrail=true;
            plane.pausetime=0;
            for(int row = 0; row<8; row = row + 1){
                squareRow(row);}
            }

    public void squareRow(int row) {
        for (int col = 0; col < 10; col = col + 1) {
            plane.teleport(col*50,row*50);
            plane.isTrail=true;
            plane.trailWidth=5;
            plane.setColor(row*20,100,col*20);
            System.out.println(col);
            plane.square(50); }
    }

}
