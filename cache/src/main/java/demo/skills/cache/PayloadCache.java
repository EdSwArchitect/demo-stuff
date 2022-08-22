package demo.skills.cache;

import demo.skills.cache.impl.GuavaCacheImpl;

import java.util.List;
import java.util.Map;

public class PayloadCache implements MyCache{
    private MyCache impl;

    public PayloadCache() {
        impl = new GuavaCacheImpl();
    }

    @Override
    public List<Payload> getPayloadList(String key) {
        return impl.getPayloadList(key);
    }

    @Override
    public String putPayload(String key, Payload payload) {
        return impl.putPayload(key, payload);
    }

    @Override
    public String putPayloads(String key, List<Payload> payloads) {
        return impl.putPayloads(key, payloads);
    }

    @Override
    public Map<String, List<Payload>> getAll() {
        return impl.getAll();
    }

    @Override
    public void clear() {
        impl.clear();
    }

    @Override
    public long getLength() {
        return impl.getLength();
    }

    @Override
    public String getCacheInfo() {
        return impl.getCacheInfo();
    }
}
