package vn.codegym.QuyenLeSy;

public class Main {
    private static ExampleTel exampleTel;

    private static final String[] valiTel = new String[] {"(84)-(0978489648)", "(84)-(0978439648)", "(84)-(0960489648)"};
    private static final String[] invaliTel = new String[] {"(a8)-(09434222222)", "(84)-(09894t222)", "(84)-(09784322)"};

public static void main(String[] args) {
        exampleTel = new ExampleTel();

        for (String tel:valiTel) {
            boolean isVali = exampleTel.validate(tel);
            System.out.println("Telephone is " + tel + " is valid: "+isVali);
        }


        for (String tel:invaliTel) {
            boolean isVali = exampleTel.validate(tel);
            System.out.println("Telephone is " + tel + " is valid: "+isVali);
        }

    }
}
