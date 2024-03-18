package sareen.shagun.design.patterns.Behavourial.Observer.before;

public class SMSService {

    public void sendSMS(String to, String text){
        System.out.println("Sending SMS to : "+ to + " with text :"+ text);
    }
}
