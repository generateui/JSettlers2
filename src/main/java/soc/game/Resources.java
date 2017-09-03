package soc.game;

import java.util.*;

import static soc.data.Data.ResourceType;

/**
 * Everything resources
 *
 * The resource types are defined in data.proto.
 */
public class Resources {
    /**
     * Represent a hand-held resource by a player he can use to buy pieces on the board.
     */
    public interface Resource {
        ResourceType resourceType();
    }

    public interface ResourceList extends List<Resource> {
        boolean hasType(ResourceType resourceType);
        ResourceList ofType(ResourceType resourceType);
        Iterable<ResourceType> resourceTypes();
        String toSummary();
        boolean hasAtLeast(ResourceList what);
    }
    public interface MutableResourceList extends ResourceList {
        void addList(ResourceList resources);
        boolean remove(Resource resource);
        boolean remove(ResourceType resourceType);
        int remove(ResourceType resourceType, int amount);
        boolean subtract(ResourceList resources);
    }

    /**
     * All supported resource types
     *
     * TODO: move to Scenario as property?
     */
    public static List<ResourceType> allSupportedTypes = new ArrayList<ResourceType>() {{
        add(ResourceType.CLAY);
        add(ResourceType.ORE);
        add(ResourceType.SHEEP);
        add(ResourceType.WOOD);
        add(ResourceType.WHEAT);
    }};

    public class Clay implements Resource {
        @Override public ResourceType resourceType() { return ResourceType.CLAY; }
    }
    public class Ore implements Resource {
        @Override public ResourceType resourceType() { return ResourceType.ORE; }
    }
    public class Sheep implements Resource {
        @Override public ResourceType resourceType() { return ResourceType.SHEEP; }
    }
    public class Wood implements Resource {
        @Override public ResourceType resourceType() { return ResourceType.WOOD; }
    }
    public class Wheat implements Resource {
        @Override public ResourceType resourceType() { return ResourceType.WHEAT; }
    }
}
