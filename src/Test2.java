public class Test2 {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                System.out.println("i am the best");
            }
        };
        obj.show();
    }
}
