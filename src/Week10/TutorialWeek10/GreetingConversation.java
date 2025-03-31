package Week10.TutorialWeek10;

public class GreetingConversation {
    //Attributes
    private GreetingConversation conversation = null;

    //Constructors
    private GreetingConversation() {

    };

    public GreetingConversation getInstance() {
        if (conversation == null) {
            conversation = new GreetingConversation();
        }

        return conversation;
    }
}
