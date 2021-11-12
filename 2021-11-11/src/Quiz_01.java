class Car1 {
        int gasolineGauge;
        public Car1(int g) {
                gasolineGauge = g;
        }
}
class HybridCar extends Car1 {
        int electricGauge;
        public HybridCar(int g, int h) {
                super(g);
                electricGauge = h;
        }
}
class HybridWaterCar extends HybridCar {
        int waterGauge;
        public HybridWaterCar(int g, int h, int w) {
                super(g, h);
                waterGauge = w;
        }
        public void showCurrentGauge() {
                System.out.println("잔여 가솔린 : " + gasolineGauge);
                System.out.println("잔여 전기량 : " + electricGauge);
                System.out.println("잔여 워터량 : " + waterGauge);
        }
}

public class Quiz_01 {
        public static void main(String[] args) {
                new HybridWaterCar(10, 20, 30).showCurrentGauge();
        }
}
