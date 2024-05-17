import javax.sql.rowset.spi.SyncResolver;

public class DemoString {
public static void main(String[] args) {
  //string sores text
  //double quote to declare a String value
  String x="hello";
  String y="#$%^&*&^%$#";
  String dollar ="$10";

  String withSpace = "hello   H ello";
  System.out.println(withSpace);
  String z= x + dollar;
  System.out.println(z);//hello$10

  double price=9.99;
  String item="book";
  String description="The "+ item +" costs $" + price;//String+String+double=String
  System.out.println(description);

  char a='A';
  String message ="The answer is:"+a;//char->String
  System.out.println(message);

  //String method(Tool) 1:length()
  String t="hello";
  System.out.println("The length of t="+ t.length()); //t.length() ->int

  //check of t length >=4, if yes, print hello, else goodbye

  if(t.length()>=4) {
  System.out.println("hello");}
  else{System.out.println("goodbye");}

  //Method 2:equals()
  String s1="hello";
  String s2="hello";
  if(s1.equals(s2)){
    System.out.println("they are have same String value.");
  }else{System.out.println("they are not with the same value.");
}
  if(!s1.equals(s2)){//means not
    System.out.println("they are not with the same value.");}
else{
  System.out.println("they are have same String value.");

}

if(s1==s2){
  System.out.println("They are same object.");//print

//check if s1 length>=6 or s1 equals s2. print...

if(s1.length()>=6 || s1.equals(s2)) {//false//true->true
}System.out.println("hello");

if(s1.length()>=6){
  System.out.println("hello world");
}else if(s1.equals(s2)){System.out.println("hello");
}

//check if s1 length >=6 and s1 equals s2, print...
//AND
     if(s1.length()>=6 &&s1.equals(s2)){//fales||true->true
    System.out.println("hello");
  }

  if (s1.length()>=6){
    if(s1.equals(s2)){
      System.out.println("hello");
    }
  }
//Method 3:chartAt(int index), for example,charAt(0)
String s3="world";
//0 means the first index
System.out.println("The 1st character of s3="+ s3.charAt(0));//w
System.out.println("The 5th chararcter if s3="+ s3.charAt(4));//d

System.out.println("the last character of s3="+s3.charAt(s3.length()-1));//d

}
//check if the last character is d and length >5, if yes, print yes.
String x2="hello world";
if ( x2.charAt(x2.length()-1) == 'd' && x2.length() > 5) {
  System.out.println("yes");

}
//Method 4: Substring(int beginIndex, int endIndex
      String result = x2.substring(0,2);
      System.out.println(result);//he



      System.out.println(x2.substring(0,5));//hello
      System.out.println(x2.substring(3, 8));//lo wo

      System.out.println(x2.substring(0, 0));
      System.out.println(x2.substring(0, 1));
      //System.out.println(x2.substring(0, 0));



      //Check if the first 3 character is "wel, if yes, print yes" substring 
      String x3 = "wellcome";
      if(x3.substring(0,3).equals("wel")){System.out.println("yes");}


      //chain method
      System.out.println(x3.substring(0,3).length());//3
      System.out.println(x3.substring(0,3).charAt(1));;

      String x4=x3.substring(0,3);
      int l1 = x4.length();
      System.out.println(l1);//3





      if(x3.charAt(0)=='w' && x3.charAt(1)=='e' && x3.charAt(2)==('l')){}





}
}
