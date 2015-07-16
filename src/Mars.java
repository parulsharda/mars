/**
 * Created by parulsha on 16/07/15.
 */
import java.util.Scanner;

class Mars {
    int gridX = 0;
    int gridY = 0;
    int x_pos = 0;
    int y_pos = 0;
    String movements;
    String position;



    void setGrid(int gX, int gY) {
        gridX = gX;
        gridY = gY;

    }

    void setInitialpoint(int x, int y, String pos) {
        x_pos = x;
        y_pos = y;
        position = pos;
    }

    void setMovements(int gX, int gY, int x, int y, String pos, String move) {
        setGrid(gX, gY);
        setInitialpoint(x, y, pos);
        movements = move;

        //System.out.println(gridX);
        moveMars();
    }

    private void moveMars() {
        if (x_pos > gridX || y_pos > gridY) {
            System.out.println("Cant move ahead :(");
        }
        //else
        //{
       // String direct="E,W,N,S";
        String sep = " [ .,?!]";
        String[] directions = movements.split(sep);
        //String[] dir=direct.split(sep);
            for(int i = 0; i < directions.length; i++) {
            System.out.println(directions[i]);}
            /*switch (dir[i]) {
                case 'N':
                    if (directions[i] == 'm') {
                        y_pos = y_pos + 1;
                    }
                    break;
                case 'S':
                    if (directions[i] == 'm') {
                        y_pos = y_pos - 1;
                    }
                    break;
                case 'E':
                    if (directions[i] == 'm') {
                        x_pos = x_pos + 1;
                    }
                    break;
                case 'W':
                    if (directions[i] == 'm') {
                        x_pos = x_pos - 1;
                    }
                    break;
                default:
                    System.out.println("Invalid movemengt");
                    break;
            }*/

        }

    }
//}
class Testmars {
    public static void main(String args[])
    {
        int gX,gY,x,y;
        String move;
        String pos;

        Mars m=new Mars();
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the grid size");
        gX = in.nextInt();
        gY=in.nextInt();

        System.out.println("Enter the co-ordinates and initial position");
        x=in.nextInt();
        y=in.nextInt();
        pos =in.nextLine();

        System.out.println("Enter the String");
        move=in.nextLine();
        Scanner movestring = new Scanner(move);

        m.setMovements(gX,gY,x,y, pos,move);
    }
}
