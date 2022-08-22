package demo.skills.cache.impl;

import demo.skills.cache.Payload;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class GuavaCacheImplTest {
    static private GuavaCacheImpl theCache;
    @BeforeAll
    public static void setup() {
        theCache = new GuavaCacheImpl();
    }

    @Test
    void getAll() {
        Map<String, List<Payload>> map =  theCache.getAll();
        System.out.format("The size of map: %d\n", map.size());
    }

    @Test
    void getLength() {
        long size =  theCache.getLength();
        System.out.format("The size of map: %d\n", size);

//      pointcast:20009

        List<Payload> payloads = theCache.getPayloadList("pointcast:20009");
        System.out.format("The size of map: %d\n", payloads.size());


    }

    @Test
    void getCacheInfo() {
        long size =  theCache.getLength();
        System.out.format("The size of map: %d\n", size);

//      pointcast:20009

        List<Payload> payloads = theCache.getPayloadList("pointcast:20009");
        size += payloads.size();
        System.out.format("The size of map: %d\n", theCache.getLength());
        payloads = theCache.getPayloadList("safecast:154534971");
        size += payloads.size();
        System.out.format("The size of map: %d\n", theCache.getLength());
        payloads = theCache.getPayloadList("pointcast:10022");
        size += payloads.size();
        System.out.format("The size of map: %d\n", theCache.getLength());
        //ngeigie:40
        payloads = theCache.getPayloadList("ngeigie:40");
        size += payloads.size();
        System.out.format("The size of map: %d\n", theCache.getLength());

        // pointcast:10009
        payloads = theCache.getPayloadList("pointcast:10009");
        size += payloads.size();
        System.out.format("The size of map: %d\n", theCache.getLength());

        System.out.format("Lists total length: %d\n", size);

        System.out.format("Cache stats: %s\n", theCache.getCacheInfo());
    }
}