public class DemoPrimitives {
  public static void main(String[] args) {
    int x=6;
    int z=-6;
    int y=4;
    int total= x+y*z;
    System.out.println(total);
    int reminder =10/3;

//2024.05.10

 double d1=10.3;
 double d2=10.34567;
 double d3=-110.999;

 double result2=d1+d2-d3;
 System.out.println(result2);// double=>+,-,*,/ will have some issue in some scenario

double result3= 0.1+0.2;
System.out.println(result3);//0.00000034

double result4= 2+4*0.25*3/2-10;
System.out.println(result4);

   int f1=7;
   double f2=8.8;
   
   /*
   int f2 //error, becsuse int + double-> double +double->double (15.8)
   //so doublevaule can be stored in an int variable
   int f3=f1+f2
   */

  int g=10/3;//int/int->int->3, so 3 can be assigned to variable g

  char c1='!';//single quote to declare a char value
  char c2=' ';//space value
  //char c3=""; //error, char variable must contain a single characeter/
  //char c4='aa'
  
  //Primitive boolean ->true, false
  //boolean b1="true"; // you cannot assign a string value to boolean
  boolean b2 = true;
  boolean b3 = false;
  //blloean b4 = 1;

  //Primitives for Integer
  //int, long, byte, short
  byte b1 = 1;
  //byte can only store the iinteger with range of the value between -128 and 127(2^x)
  byte y2 = -128;
  byte y3 = 127;
  //byte y4=128;//compile error (java can identify the syntax error)

  short s1= -32768;
  int i1= -214783468; //=234783647 to 2147483647
  //int i2=-2147483649;

  long l1= -9223382036854770L; // -923337203685477500 ->int
  long l2= 923334775007L; //L mmeans a way to specify theis value is a long value
  // long 13= 92337203685477500L;

  //Primitive for number with decimal
  //1. 10/2->double value
  //2. you cannot asiign a double value to variable, because float is with lower level of data type
  //3. In conclude, you cannot a hugher level of data value to a lower level data type
  double d10 = 10.2;
  // 10.2f is a float value
  float f10 = 10.2f;

 // float f11= 10.5f + 10.5; //float+ double -> double, cannot assign double to float.

  double d11=99.99d; // same as double d12 = 99.99;

  //Local Variable (within the main program, you can only declare the same variable once)
  double d12; //variable declaration
  d12 = 10.9; // value assignment

  double d13= 14.3;// declaration and assignment
  //double d13 = 19.0; //you cannot re-declare the same variable
  d13 = 19.0; //reassignment

  int j=3;
  int k=(j+++3)*j++;
  System.out.println("k="+k);



  }
}