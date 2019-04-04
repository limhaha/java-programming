
public class MovieDemo {

   public static void main(String[] args) {

      Movie m1 = new Movie();
      
      m1.setN("Movie1");
      m1.setR("G");
      System.out.println("Rating of " + m1.getN());
      m1.addRating();
      System.out.println("Average rating of " + m1.getN() + ": " + m1.getAverage()+"\n"); 
      
      Movie m2 = new Movie();
      
      m2.setN("Movie2");
      m2.setR("G");
      
      System.out.println("Rating of " + m2.getN());
      m2.addRating();
      System.out.println("Average rating of " + m2.getN() + ": " + m2.getAverage()+"\n");
      
      if(m1.equals(m2))
         System.out.println("Equal");
      else
         System.out.println("Not Equal");
   }

}