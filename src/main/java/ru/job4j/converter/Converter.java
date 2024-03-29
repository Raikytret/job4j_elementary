package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passed = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float inDollar = 140;
        float expectedDollar = 2.3333333f;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passed2 = expectedDollar == outDollar;
        System.out.println("140 rubles are 2.33. Test result : " + passed2);
    }
}
