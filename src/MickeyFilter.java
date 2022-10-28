public class MickeyFilter extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        System.out.println("This will be printed to the  window. ");
        plane.teleport(0, 0);
        plane.showBackGround();

        shoefilter();
        shirtFilter();

    }

    public void shoefilter() {
        for (int row = 500; row < 680; row = row + 1) { //rows
            for (int col = 50; col < 430; col = col + 1) { //columns
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                //if color is yellow, change color to pink
                if (blue < 100 && red > 200 && green > 190) {
                    plane.setPixelColor(255, 192, 203);
                }

            }
        }
    }

    public void shirtFilter() {
        for (int row = 340; row < 500; row = row + 1) {
            for (int col = 144; col < 278; col = col + 1) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (blue < 30 && green < 25 && red > 150) {
                    plane.setPixelColor(97, 186, 250);
                }
            }
        }
    }
}