public class loopsntax{
  public static void main(String[] args){
  }
class dowhile{
    public static void doloop(){
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);
      }
  }
  class forloop { // starts index at 0 so prints 0 to 4
    public static void forloopsyn(){
        for(int i = 0; i < 5; i++ ){
            System.out.println(i);
        }
    }
  }
  class whileloop{
    public static void whileloopsyn() {
        int i = 0;
        while(i < 5){
            System.out.print(i); // cannot initalise variables in while loop
            i++;
          }
      }
  }
}
