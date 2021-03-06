package com.a.eye.skywalking.collector.worker.noderef;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * @author pengys5
 */
public class NodeRefResSumIndexTestCase {

    @Test
    public void test() {
        NodeRefResSumIndex index = new NodeRefResSumIndex();
        Assert.assertEquals("node_ref_res_sum_idx", index.index());
        Assert.assertEquals(false, index.isRecord());
    }

    @Test
    public void testBuilder() throws IOException {
        NodeRefResSumIndex index = new NodeRefResSumIndex();
        Assert.assertEquals("{\"properties\":{\"oneSecondLess\":{\"type\":\"long\",\"index\":\"not_analyzed\"},\"threeSecondLess\":{\"type\":\"long\",\"index\":\"not_analyzed\"},\"fiveSecondLess\":{\"type\":\"long\",\"index\":\"not_analyzed\"},\"fiveSecondGreater\":{\"type\":\"long\",\"index\":\"not_analyzed\"},\"error\":{\"type\":\"long\",\"index\":\"not_analyzed\"},\"summary\":{\"type\":\"long\",\"index\":\"not_analyzed\"},\"aggId\":{\"type\":\"string\",\"index\":\"not_analyzed\"},\"timeSlice\":{\"type\":\"long\",\"index\":\"not_analyzed\"}}}", index.createMappingBuilder().string());
    }
}
