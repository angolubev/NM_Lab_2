public class Task_1_Newtone
{
    public static void Do(double x0, double epsilon)
    {
        double x = NewtonMethod(x0, epsilon);
        System.out.println("x = " + x);
    }

    private static double f(double x)
    {
        return Math.pow(4, x) - 5*x -2;
        //return Math.tan(0.1*x) + 2*x;
    }

    private static double df(double x)
    {
        return Math.pow(4, x) * Math.log(4) - 5;
        //return 0.1/(Math.cos(0.1*x) * Math.cos(0.1*x)) + 2;
    }

    private static double NewtonMethod(double x0, double epsilon)
    {
        double x = x0;
        double prev_x;
        int k=0;
        System.out.println("k x f(x) df(x) -f(x)/df(x)");
        do
        {
            System.out.println(k + " " + x + " " + f(x) + " " + df(x) + " " + (-f(x)/df(x)));
            prev_x = x;
            x-= f(x)/df(x);
            k++;
        }
        while(Math.abs(x-prev_x) >= epsilon);

        return x;
    }
}
