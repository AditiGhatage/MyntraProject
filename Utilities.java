package com.generic;

import java.util.GregorianCalendar;
import java.util.Random;

public class Utilities extends Pojo 
{
	Random randomname = new Random();
	GregorianCalendar gc = new GregorianCalendar();

	public String showFName() 
	{
		String strFName[] = {"Aditi","Raghav","Rohan","Rina","Sangita","Aishwarya","Santosh","Sangram","Shivani"};
		String strNm=strFName[new Random().nextInt(strFName.length)];
		System.out.println("First Name is :" +strNm );
		return strNm;
	}	
	public String showLName()
	{
		String strLName[] = {"Ghatage","Patil","Done","Jadhav","Desai","Sawant","Kulkarni","Deshpande","Deshmukh"};
		String strlast = strLName[new Random().nextInt(strLName.length)];
		System.out.println("Last Name is :" +strlast);
		return strlast;		
	}
	
	public String genderR(String gender)
	{
	if(Math.random() > 1) gender  = "MALE";
	else gender = "FEMALE";
	return (gender);
	}
	
	public String setEmail()
	{
		String stremail = "aditi@gmail.com";
		return stremail;
	}
	
	public String getRandomNumber(int intLength) {

		String allowChars="0123456789";
		String randomString="";

		for(int intIndex=0; intIndex<intLength;intIndex++) {
		int intNum= (int) Math.floor(Math.random()*allowChars.length());
		randomString+=allowChars.substring(intNum, intNum+1);
		}
		return randomString;
		}
	
	public String getRandomMobile(int intLength)
    {
    	String allowChars="0123456789";
		String randomString="";

		for(int intIndex=0; intIndex<intLength;intIndex++) {
			
			int intNum= (int) Math.floor(Math.random()*allowChars.length());
			randomString+=allowChars.substring(intNum, intNum+1);
		}
		
		String strStartDigit[] = {"99","98","97","96","95","94","93","92","91","90"};
		
		String strRandomDigit = strStartDigit[new Random().nextInt(strStartDigit.length)];
		String strmobileNumber = strRandomDigit+randomString;
		return strmobileNumber;
    }
	

}
