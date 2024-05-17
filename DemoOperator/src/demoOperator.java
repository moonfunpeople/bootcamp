public class demoOperator{
  public static void main(String[] args) {
    int x=3;

    x= x+1;
    System.out.println("x="+x); // string + int ->string

    x++; // same as x = x+1;
    System.out.println("x="+ x);

    x += 1; // same as x +x+1;
    System.out.println("x=" + x);

    x +=2; //same as x=x+2;
    System.out.println("x="+x);

    ++x; //same as x= x + 1;
    System.out.println("x="+x);
  

    int y = 4;
    y= y - 1; //3
    y--; //2
    y-=1; //2-1=1

    System.out.println(y);

    //+=
    int p=4;
    p = p*2; //8
    System.out.println(p);// *= 2; //16
    p*=4; 
    System.out.println("p="+p);//4

    int z=10;
    z= z % 3; //1
    int j =10;
    j%=3;//1
    System.out.println("z=" + z + ", j=" + j);

    String s = "hello";
    s= s +"world"; // helloworld
    s += "!!!";
    System.out.println("s=" + s); //s=helloworld!!!

    //no **//

    //>,<,>=, <=
    boolean r1 =10 > 3;// true asking if 10 > 3
    boolean r2 =4 > 10;//false
    boolean r3 =10 >= 10; //true
    boolean r4 =-9 <=9;//true

    // and (&&). or (||)
    boolean r5 =10>3 && 20>=20;

    char c10 = 'A';
    char c11 = 'B';
    boolean r10 = c10 ==c11;// false, ask if a value is equals to another value, we use "=="
    System.out.println("r10="+r10);
    boolean r11 = 'C' !='O' ; // true, ask if a value is NOT equlas to another value, we use "!="
    System.out.println("r11="+r11);

    boolean r12 = 10/2 > 5 *3;// false

  }
}