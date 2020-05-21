package MomentoPattern;

/**
 * @author Gayan Samuditha
 * @created 21/05/2020 - 4:33 PM
 *
 *
 * The MomentoDesignPattern class is acting as Caretaker which creates and restores the memento objects.
 */

public class MomentoDesignPattern {
    public static void main(String[] args) {

        WordDocument document = new WordDocument(1, "My Article");
        document.setContent("ABC");

        System.out.println(document);

        WordDocumentMemento memento = document.createMemento();

        document.setContent("XYZ");
        System.out.println(document);

        document.restore(memento);
        System.out.println(document);

    }
}
