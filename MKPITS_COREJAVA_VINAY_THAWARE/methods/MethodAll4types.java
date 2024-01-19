package com.mkpits.methods;

public class MethodAll4types {

	public static void main(String[] args) {
//	1)No Return type & No Arguement
		getName();
		 
//  2)Returntype with no Arguement
		MethodAll4types m=new MethodAll4types();
		System.out.println("Mobile:"+m.getMobile());
		
//	3)Argument with No Return type
		long pincode=440013l; 
	    m.getPincode(pincode);
//	 4)Argument with Return type
	    
	    String rUser=m.getUser("1 ","Vinay");
	    System.out.println(rUser);
	    
	}
//	4)Argument with Return type
        public String getUser(String id,String name) {
        	System.out.println("Id:"+id+", Name:"+name);
		return id+name;
	}	
		
//	3)Argument with No Return type
        public void getPincode(long pincode) {
		long newPincode=440012l;
		System.out.println("Pincode:"+newPincode);
		
	}

//  2)Returntype with no Arguement
        public  long getMobile() {
	    long mobile=9373007087l;
	    return mobile;
		
	}

// 1)No Return type & No Arguement
	    public static void getName() {
		String name="Vinay Thaware";
		System.out.println("Name:"+name);
		
	}
    
	

}
