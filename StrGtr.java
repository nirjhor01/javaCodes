package encapsulation;
public class Person{
 
    private String name;

    public void setName(String name){
      this.name=name;
    }

    public String getName(){
      return name;
    }

  }
  public class StrGtr{
      public static void main(String[] args){
        Person obj=new Person();
        obj.setName("Nirjhor");
        System.out.println(obj.getName());
        
      }
  }

