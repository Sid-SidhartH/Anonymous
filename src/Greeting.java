public class Greeting {
    public void SayHello(){
        System.out.println("hello everyone");
    }
}
class India{
    Greeting g=new Greeting(){
        public void SayHello(){
            System.out.println("namaste everyone");
        }
    };
}
