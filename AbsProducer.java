public class AbsProducer {
    public static AbstractFactory getFac(String f)
    {
        if(f.equalsIgnoreCase("City"))
            return new CityFac();
        else if(f.equalsIgnoreCase("Cab"))
            return new CabFac();
        else
            return null;
    }
}
