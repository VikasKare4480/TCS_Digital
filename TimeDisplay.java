
class Time {

    int hours;
    int minuets;

    Time(int hrs, int min) {

        hours = hrs;
        minuets = min;
    }

    String getTime() {

        return hours + " : " + (minuets < 10?  "0" : "") + minuets;
    }

    public static void main(String[] args) {
        
        Time t = new Time(12, 35);
        // System.out.println(t.getClass());
        System.out.println(t.getTime());
        Time t1 = new Time(10, 5);
        System.out.println(t1.getTime());
    }
}

