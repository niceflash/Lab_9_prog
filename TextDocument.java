package lab9;

import java.util.Objects;

class TextDocument extends Document{
    private int number_of_lines;
    private String comment;

    public TextDocument(String name, String date, int number_of_lines) {
        super(name, date);
        this.number_of_lines = number_of_lines;
    }

    public TextDocument(String name, int number_of_lines, String date) {
        super(name, date);
        this.number_of_lines = number_of_lines;
        this.comment = comment;
    }



    public int getNumber_of_lines() {
        return number_of_lines;
    }

    public void setNumber_of_lines(int number_of_lines) {
        this.number_of_lines = number_of_lines;
    }


    @Override
    public String toString() {
        return super.toString() + " and it have " + number_of_lines + " lines";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        TextDocument that = (TextDocument) o;
        return this.number_of_lines == that.number_of_lines && this.name.equals(that.name);
    }

    static int SecretPlusYour(int number_of_your_lines, int number_of_secret_lines){
        return number_of_secret_lines + number_of_your_lines;
    }

    static int SecretPlusYour(int number_of_your_lines, int number_of_secret_lines, int multiplier){
        return (number_of_secret_lines + number_of_your_lines)*multiplier;
    }

    }


