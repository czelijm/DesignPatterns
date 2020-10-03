package designpatterns.behavioral.mediator;

public class DialogBox {
    private TextBox userName = new TextBox();
    private TextBox password = new TextBox();
    private CheckBox agreeTerms = new CheckBox();
    private Button signUp = new Button();

    public DialogBox() {
        userName.addObserver(this::setButtonAccess);
        password.addObserver(this::setButtonAccess);
        agreeTerms.addObserver(this::setButtonAccess);
    }

    private void setButtonAccess(){
        boolean isReady = !userName.isEmpty() && !password.isEmpty() && agreeTerms.isChecked();
        signUp.setEnabled(isReady);
    }

    public void userActionSimulation()
    {
        System.out.println(signUp.isEnabled());
        userName.setContent("MMM");
        System.out.println(signUp.isEnabled());
        password.setContent("nnn");
        System.out.println(signUp.isEnabled());
        agreeTerms.setChecked(true);
        System.out.println(signUp.isEnabled());
    }

}
