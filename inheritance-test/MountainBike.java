public class MountainBike extends Bicycle{
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        
        mountainBike.Honk();
    }
}

class Bicycle{
    void Honk(){
        System.out.println("My bicycle is honk2");
    }
}