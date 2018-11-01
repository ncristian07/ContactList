package ro.jademy.phonebook;

public class PhoneNumber {
    private String number;
    private String operator;
    private String type;
    private String countryCode;


    public PhoneNumber(String number,String operator, String type) {
        this.number = number;
        this.operator = operator;
        this.type = type;
        this.countryCode = "+40";
    }

    public PhoneNumber(String number, String operator, String type, String countryCode) {
        this.number = number;
        this.operator = operator;
        this.type = type;
        this.countryCode ="00"+countryCode;
    }

    public String getNumber() {
        return number;
    }

    public String getOperator() {
        return operator;
    }

    public String getType() {
        return type;
    }

    public String getCountryCode() {
        return countryCode;
    }
}
