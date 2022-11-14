package Class27_HashMap;

import java.util.LinkedHashMap;

public class MapDemo2_putAll {
    public static void main(String[] args) {

        LinkedHashMap<String,Double> BeautyProducts=new LinkedHashMap<>();
        BeautyProducts.put("Foundation",50.5);
        BeautyProducts.put("Blush",20.0);
        BeautyProducts.put("LipStick", 10.5);

        LinkedHashMap<String,Double>cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.1);
        cosmetics.put("Conditioner",20.5);
        cosmetics.put("Shampoo",30.99);

        LinkedHashMap<String, Double> Supplies=new LinkedHashMap<>();
        Supplies.putAll(BeautyProducts);
        System.out.println(Supplies); // {Foundation=50.5, Blush=20.0, LipStick=10.5}
        Supplies.putAll(cosmetics);
        System.out.println(Supplies); //{Foundation=50.5, Blush=20.0, LipStick=10.5, Soap=10.1, Conditioner=20.5, Shampoo=30.99}
        Supplies.clear();
        System.out.println(Supplies); //{}


    }
}
