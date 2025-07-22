import java.util.Scanner;
public class robotSpeedInfo {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    double[]  arghhMatey = new double[length];

for(int i=0;i<arghhMatey.length;i++)
{
    arghhMatey[i]=Math.random()*4.0-2.0;
}


for(int i=0;i<arghhMatey.length;i++)
{
    System.err.println(arghhMatey[i]);
}

double max = arghhMatey[0];
for(int i=0;i<arghhMatey.length;i++)
{
    if(max<arghhMatey[i])
    {
       max=arghhMatey[i];
    }

    double minimum = arghhMatey[0];
for(int i=0;i<arghhMatey.length;i++)
{
    if(minimum>arghhMatey[i])
    {
       minimum=arghhMatey[i];
    }
}
 arghhMatey[i]Math
}
}
