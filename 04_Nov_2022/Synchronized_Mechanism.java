package Assigment;

// Q.4  "I want to learn Java" create this sentece by concatenating 5 java methods using synchronized mechanism.

 class Synchronized_Mechanism {
   
       synchronized String d1(String s1) {
    	   try {
    		   Thread.sleep(200);
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   return s1; 	   
       }
       synchronized String d2(String s2) {
    	   try {
    		   Thread.sleep(200);
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   return s2; 	   
       }
       synchronized String d3(String s3) {
    	   try {
    		   Thread.sleep(200);
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   return s3; 	   
       }
       synchronized String d4(String s4) {
    	   try {
    		   Thread.sleep(200);
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   return s4; 	   
       }
       synchronized String d5(String s5) {
    	   try {
    		   Thread.sleep(200);
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
    	   return s5; 	   
       }}
 class Synk_Mechanisam extends Thread {
	 Synchronized_Mechanism s;
	 Synk_Mechanisam(Synchronized_Mechanism s)  {
		 this.s=s;
	 }
	 public void run() {
		 System.out.print((s.d1("I"))+" "+(s.d2("want"))+" "+(s.d3("to"))+" "+(s.d4("Learn"))+" "+(s.d5("Java")));
	 }}
 class Synk_M {
	 public static void main(String...args) {
		 Synchronized_Mechanism sm= new Synchronized_Mechanism();
		 Synk_Mechanisam sym= new Synk_Mechanisam(sm);
		 sym.start();
	 }}