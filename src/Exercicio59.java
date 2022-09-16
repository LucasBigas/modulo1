public class Exercicio59 {
    public static void main(String[] args) {
        for(int tempc = 10; tempc <=100; tempc += 10){
            float tempf = (tempc * 1.8f) + 32f;
            System.out.println(String.format("Celsius %d - Fahrenheit %.2f", tempc, tempf));
        }
    }
}
