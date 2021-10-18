public class JavaMethod {
    public static void main(String[]args){
        myMethod(100);
        return;
    }

    
    static void myMethod(int nilai) {
  
        if(nilai< 25){
            System.out.println(" Nilai: E");
        } else if ( nilai < 50){
            System.out.println("Nilai: D");
        } else if ( nilai < 75){
            System.out.println("Nilai: C");
        } else if ( nilai < 90){
            System.out.println("Nilai: B");
        } else if (nilai < 101){
            System.out.println("Nilai: A");   
        } else if (nilai> 100) {
            System.out.println("Invalid Number");
           
        } 
    }  
  
     
    }
