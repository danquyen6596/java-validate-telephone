package vn.codegym.QuyenLeSy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleTel {
    private static final String TEL_REGEX = "^[(]\\d{2}[)][-][(]\\d{10}[)]$";

    public ExampleTel(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(TEL_REGEX);
        Matcher matcher = pattern.matcher(regex);

        return matcher.matches();
    }
}
