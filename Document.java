package lab9;

import java.util.*;

public class Document {
    String name;
    String date;

    public Document(String name) {
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Document(String name, String date){
        this.name = name;
        this.date = date;
    }

    public String toString() {
        return "File name: " + "" + name + "\nDate: " + date + " ";
    }


    public static class CompareDocumentStandart implements Comparator<Document>{
        @Override
        public int compare(Document o1, Document o2) {
            if (o1.getDate().equals(o2.getDate()))
                return o1.getName().compareTo(o2.getName());
            else return o1.getDate().compareTo(o2.getDate());
        }
    }

    public static class CompareDocumentDate implements Comparator<Document>{
        @Override
        public int compare(Document o1, Document o2) {
                return o1.getDate().compareTo(o2.getDate());
        }
    }

    public static class CompareDocumentName implements Comparator<Document>{
        @Override
        public int compare(Document o1, Document o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    }



}
