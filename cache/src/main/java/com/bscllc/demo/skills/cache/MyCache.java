package com.bscllc.demo.skills.cache;

import java.util.List;
import java.util.Map;

public interface MyCache {
    /**
     * Get the list of payloads for the
     * @param key
     * @return List of payloads
     */
    public List<Payload> getPayloadList(String key);

    public String putPayload(String key, Payload payload);

    public String putPayloads(String key, List<Payload>payloads);

    public Map<String, List<Payload>>getAll();

    public void clear();

    public long getLength();

    public String getCacheInfo();

}
