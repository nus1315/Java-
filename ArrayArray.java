public class ArrayArray{
    public static void main(String args[]) {
     /* int x=50;
      int y=55;
      int z=40;
      int v=50;/*/

     /// System.out.println("Avarage = " + (Score));
      //Array
      int [] Score = new int [4];
      Score[0] = 50;
      Score[1] = 55;
      Score[2] = 40;
      Score[3] = 50;
      //Score[4] = 60;
      double sum = 0;
      for(int i = 0 ; i<Score.length ; i++){
          sum += Score[i];
      }
      System.out.println(sum/Score.length);
    }
}