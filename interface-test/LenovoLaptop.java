interface Laptop{
    void Brand();

    void CoolFan();

    void Processor();
}

public class LenovoLaptop implements Laptop{

    public static void main(String[] args) {
        System.out.println("Hellow");
    }

    @Override
    public void Brand() {
        // Print the brand name
        System.out.println("Halo saya brand");

        for (int i = 0; i < 10; i++) {
            if(i == 1)
                break;
        }
    }

    @Override
    public void CoolFan() {
        // Print the behaviour of the fan
        System.out.println("Halo saya fan yang sangat dingin");
    }

    @Override
    public void Processor() {
        // Print the specific of the proccessor
        System.out.println("Processor is Ryzen gen 3");
    }

}