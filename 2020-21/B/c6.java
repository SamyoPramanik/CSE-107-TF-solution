import java.util.HashMap;
import java.util.Objects;

class Movie
{
    private String title;
    private int releaseYear;
    private String productionCompany;
    private int runningTime;

    public Movie(String title, int releaseYear, String productionCompany, int runningTime)
    {
        this.title = title;
        this.releaseYear = releaseYear;
        this.productionCompany = productionCompany;
        this.runningTime = runningTime;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == this)
        {
            return true;
        }
        else if(!(o instanceof Movie))
        {
            return false;
        }
        Movie m = (Movie) o;
        if(m.title.equals(this.title) && m.releaseYear == this.releaseYear &&  m.runningTime == this.runningTime)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(releaseYear, runningTime, title);
    }
}

public class c6 {
    public static void main(String[] args) {
        Movie m1 = new Movie("The Lord of the Rings", 2001, "New Line Cinema", 178);
        Movie m2 = new Movie("The Lord of the Rings", 2001, "WingNut Films", 178);
        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
        HashMap map = new HashMap<>();
        map.put(m1, 93);
        System.out.println(map.get(m2));
    }
}
