import java.lang.Math;
public class EstimatePi{

     public static void main(String []args){
        int EstimateNum = 10000;
        int num_point_circle = 0;
        int num_point_total = 0;
        
        
        for (int i=0; i < EstimateNum  ; i++) {
            
            double  x = Math.random();
            double  y = Math.random();
            float fx = (float)x;
            float fy = (float)y;
            float distance = ((float)Math.pow(fx, 2)) + ((float)Math.pow(fy, 2));
            
            if (distance <= 1){
                num_point_circle+= 1;
            };
            num_point_total+= 1;
        }

        
        float pi = 4 * num_point_circle/num_point_total;
        System.out.println(pi);
        System.out.println("Total: " + num_point_total);
        System.out.println("In circle: " +num_point_circle);
     }
}