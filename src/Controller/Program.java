package Controller;

import Common.Validation;
import Model.Input;
import Repository.IInputRepository;
import Repository.InputRepository;
import View.Menu;

public class Program extends Menu<String> {
    private IInputRepository iInputRepository;
    static String[] menuChoice ={"Check phone number","Check email","Check date","Exit"};
    Input i;

    public Program(){
        super("=========== Validate Program ===========",menuChoice);
        iInputRepository = new InputRepository();
        i = new Input();
    }

    public void execute(int n){
        switch(n){
            case 1:{
                i.setValue(Validation.getString("Enter phone number: "));
                iInputRepository.getPhone(i.getValue());
                break;
            }
            case 2:{
                i.setValue(Validation.getString("Enter email: "));
                iInputRepository.getEmail(i.getValue());
                break;
            }
            case 3:{
                i.setValue(Validation.getString("Enter date: "));
                iInputRepository.getDate(i.getValue());
                break;
            }
        }
    }
}
