package nvb.dev.proxy.internet;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

    private final Internet internet = new RealInternet();
    private static final List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String serverHost) {
        if (bannedSites.contains(serverHost.toLowerCase())) System.out.println("Access Denied!");
        internet.connectTo(serverHost);
    }
}
