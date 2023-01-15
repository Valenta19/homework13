public class Main {
    public static void main(String[] args) {
        Author pavel_Sanaev = new Author("Pavel Sanaev");
        Author harper_Lee = new Author("Harper Lee");
        Book toKillAMockingbird = new Book("toKillAMockingbird", pavel_Sanaev, 1961);
        Book buryMeBehindTheBaseboard = new Book("buryMeBehindTheBaseboard", harper_Lee, 1995);
        System.out.println(buryMeBehindTheBaseboard);
        System.out.println(toKillAMockingbird);
        toKillAMockingbird.setYearBooks(1960);
        System.out.println(toKillAMockingbird);
    }
}