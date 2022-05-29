package week3.day1;

import week3.day1.Mobile;


// understanding Inheritance and overriding

public class SmartPhone extends AndroidPhone {

	
		
		public void connectWhatsApp() {
			System.out.println("connect to WhatsApp");
		}

		
		// applying overriding concept of take video
		
		 public void takeVideo() {
			  System.out.println("Take a video in smartphone class"); 
			  
			  }
		public static void main(String[] args) {
			
		/*	//Creatin mobile object
			
			Mobile mob=new Mobile();
			mob.sendMsg();
			
			// Creating object for Androidphone
			
			AndroidPhone phone =new AndroidPhone();
			phone.takeVideo();
			
			// Creating object for Smartphone
			 * */
			
			
			SmartPhone SP =new SmartPhone();
			
			SP.connectWhatsApp();
			SP.makeCall();
			SP.saveContact();
			SP.takeVideo();
			
			System.out.println("my mobile details");

		}

		
		
		 
		 
		
	}


