//Reuasability Returntype Returnstatement Parameter Arguments
class Water {
   public static int add(int a,int b){
    int c=a+b;
     System.out.println("add" + c);
   return c;
   }
  
   public static int sub(int x){
    int y=(add(20,30))-x;
     System.out.println("sub" + y);
   return y;
   }
   
   public static int multi(int z){
    int k=z*(sub(10));
     System.out.println("multi" + k);
   return k;
   }
 
   public static int div(int q){
    int r=q/(multi(2));
     System.out.println("div" +  r);
   return r;
   }  
   
  public static int mod(int s){
    int n=s%(div(2));
     System.out.println("mod" +  n);
   return n;
   } 
   
  
 public static void main(String [] args){
  div(2);
 }
 
} 
 
