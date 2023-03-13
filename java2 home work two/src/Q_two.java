//public class Q_two
//{
//        public static int[] reverse(int[] X)
//        {
//            int[] Y = new int[X.length];
//            int count = 0;
//            for (int i = X.length-1; i >= 0; i--)
//            {
//                Y[i] = X[count];
//                count++;
//            }
//            for (int i = 0; i < X.length; i++)
//            {
//                X[i] = Y[i];
//            }
//            return X;
//        }
//        public static void main(String[] args) {
//            int[] A = {1,2,3,4,5};
//            System.out.println("Array comp: ");
//            for (int K : A)
//            {
//                System.out.println(K);
//            }
//            reverse(A);
//            System.out.println("Array rev: ");
//            for (int J : A)
//            {
//                System.out.println(J);
//            }
//        }
//    }
public class Q_two
{
    public static int[] backUp(int[] a)
    {
        int[] backupArray = new int[a.length];
        for (int i = 0; i < a.length; i++)
        {
            backupArray[i] = a[i];
        }
        return backupArray;
    }
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5};
        int[] backedUp = backUp(array);

        System.out.println("array backup: ");
        for (int j : backedUp)
        {
            System.out.println(j);
        }

    }
}