package design.patterns.structural.Decorator;

public class BiryaniHouse {
    public static void main(String[] args) {
        Biryani biryani = new NonVegBiryani();
        System.out.println(biryani.getBiryaniName());
        System.out.println(biryani.getBiryaniPrice());
        biryani = new Lassi(biryani);
        System.out.println("after decorating with lassi");
        System.out.println(biryani.getBiryaniName());
        System.out.println(biryani.getBiryaniPrice());
        biryani = new WaterBottle(biryani);
        biryani = new WaterBottle(biryani);
        System.out.println("after decorating with double water bottle");
        System.out.println(biryani.getBiryaniName());
        System.out.println(biryani.getBiryaniPrice());
    }
}
