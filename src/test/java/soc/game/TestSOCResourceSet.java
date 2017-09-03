package soc.game;

import org.junit.Assert;
import org.junit.Test;
import soc.data.Data;
import soc.data.Data;

public class TestSOCResourceSet {
    @Test
    public void testContains() {
        SOCResourceSet resources = new SOCResourceSet();
        SOCResourceSet developmentCard = new SOCResourceSet(0,1,1,1,0,0);
        resources.add(1, Data.ResourceType.CLAY_VALUE);
        resources.add(1, Data.ResourceType.ORE_VALUE);
        resources.add(1, Data.ResourceType.WHEAT_VALUE);
        resources.add(1, Data.ResourceType.SHEEP_VALUE);
        Assert.assertTrue(resources.contains(Data.ResourceType.CLAY_VALUE));
        Assert.assertTrue(resources.contains(Data.ResourceType.ORE_VALUE));
        Assert.assertTrue(resources.contains(Data.ResourceType.WHEAT_VALUE));
        Assert.assertTrue(resources.contains(Data.ResourceType.SHEEP_VALUE));
        Assert.assertFalse(resources.contains(Data.ResourceType.WOOD_VALUE));
    }
}
