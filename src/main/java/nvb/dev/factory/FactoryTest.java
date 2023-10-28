package nvb.dev.factory;

public class FactoryTest {
    public static void main(String[] args) {

        Computer pc =
                ComputerFactory.getComputer("pc", "32 GB", "4 TB",
                        "5.0 GHz", ComputerType.PC);

        Computer server = ComputerFactory.getComputer("server", "16 GB",
                "2 TB", "3.2 GHz", ComputerType.SERVER);

        System.out.println("Factory PC Config : " + pc);
        System.out.println("Factory Server Config : " + server);

        System.out.println("---------");

        if (pc != null) {
            System.out.println("PC RAM : " + pc.getRAM());
            System.out.println("PC SSD : " + pc.getSSD());
            System.out.println("PC CPU : " + pc.getCPU());
        }

        System.out.println("---------");

        if (server != null) {
            System.out.println("Server RAM : " + server.getRAM());
            System.out.println("Server SSD : " + server.getSSD());
            System.out.println("Server CPU : " + server.getCPU());
        }

    }
}
