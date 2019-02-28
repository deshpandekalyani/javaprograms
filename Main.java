public class Main {

        public static boolean isLeapYear(int year){
            return (year%400==0)||(year%100!=0 && year%4==0);

        }
        public static void main(String []args){
            System.out.println(Main.isLeapYear(1700));
    }
    }



