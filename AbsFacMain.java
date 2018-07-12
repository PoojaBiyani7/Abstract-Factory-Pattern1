public class AbsFacMain {
    public static void main(String[] args) {

        AbstractFactory f1=AbsProducer.getFac("city");

        CityInt t1=f1.getCity("hyderabad");
        t1.city();
        CityInt t2=f1.getCity("banglore");
        t2.city();
        CityInt t3=f1.getCity("chennai");
        t3.city();

        AbstractFactory f2=AbsProducer.getFac("cab");

        CabInt b1=f2.getCab("Micro");
        b1.cabName();
        b1.rate();
        CabInt b2=f2.getCab("Mini");
        b2.cabName();
        b2.rate();
        CabInt b3=f2.getCab("Sedan");
        b3.cabName();
        b3.rate();
        CabInt b4=f2.getCab("Suv");
        b4.cabName();
        b4.rate();
        CabInt b5=f2.getCab("Utoo");
        b5.cabName();
        b5.rate();
        System.out.println("" );
        System.out.println("");

        t1.city();
        b1.cabName();
        b1.rate();
        b2.cabName();
        b2.rate();
        b4.cabName();
        b4.rate();
        b5.cabName();
        b5.rate();

        System.out.println();
        System.out.println();
        t2.city();
        b1.cabName();
        b1.rate();
        b2.cabName();
        b2.rate();
        b3.cabName();
        b3.rate();
        b5.cabName();
        b5.rate();

        System.out.println();
        System.out.println();
        t3.city();
        b1.cabName();
        b1.rate();
        b2.cabName();
        b2.rate();
        b3.cabName();
        b3.rate();
        b4.cabName();
        b4.rate();
        b5.cabName();
        b5.rate();

    }
}
