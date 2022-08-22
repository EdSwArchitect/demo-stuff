package demo.skills.cache;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Satellites {
    @JsonProperty("satellites")
    private MyDevice[] satellites;

    public Satellites() {

    }

    public MyDevice[] getSatellites() {
        return satellites;
    }

    public void setSatellites(MyDevice[] satellites) {
        this.satellites = satellites;
    }
}
