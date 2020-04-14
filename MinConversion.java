import java.util.*;
public class minutesconversion
{
 public static void main(String[] args)
{
   double minutesinyear=365*24*60;//total minutes for an year i.e 365days*24hours*60minutes
  Scanner sc=new Scanner(System.in);
 System.out.print("Input the number of minutes: ");
 double min=sc.nextDouble();
 long years=(int)(min/525600);//365*24*60=525600
//int days=(int)((min%525600)/1440);//24*60=1440 (for one day total minutes)
//int days=(int)((min/60/24)%365);
int days=(int)((min/1440)%365);
 System.out.println((int)min+" "+"minutes is approximately "+years+" "+"years"+" "+"and"+" "+days+" "+"days");
}
}
