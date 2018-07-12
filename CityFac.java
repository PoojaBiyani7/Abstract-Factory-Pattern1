public class CityFac extends AbstractFactory {
    @Override
    CityInt getCity(String c1) {
        if(c1.equalsIgnoreCase("hyderabad"))
            return new Hyd();
        else if(c1.equalsIgnoreCase("banglore"))
            return new Bangalore();
        else if(c1.equalsIgnoreCase("Chennai"))
            return new Chennai();
        else
            return null;
    }

    @Override
    CabInt getCab(String c2) {
        return null;
    }
}
