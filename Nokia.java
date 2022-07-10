public class Nokia extends Phone implements PhoneConnection {
    public Nokia(String name,String model){
        super(name,model);
    }
    public void call(){
        System.out.println("I'm calling from "+name +" ,model "+model);
    }
    public void sendSMS(){
        System.out.println("I'm send message from "+name+" ,model "+model);
    }

}
