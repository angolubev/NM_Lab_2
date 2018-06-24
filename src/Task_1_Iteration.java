public class Task_1_Iteration
{
    public static void Do(double x0, double epsilon, double q)
    {
        double x = IterationMethod(x0, epsilon, q);
        System.out.println("x = " + x);
    }

    private static double fi(double x)
    {
        //return Math.log(4 - 3*x) / 2;
        return Log(4, 5*x +2);
    }

    private static double Log(double a, double b)
    {
        return Math.log(b) / Math.log(a);
    }

    private static double IterationMethod(double x0, double epsilon, double q)
    {
        double prev_x;
        double x = x0;
        int k=0;
        System.out.println("k xk fi(xk)");
        do
        {
            System.out.println(k + " " + x + " " + fi(x));
            prev_x = x;
            x = fi(x);
            k++;
        }
        while((q/(1-q)) * Math.abs(x - prev_x) > epsilon);

        return x;
    }
}
