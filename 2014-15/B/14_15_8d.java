enum EPL
{
    ManUnited("ManUnited",90,1),
    Chelsea("Chelsea",80,2),
    Arsenal("Arsenal",75,4),
    Liverpool("Liverpool",30,19),
    ManCity("ManCity",25,20);
    private final String clubName;
    private final int points;
    public final int position;
    EPL(String name,int points, int position)
    {
        this.clubName=name;
        this.points=points;
        this.position=position;
    }
}
public class tf {
    public static void main(String[] args) {
         int positionDiffnc=EPL.Liverpool.position-EPL.ManUnited.position;
         System.out.println(positionDiffnc);
    }
}
