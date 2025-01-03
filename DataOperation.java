package com.dataoperation;

public class DataOperation {

	public static void main(String[] args) {
	 int i= 10;
	 byte b=25;
	 int i1=i+b;
	 System.out.println(i1);
	 
	 byte b1=75;
	 byte b2=98;
	 byte b3=(byte)(b1+b2);
	 System.out.println(b3);//83??
	 
	 char ch='A';
	 short s=3;
	 char ch1=(char)(ch+s);
	 System.out.println(ch1);
	 
	  char ch2='A';
	  char ch3='a';
	  int i2=ch2+ch3;
	  System.out.println(i2);
	  
	  float f1=5.99f;
	  byte b4=60;
	  char ch4=(char)(f1+b4);
	  System.out.println(ch4);
	  
	   char ch5='A';
	   float f2=3.99f;
	   double d1=ch5+f2;
	   System.out.println(d1);
	   
	 //  boolean b11=true; boolean to int we cannot convert
	 //  boolean b12=false;//
	 //  int i11=b11==b12;//
	//   System.out.println(i11);//
	   
	   int i6=99;
	   char ch6='A';
	   char ch7=(char)(i6+ch6);
	   System.out.println(ch7);// ¤ this is output
	   
	   int i7=99;
	   char ch8='A';//65 ASCII
	   int i8=i7+ch8;
	   System.out.println(i8);
	   
	   float f12=9898.00f;
	   long l12=98989898l;
	   int i12=(int)(f12+l12);
	   System.out.println(i12);
	   
	    

	}

}
