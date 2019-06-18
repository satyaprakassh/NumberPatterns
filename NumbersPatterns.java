class NumberPatterns
{
    public static void displayTheNumberPattern1()
    {
        for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
/*
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 
*/
    public static void displayTheNumberPattern2()
    {
         for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
/*
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
*/
    public static void displayTheNumberPattern3()
    {
         for(int i=5;i>=1;i--)
        {
            for (int j=1;j<=5;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
/*
5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 
*/
    public static void displayTheNumberPattern4()
    {
         for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
/*
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
*/
    public static void displayTheNumberPattern5()
    {
         for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
    public static void displayTheNumberPattern6()
    {
         for(int i=1;i<=5;i++)
        {
            for (int j=5;j>=i;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
/*
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
*/
    public static void displayTheNumberPattern7()
    {
         for(int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
    public static void displayTheNumberPattern8()
    {
         for(int i=5;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
/*
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 
*/
    public static void displayTheNumberPattern9()
    {
         for(int i=1;i<=5;i++)
        {
            for (int j=5;j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
/*
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5
*/
    public static void displayTheNumberPattern10()
    {
        int counter=5;
         for(int i=1;i<=5;i++)
        {
            for (int j=1;j<=5;j++)
            {
                if(j<counter)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(i+" ");
                }
            }
            counter--;
            System.out.println();
        }
    }
/*
        1 
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5 
*/
    public static void displayTheNumberPattern11()
    {
        int counter=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=counter;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
            counter--;
        }
    }
/*
          1 
        1 2 
      1 2 3 
    1 2 3 4 
  1 2 3 4 5 
*/
    public static void displayTheNumberPattern12()
    {
        int counter=5;
        for(int i=1;i<=5;i++)
        {
           for(int j=1;j<=5;j++)
           {
               if(j<i)
               {
                   System.out.print("  ");
               }
               else
               {
                   System.out.print(counter+" ");
               }
           }
           counter--;
           System.out.println();
        }
    }
/*
5 5 5 5 5 
  4 4 4 4 
    3 3 3 
      2 2 
        1 
*/
    public static void displayTheNumberPattern13()
    {
        int counter=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=counter;k++)
            {
                System.out.print(k+" ");
            }
            counter--;
            System.out.println();
        }
    }
/*
1 2 3 4 5 
  1 2 3 4 
    1 2 3 
      1 2 
        1 
*/

    public static void displayTheFloyedTriangle()
    {
        int counter=1;
        for (int i=1;i<=5 ;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if(counter<10)
                {
                    System.out.print("0"+counter+" ");
                }
                else
                {
                    System.out.print(counter+" ");
                }
                counter++;
            }
            System.out.println();
        }
    }
/*
01 
02 03 
04 05 06 
07 08 09 10 
11 12 13 14 15 
*/
    public static void main (String[] args)
    {
        NumberPatterns.displayTheFloyedTriangle();
        System.out.println();
        NumberPatterns.displayTheNumberPattern1();
        System.out.println();
        NumberPatterns.displayTheNumberPattern2();
        System.out.println();
        NumberPatterns.displayTheNumberPattern3();
        System.out.println();
        NumberPatterns.displayTheNumberPattern4();
        System.out.println();
        NumberPatterns.displayTheNumberPattern5();
        System.out.println();
        NumberPatterns.displayTheNumberPattern6();
        System.out.println();
        NumberPatterns.displayTheNumberPattern7();
        System.out.println();
        NumberPatterns.displayTheNumberPattern8();
        System.out.println();
        NumberPatterns.displayTheNumberPattern9();
        System.out.println();
        NumberPatterns.displayTheNumberPattern10();
        System.out.println();
        NumberPatterns.displayTheNumberPattern11();
        System.out.println();
        NumberPatterns.displayTheNumberPattern12();
        System.out.println();
        NumberPatterns.displayTheNumberPattern13();
    }
}