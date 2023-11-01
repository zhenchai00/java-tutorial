package sample;
public class Sample {
    public static Page1 first;
    //public static Page1 one = new Page1();
    public static Page2 second;
    public static Page3 third;
    public static Page4 fourth;
    public static Customer loginUser = null;
    public static void main(String[] args) {
        //read data from txt file to memory
        DataIO.read();
        first = new Page1();
        //Page1 one = new Page1();        //local variable
        second = new Page2();
        third = new Page3();
		fourth = new Page4();
    }    
}
