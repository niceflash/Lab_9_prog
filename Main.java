package lab9;


import java.util.*;

public abstract class Main {

    public static void main(String[] args) {

        //Menu test = new Menu();
        //test.menu();

        Document papa = new Document("Papa", "23.02.2003");
        Document aba = new Document("aba", "23.02.2003");
        Document wala = new Document("wala", "23.01.2002");
        List<Document> dc = new ArrayList<>();
        dc.add(papa);
        dc.add(aba);
        dc.add(wala);

        System.out.println(dc);
        System.out.println();

        dc.sort((o1, o2) -> {
            if (o1.getDate().equals(o2.getDate()))
                return o1.getName().compareTo(o2.getName());
            else return o1.getDate().compareTo(o2.getDate());
        });
        System.out.println(dc);
        System.out.println();

        dc.sort(new Document.CompareDocumentStandart().reversed());

        System.out.println(dc);
        System.out.println();


        Comparator<Document> compareByFirstName = Comparator.comparing( Document::getDate );


        Comparator<Document> compareByLastName = Comparator.comparing( Document::getName );


        Comparator<Document> compareByFull = compareByFirstName.thenComparing(compareByLastName);


        dc.sort(compareByFull);

        System.out.println(dc);
        System.out.println();

        dc.add(null);
        dc.add(null);

        System.out.println(dc);
        System.out.println();

        dc.sort(Comparator.nullsFirst(new Document.CompareDocumentStandart()));

        System.out.println(dc);
        System.out.println();
    }
}
