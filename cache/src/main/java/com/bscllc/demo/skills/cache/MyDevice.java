package com.bscllc.demo.skills.cache;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringJoiner;

public class MyDevice {
    @JsonProperty("version")
    private int version;
    @JsonProperty("payload")
    private Payload payload;

    public MyDevice() {

    }
    public MyDevice readJson(String filePath) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));

        ObjectMapper mapper = new ObjectMapper();

        MyDevice device = mapper.readValue(in, MyDevice.class);

        in.close();

        return device;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Payload getPayload() {
        return payload;
    }

    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyDevice device = (MyDevice) o;

        if (version != device.version) return false;
        return payload.equals(device.payload);
    }

    @Override
    public int hashCode() {
        int result = version;
        result = 31 * result + payload.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MyDevice.class.getSimpleName() + "[", "]")
                .add("version=" + version)
                .add("payload=" + payload)
                .toString();
    }
}
