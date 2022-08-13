public class Droid {
    int batteryLevel = 100;
    String name;

    public Droid(String droidName){
        name = droidName;
    }

    public void performTask(){
        System.out.println(name + "Codey is performing task: dancing");
        batteryLevel-=10;
    }

    public static void main(String[] args){
        Droid myDroid = new Droid("Codey");
        System.out.println(myDroid);
        myDroid.performTask();


    }
}
