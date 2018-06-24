public class NM_Lab_2
{
    public static void main(String[] args)
    {
        double x01 = 2;
        //double x01 = 26*Math.PI;
        double epsilon1 = 0.1;
        //Task_1_Newtone.Do(x01, epsilon1);

        //double x02 = 0.475;
        //double epsilon2 = 0.001;
        //double q = 0.64;
        double x02 = 0.5;
        double epsilon2 = 0.01;
        double q2 = 0.64;
        //Task_1_Iteration.Do(x02, epsilon2, q2);

        //Vector x03 = new Vector(2, new double[]{0.25, 0.75});
        //double epsilon3 = 0.0001;
        Vector x03 = new Vector(2, new double[]{0.5, 0.5});
        double epsilon3 = 0.01;
        Task_2_Newtone.Do(x03, epsilon3);

        //Vector x04 = new Vector(2, new double[]{0.25, 0.75});
        //double epsilon4 = 0.0001;
        //double q4 = 0.64;
        Vector x04 = new Vector(2, new double[]{0, 1});
        double epsilon4 = 0.001;
        double q4 = 0.9;
        //Task_2_Iteration.Do(x04,epsilon4,q4);
    }
}
