public class CabFac extends AbstractFactory {
    @Override
    CityInt getCity(String city) {
        return null;
    }

    @Override
    CabInt getCab(String cab) {
        if(cab.equalsIgnoreCase("Micro"))
            return new Micro();
        else if(cab.equalsIgnoreCase("Mini"))
            return new Mini();
        else if(cab.equalsIgnoreCase("Sedan"))
            return new Sedan();
        else if(cab.equalsIgnoreCase("Suv"))
            return new Suv();
        else if(cab.equalsIgnoreCase("Utoo"))
            return new Utoo();
        else
        return null;
    }
}
