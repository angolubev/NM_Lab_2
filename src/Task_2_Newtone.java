public class Task_2_Newtone
{
    public static void Do(Vector x0, double epsilon)
    {
        Vector x = NewtoneMethod(x0, epsilon);
        System.out.println("\nVector x: ");
        x.Show();
    }
    private static Vector NewtoneMethod(Vector x0, double epsilon)
    {
        Vector x = x0;
        Vector prev_x;
        int k=0;

        do
        {
            double x1 = x.Get(0);
            double x2 = x.Get(1);

            System.out.println("\nk = " + k);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("f1 = " +  f1(x1, x2));
            System.out.println("f2 = " +  f2(x1, x2));
            System.out.println("df1dx1 = " + df1dx1(x1, x2));
            System.out.println("df2dx1 = " + df2dx1(x1, x2));
            System.out.println("df1dx2 = " + df1dx2(x1, x2));
            System.out.println("df2dx2 = " + df2dx2(x1, x2));
            System.out.println("detA1 = " + detA1(x1, x2));
            System.out.println("detA2 = " + detA2(x1, x2));
            System.out.println("detJ = " + detJ(x1, x2));

            prev_x = new Vector(x);
            x1 -= detA1(x1, x2) / detJ(x1, x2);
            x2 -= detA2(x1, x2) / detJ(x1, x2);

            x.Set(0,x1);
            x.Set(1, x2);

            k++;
        }
        while(Vector.Sub(x, prev_x).Norma()> epsilon);

        return x;
    }

    private static double df1dx1(double x1, double x2)
    {
        //return 0.2*x1 + 1;
        return 3;
    }

    private static double df1dx2(double x1, double x2)
    {
        //return 0.4*x2;
        return Math.sin(x2);
    }

    private static double df2dx1(double x1, double x2)
    {
        //return 0.4*x1 - 0.1*x2;
        return - Math.exp(x1);
    }

    private static double df2dx2(double x1, double x2)
    {
        //return 1 - 0.1*x1;
        return 3;
    }

    private static double f1(double x1, double x2)
    {
        //return 0.1*x1*x1 + x1 + 0.2*x2*x2 - 0.3;
        return 3*x1 - Math.cos(x2);
    }

    private static double f2(double x1, double x2)
    {
        //return 0.2*x1*x1 + x2 - 0.1*x1*x2 -0.7;
        return 3*x2 - Math.exp(x1);
    }

    private static double detA1(double x1, double x2)
    {
        return f1(x1, x2) * df2dx2(x1, x2) - f2(x1, x2) * df1dx2(x1, x2);
    }

    private static double detA2(double x1, double x2)
    {
        return df1dx1(x1, x2) * f2(x1, x2) - df2dx1(x1, x2) * f1(x1, x2);
    }

    private static double detJ(double x1, double x2)
    {
        return df1dx1(x1, x2) * df2dx2(x1, x2) - df2dx1(x1, x2) * df1dx2(x1, x2);
    }
}
