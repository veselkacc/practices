public class Trigonometry 
{
    public static void main ( String[] args )

    {
        Double x = 0.5236;
        Double y = 0.5236;
        Double z = 1.0;
        x = Math.sin(x);
        y = Math.cos(x);
        z = ((x*x) + (y*y));
        System.out.println("sine:" + x + "cosine: " + y + " sum of squares" + z);
    }
}
