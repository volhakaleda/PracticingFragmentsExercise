package nyc.c4q.fragmentsinclassanimation;


import android.os.Bundle;

public class CheckingInput {

    private String editTextString;

    public CheckingInput(String string) {
        this.editTextString = string;
    }


    public String getValue() {

        String value = "";
        switch (editTextString) {
            case "string 1":
                value = "success";
                break;
            case "string 2":
                value = "failure";
                break;
            default:
                value = "nothing";
        }
        return value;
    }
}
