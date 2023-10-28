package nvb.dev.factory;

public abstract class ComputerFactory {

    private ComputerFactory() {
    }

    public static Computer getComputer(String type, String ram, String ssd,
                                       String cpu, ComputerType computerType) {

        if ("PC".equalsIgnoreCase(type) && computerType.equals(ComputerType.PC)) {
            return new PC(ram, ssd, cpu);
        } else if ("Server".equalsIgnoreCase(type) && computerType.equals(ComputerType.SERVER)) {
            return new Server(ram, ssd, cpu);
        }
        return null;
    }

}
