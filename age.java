import java.util.*; 
public class age
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in); 
        int below18=0, in18And60=0, above60=0;
        System.out.println("Enter 10 array elements");
        int Arr[] = new int[10]; 
        for(int i = 0; i < Arr.length; i++) 
           Arr[i] = sc.nextInt(); 
        for(int j = 0; j < Arr.length; j++)
			{ 
           if(Arr[j]<18) 
               below18 = below18 + 1;
           else if(Arr[j]>=18 && Arr[j]<60)
               in18And60 = in18And60 + 1;
           else 
               above60 = above60 + 1;
        }
        System.out.println("Below 18 numbers:" +below18);
        System.out.println("Between 18 and 59 numbers:" +in18And60);
        System.out.println("Above 60 numbers:" +above60);
   } 
}