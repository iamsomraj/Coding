import java.util.*;


class App {

   static double areaOfIntersection(double x0, double y0, double r0, double x1, double y1, double r1) {
      double rr0 = r0 * r0;
      double rr1 = r1 * r1;
      double d = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
      if (d > r1 + r0) {
         return 0;
      } else if (d <= Math.abs(r0 - r1) && r0 >= r1) {
         return Math.PI * rr1;
      }

      else if (d <= Math.abs(r0 - r1) && r0 < r1) {
         return Math.PI * rr0;
      }

      else {
         double phi = (Math.acos((rr0 + (d * d) - rr1) / (2 * r0 * d))) * 2;
         double theta = (Math.acos((rr1 + (d * d) - rr0) / (2 * r1 * d))) * 2;
         double area1 = 0.5 * theta * rr1 - 0.5 * rr1 * Math.sin(theta);
         double area2 = 0.5 * phi * rr0 - 0.5 * rr0 * Math.sin(phi);
         return area1 + area2;
      }
   }

   
   
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      String first[] = sc.nextLine().split(" ");
      String second[] = sc.nextLine().split(" ");
      System.out.printf("%.6f",
            (areaOfIntersection(Double.parseDouble(first[0]), Double.parseDouble(first[1]),
                  Double.parseDouble(first[2]), Double.parseDouble(second[0]), Double.parseDouble(second[1]),
                  Double.parseDouble(second[2]))));
   }

}
