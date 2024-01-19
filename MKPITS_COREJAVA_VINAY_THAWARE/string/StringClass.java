package com.mkpits.string;

public class StringClass {

	//String is immutable-if value enter not change value(not modified)
	//Data loss 
	//capacity 16 character
	public static void main(String[] args) {
		StringClass s = new StringClass();
		s.stringMethod();
		s.stringConstructor();

	}

	    public void stringMethod() {
		//String.copyValueOf( name)
		char name[]= {'V','I','N','A','Y'};
		System.out.println(String.copyValueOf(name));
		
		String fName="VINAY";
		String lName="Thaware";
		String vName="";
		String uName="Vinay thaware    ";
		String nName="vinay";
        //for uppercase & lower case
		System.out.println(lName.toUpperCase());
		System.out.println(fName.toLowerCase());
		//replace
		System.out.println(fName.replace('N', 'J'));
		//replace all
		System.out.println(fName.replaceAll(fName,"vijay"));
		//repeat(count) for how many time we have to repeat
		System.out.println(fName.repeat(3));
		System.out.println(nName.codePointAt(1));
		//String.join(delimiter,string1,string2)
		//Delimeter is a special chain in a middle like @,#,$,%,!,*
		System.out.println(String.join("@",fName,lName));
		
		//chatAt(index) to print single char
		System.out.println(fName.charAt(3));
		System.out.println(lName.chars());
		
		// string1.compareTo(string)  string 1 -string 2
		System.out.println(fName.compareTo(lName));
		//compare to ignore case //if it is upper and lower same then 0 otherwise String1-String 2
		System.out.println(fName.compareToIgnoreCase(nName));
		//two string combine
		System.out.println(fName.concat(lName));
		//if two string with same string name and with more character is true...
		System.out.println(fName.contains(lName));
		//if two string name is same then true not with more character
		System.out.println(fName.contentEquals(lName));
		System.out.println(fName.codePointAt(2));
		//it show the index value with using character
		System.out.println(fName.indexOf('V'));
		System.out.println(fName.length());
		System.out.println(vName.isBlank());
		System.out.println(vName.isEmpty());
		//white spaces remove
		System.out.println(uName.trim());
		
	}
	    public void stringConstructor() {
		//Constructor in String
		byte[]b= {65,66,67,68,90,54};
		char[]ch= {'x','y','z',1,2};
		String s1=new String();
		System.out.println(s1);
		String s2=new String(b);
		System.out.println(s2);
		String s3=new String(b,1,3);
		System.out.println(s3);
		String s4=new String(s2);
		System.out.println(s4);
		
	}


}
