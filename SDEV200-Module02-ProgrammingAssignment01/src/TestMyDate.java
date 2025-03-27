public class TestMyDate {
    public static void main(String[] args){
        MyDate currentDate = new MyDate();
        MyDate specifiedDate = new MyDate(34355555133101L);

        System.out.println("Current Date:");
        System.out.println("Year - " + currentDate.getYear());
        System.out.println("Month - " + currentDate.getMonth());
        System.out.println("Day - " + currentDate.getDay());

        System.out.println();

        System.out.println("Specified Date (34355555133101L):");
        System.out.println("Year - " + specifiedDate.getYear());
        System.out.println("Month - " + specifiedDate.getMonth());
        System.out.println("Day - " + specifiedDate.getDay());
    }
}