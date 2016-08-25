package item1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Services {
    private static final Map<String, Provider> providers = new ConcurrentHashMap<>();
    public static final String DEFAULT_PROVIDER = "def";

    public void registerProvider(Provider provider) {
        registerProvider(DEFAULT_PROVIDER, provider);
    }

    public void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    public Service newInstance() {
        return newInstance(DEFAULT_PROVIDER);
    }

    public Service newInstance(String name) {
        Provider provider = providers.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("No provider register with name: " + name);
        }
        return provider.newService();
    }
}
