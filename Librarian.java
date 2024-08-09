public class Librarian {
    public static void main(String[] args) {
        Student st1;
        LibraryCard card1, card2;
        st1 = new Student();
        st1.setName("Jon Java");
        st1.setEmail("jj@gmail.com");
        card1 = new LibraryCard();
        card1.setOwnerName(st1);
        card1.checKOut(3);
        card2 = new LibraryCard();
        card2.setOwnerName(st1);
        
        System.out.println("Card1 Inof: ");
        System.out.println(card1.toString()+"\n");
        System.out.println("Card2 Inof: ");
        System.out.println(card2.toString()+"\n");
    }
}
