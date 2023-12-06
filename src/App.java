
public class App {
    public static void main(String[] args) throws Exception {
    
        

        double product = multiplikation(7,2);
        System.out.println("7*2 = "+product);
}

    static double multiplikation (int tal1, int tal2)
    {
        double product = (double)tal1* tal2;
        return product;
    }
}
