public class Main {

        public static boolean isLeapYear(int year){
            if (year  <= 0 || year > 9999){
                return false;
            }
            if ( year % 100 != 0  || year  % 400 == 0)
                return  true;

              else  if(year % 4 == 0) return true;
                return false;

        }
        public static void main(String []args){
            System.out.println(Main.isLeapYear(1700));
    }
    }



