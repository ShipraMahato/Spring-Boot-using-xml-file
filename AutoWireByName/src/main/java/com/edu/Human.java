package com.edu;

public class Human {
	private Heart heartobj;
	// Autowire Byname heartobj and id in xml file must be same
		
// Generate setter and Getter method
	public Heart getHeartobj() {
		return heartobj;
	}


	public void setHeartobj(Heart heartobj) {
		this.heartobj = heartobj;
	}
	
	public void humanFunction() {
		if (heartobj!= null) {
			heartobj.pump();
		}
		else {
			System.out.println("Not Alive ");
			
		}
	}



}
