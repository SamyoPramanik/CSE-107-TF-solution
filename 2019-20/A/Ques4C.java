enum EPL
{
    ManU(90,1), Chelsea(80,2), Arsenal(75,4), ManCity(30,19), Liverpool(25,20);
    
    int points;
    int position;
    
    EPL(int points, int position)
    {
        this.points = points;
        this.position = position;
    }
    
    public int getPoints() {
        return points;
    }
    public int getPosition() {
        return position;
    }
}

public class Ques4C {
    public static void main(String[] args) {
        EPL[] epl = EPL.values();

        for(var x : epl)
        {
            System.out.println(x + " " + x.getPoints() + " " + x.getPosition());
        }
    }
}
