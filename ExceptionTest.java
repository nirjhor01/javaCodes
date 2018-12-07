class ExceptionTest {
  public static void main(String[] args) {
    try{
    int x;
    int y;
    x=10;
    y=0;
    int res=x/y;
    System.out.println("Resul:"+res);
    }
    
    catch(ArithmeticException e){
       System.out.println("Exception"+e);
      }
    
    System.out.println("last line is a Exception");
  }
}
