import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String guestGreeting() {
        Date now = new Date();
        int hours = now.getHours();
        String dayPeriod;

        if (hours >= 5 && hours < 12) {
            dayPeriod = "morning";
        } else if (hours >= 12 && hours < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }

        return String.format("Good %s. Lovely to see you.", dayPeriod);
    }

    public String dateAnnouncement() {
        Date now = new Date();
        return "It is currently " + now.toString();
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that, I shall retire.";
        }
    }

    // SENSEI BONUS
    public String customAlfredQuote(String input) {
        //Alfred sometimes yells when he's angry.
        return input.toUpperCase() + "!!!";
    }
}
