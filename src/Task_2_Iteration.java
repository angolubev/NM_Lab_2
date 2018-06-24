public class Task_2_Iteration
{
    public static void Do(Vector x0, double epsilon, double q)
    {
        Vector x = IterationMethod(x0, epsilon, q);
        System.out.println("\nVector x:");
        x.Show();
    }

    private static Vector IterationMethod(Vector x0, double epsilon, double q)
    {
        Vector x = x0;
        Vector prev_x;
        int k=0;

        do
        {
            prev_x = new Vector(x);

            double x1 = x.Get(0);
            double x2 = x.Get(1);

            System.out.println("\nk = " + k);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            System.out.println("fi1 = " + fi1(x1, x2));
            System.out.println("fi2 = " + fi2(x1, x2));

            x.Set(0, fi1(x1, x2));
            x.Set(1, fi2(x1, x2));

            k++;
        }
        while((q/(1-q)) * Vector.Sub(x, prev_x).Norma() > epsilon);

        return x;
    }

    private static double fi1(double x1, double x2)
    {
        //return 0.3 - 0.1*x1*x1 - 0.2*x2*x2;
        return Math.cos(x2) / 3;
    }

    private static double fi2(double x1, double x2)
    {
        //return 0.7 - 0.2*x1*x1 + 0.1*x1*x2;
        return Math.exp(x1) / 3;
    }
}
