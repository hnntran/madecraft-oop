package exercises;

public class MyStatic {
	 
	   public int getNumber(int i, int i2){
	      if(i < i2) {
	         return i2;
	      }else if(i > i2) {
	         return i;
	      }else {
	         return 3;
	      }
	   }
	   public static void main(String[] args){
		  MyStatic mc = new MyStatic();
	      System.out.print(mc.getNumber(2,4));
	      System.out.print(", " + mc.getNumber(2,2));
	      System.out.print(", " + mc.getNumber(9,3));
	   }
	}