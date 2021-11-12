class Car{
        int gasoline;
        Car(int g){
                gasoline = g;
        }
}
class HydroidCar extends Car{
        int electric;
        public HydroidCar(int e, int g) {
                super(g);
                electric = e;
        }
}
class HydroidWaterCar extends HydroidCar{
        int water;

        public HydroidWaterCar(int w,int e, int g) {
                super(e, g);
                water = w;
        }
        public void showGauge(){
                System.out.println("잔여 가솔린"+gasoline);
                System.out.println("잔여 전력량"+electric);
                System.out.println("잔여 수량"+water);
        }
}



public class P01 {
        public static void main(String[] args) {
                HydroidWaterCar hwc = new HydroidWaterCar(10,20,30);
                hwc.showGauge();
        }
}
