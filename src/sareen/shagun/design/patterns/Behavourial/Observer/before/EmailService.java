package sareen.shagun.design.patterns.Behavourial.Observer.before;

public class EmailService {

    public void sendEmail(String to, String body){
        System.out.println("Sending email to : "+ to + " with body :"+ body);
    }
}
