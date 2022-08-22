package demo.skills.cache;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.StringJoiner;

public class Payload {
    @JsonProperty("loc_alt")
    private long locAlt;
    @JsonProperty("dev_last_failure")
    private String devLastFailure;
    @JsonProperty("opc_c00_54")
    private int opcC0054;
    @JsonProperty("dev_comms_failures")
    private long devCommsFailures;
    @JsonProperty("pms_c00_50")
    private int pmsC0050;
    @JsonProperty("when_captured")
    private String whenCaptured;
    @JsonProperty("loc_lat")
    private double locLat;
    @JsonProperty("loc_olc")
    private String locOlc;
    @JsonProperty("dev_ntp_count")
    private long devNtpCount;
    @JsonProperty("service_uploaded")
    private String serviceUploaded;
    @JsonProperty("lnd_7128ec")
    private int lnd7128ec;
    @JsonProperty("bat_voltage")
    private double batVoltage;
    @JsonProperty("service_handler")
    private String serviceHandler;
    @JsonProperty("device_urn")
    private String deviceUrn;
    @JsonProperty("dev_motion")
    private boolean devMotion;
    @JsonProperty("dev_uptime")
    private long devUptime;
    @JsonProperty("env_humid")
    private double envHumid;
    @JsonProperty("lnd_7318c")
    private int lnd7318C;
    @JsonProperty("pms_pm01_0")
    private int pmsPm010;
    @JsonProperty("dev_temp")
    private double devTemp;
    @JsonProperty("env_press")
    private double envPress;
    @JsonProperty("opc_pm01_0")
    private double opcPm010;
    @JsonProperty("lnd_78017w")
    private int lnd78017w;
    @JsonProperty("dev_oneshots")
    private int devOneshots;
    @JsonProperty("dev_press")
    private double devPress;
    @JsonProperty("opc_csecs")
    private long opcCsecs;
    @JsonProperty("pms_c02_50")
    private long pmsC0250;
    @JsonProperty("device")
    private long device;
    @JsonProperty("pms_csecs")
    private long pmsCsecs;
    @JsonProperty("lnd_7318u")
    private int lnd7318u;
    @JsonProperty("lnd_712u")
    private int lnd712u;
    @JsonProperty("opc_c01_00")
    private int opcC010;
    @JsonProperty("dev_received_bytes")
    private long devReceivedBytes;
    @JsonProperty("pms_c01_00")
    private long pmsC0100;
    @JsonProperty("bat_charge")
    private double batCharge;
    @JsonProperty("pms_c00_30")
    private long pmsC0030;
    @JsonProperty("opc_c00_38")
    private int opcC0038;
    @JsonProperty("pms_pm10_0")
    private long pmsPm100;
    @JsonProperty("opc_pm10_0")
    private int opcPm100;
    @JsonProperty("pms_c05_00")
    private long pmsC0500;
    @JsonProperty("opc_c05_00")
    private int opcC0500;
    @JsonProperty("dev_oneshot_seconds")
    private long devOneshotSeconds;
    @JsonProperty("opc_c02_10")
    private int opcC0210;
    @JsonProperty("dev_humid")
    private double devHumid;
    @JsonProperty("bat_current")
    private double batCurrent;
    @JsonProperty("dev_motion_events")
    private int devMotionEvents;
    @JsonProperty("gateway_received")
    private String gatewayReceived;
    @JsonProperty("opc_c10_00")
    private int opcC1000;
    @JsonProperty("dev_transmitted_bytes")
    private long devTransmittedBytes;
    @JsonProperty("service_md5")
    private String serviceMd5;
    @JsonProperty("service_transport")
    private String serviceTransport;
    @JsonProperty("loc_lon")
    private double loc_lon;
    @JsonProperty("dev_restarts")
    private int devRestarts;
    @JsonProperty("dev_test")
    private boolean devTest;
    @JsonProperty("dev_free_memory")
    private long devFreeMemory;
    @JsonProperty("pms_pm02_5")
    private long pmsPm025;
    @JsonProperty("opc_pm02_5")
    private int opcPm025;
    @JsonProperty("pms_c10_00")
    private long pmsC1000;
    @JsonProperty("env_temp")
    private double envTemp;
    @JsonProperty("gateway_lora_snr")
    private int gateway_lora_snr;

    public long getLocAlt() {
        return locAlt;
    }

    public void setLocAlt(long locAlt) {
        this.locAlt = locAlt;
    }

    public String getDevLastFailure() {
        return devLastFailure;
    }

    public void setDevLastFailure(String devLastFailure) {
        this.devLastFailure = devLastFailure;
    }

    public int getOpcC0054() {
        return opcC0054;
    }

    public void setOpcC0054(int opcC0054) {
        this.opcC0054 = opcC0054;
    }

    public long getDevCommsFailures() {
        return devCommsFailures;
    }

    public void setDevCommsFailures(long devCommsFailures) {
        this.devCommsFailures = devCommsFailures;
    }

    public int getPmsC0050() {
        return pmsC0050;
    }

    public void setPmsC0050(int pmsC0050) {
        this.pmsC0050 = pmsC0050;
    }

    public String getWhenCaptured() {
        return whenCaptured;
    }

    public void setWhenCaptured(String whenCaptured) {
        this.whenCaptured = whenCaptured;
    }

    public double getLocLat() {
        return locLat;
    }

    public void setLocLat(double locLat) {
        this.locLat = locLat;
    }

    public String getLocOlc() {
        return locOlc;
    }

    public void setLocOlc(String locOlc) {
        this.locOlc = locOlc;
    }

    public long getDevNtpCount() {
        return devNtpCount;
    }

    public void setDevNtpCount(long devNtpCount) {
        this.devNtpCount = devNtpCount;
    }

    public String getServiceUploaded() {
        return serviceUploaded;
    }

    public void setServiceUploaded(String serviceUploaded) {
        this.serviceUploaded = serviceUploaded;
    }

    public int getLnd7128ec() {
        return lnd7128ec;
    }

    public void setLnd7128ec(int lnd7128ec) {
        this.lnd7128ec = lnd7128ec;
    }

    public double getBatVoltage() {
        return batVoltage;
    }

    public void setBatVoltage(double batVoltage) {
        this.batVoltage = batVoltage;
    }

    public String getServiceHandler() {
        return serviceHandler;
    }

    public void setServiceHandler(String serviceHandler) {
        this.serviceHandler = serviceHandler;
    }

    public String getDeviceUrn() {
        return deviceUrn;
    }

    public void setDeviceUrn(String deviceUrn) {
        this.deviceUrn = deviceUrn;
    }

    public boolean isDevMotion() {
        return devMotion;
    }

    public void setDevMotion(boolean devMotion) {
        this.devMotion = devMotion;
    }

    public long getDevUptime() {
        return devUptime;
    }

    public void setDevUptime(long devUptime) {
        this.devUptime = devUptime;
    }

    public double getEnvHumid() {
        return envHumid;
    }

    public void setEnvHumid(double envHumid) {
        this.envHumid = envHumid;
    }

    public int getLnd7318C() {
        return lnd7318C;
    }

    public void setLnd7318C(int lnd7318C) {
        this.lnd7318C = lnd7318C;
    }

    public int getPmsPm010() {
        return pmsPm010;
    }

    public void setPmsPm010(int pmsPm010) {
        this.pmsPm010 = pmsPm010;
    }

    public double getDevTemp() {
        return devTemp;
    }

    public void setDevTemp(double devTemp) {
        this.devTemp = devTemp;
    }

    public double getEnvPress() {
        return envPress;
    }

    public void setEnvPress(double envPress) {
        this.envPress = envPress;
    }

    public double getOpcPm010() {
        return opcPm010;
    }

    public void setOpcPm010(double opcPm010) {
        this.opcPm010 = opcPm010;
    }

    public int getLnd78017w() {
        return lnd78017w;
    }

    public void setLnd78017w(int lnd78017w) {
        this.lnd78017w = lnd78017w;
    }

    public int getDevOneshots() {
        return devOneshots;
    }

    public void setDevOneshots(int devOneshots) {
        this.devOneshots = devOneshots;
    }

    public double getDevPress() {
        return devPress;
    }

    public void setDevPress(double devPress) {
        this.devPress = devPress;
    }

    public long getOpcCsecs() {
        return opcCsecs;
    }

    public void setOpcCsecs(long opcCsecs) {
        this.opcCsecs = opcCsecs;
    }

    public long getPmsC0250() {
        return pmsC0250;
    }

    public void setPmsC0250(long pmsC0250) {
        this.pmsC0250 = pmsC0250;
    }

    public long getDevice() {
        return device;
    }

    public void setDevice(long device) {
        this.device = device;
    }

    public long getPmsCsecs() {
        return pmsCsecs;
    }

    public void setPmsCsecs(long pmsCsecs) {
        this.pmsCsecs = pmsCsecs;
    }

    public int getLnd7318u() {
        return lnd7318u;
    }

    public void setLnd7318u(int lnd7318u) {
        this.lnd7318u = lnd7318u;
    }

    public int getLnd712u() {
        return lnd712u;
    }

    public void setLnd712u(int lnd712u) {
        this.lnd712u = lnd712u;
    }

    public int getOpcC010() {
        return opcC010;
    }

    public void setOpcC010(int opcC010) {
        this.opcC010 = opcC010;
    }

    public long getDevReceivedBytes() {
        return devReceivedBytes;
    }

    public void setDevReceivedBytes(long devReceivedBytes) {
        this.devReceivedBytes = devReceivedBytes;
    }

    public long getPmsC0100() {
        return pmsC0100;
    }

    public void setPmsC0100(long pmsC0100) {
        this.pmsC0100 = pmsC0100;
    }

    public double getBatCharge() {
        return batCharge;
    }

    public void setBatCharge(double batCharge) {
        this.batCharge = batCharge;
    }

    public long getPmsC0030() {
        return pmsC0030;
    }

    public void setPmsC0030(long pmsC0030) {
        this.pmsC0030 = pmsC0030;
    }

    public int getOpcC0038() {
        return opcC0038;
    }

    public void setOpcC0038(int opcC0038) {
        this.opcC0038 = opcC0038;
    }

    public long getPmsPm100() {
        return pmsPm100;
    }

    public void setPmsPm100(long pmsPm100) {
        this.pmsPm100 = pmsPm100;
    }

    public int getOpcPm100() {
        return opcPm100;
    }

    public void setOpcPm100(int opcPm100) {
        this.opcPm100 = opcPm100;
    }

    public long getPmsC0500() {
        return pmsC0500;
    }

    public void setPmsC0500(long pmsC0500) {
        this.pmsC0500 = pmsC0500;
    }

    public int getOpcC0500() {
        return opcC0500;
    }

    public void setOpcC0500(int opcC0500) {
        this.opcC0500 = opcC0500;
    }

    public long getDevOneshotSeconds() {
        return devOneshotSeconds;
    }

    public void setDevOneshotSeconds(long devOneshotSeconds) {
        this.devOneshotSeconds = devOneshotSeconds;
    }

    public int getOpcC0210() {
        return opcC0210;
    }

    public void setOpcC0210(int opcC0210) {
        this.opcC0210 = opcC0210;
    }

    public double getDevHumid() {
        return devHumid;
    }

    public void setDevHumid(double devHumid) {
        this.devHumid = devHumid;
    }

    public double getBatCurrent() {
        return batCurrent;
    }

    public void setBatCurrent(double batCurrent) {
        this.batCurrent = batCurrent;
    }

    public int getDevMotionEvents() {
        return devMotionEvents;
    }

    public void setDevMotionEvents(int devMotionEvents) {
        this.devMotionEvents = devMotionEvents;
    }

    public String getGatewayReceived() {
        return gatewayReceived;
    }

    public void setGatewayReceived(String gatewayReceived) {
        this.gatewayReceived = gatewayReceived;
    }

    public int getOpcC1000() {
        return opcC1000;
    }

    public void setOpcC1000(int opcC1000) {
        this.opcC1000 = opcC1000;
    }

    public long getDevTransmittedBytes() {
        return devTransmittedBytes;
    }

    public void setDevTransmittedBytes(long devTransmittedBytes) {
        this.devTransmittedBytes = devTransmittedBytes;
    }

    public String getServiceMd5() {
        return serviceMd5;
    }

    public void setServiceMd5(String serviceMd5) {
        this.serviceMd5 = serviceMd5;
    }

    public String getServiceTransport() {
        return serviceTransport;
    }

    public void setServiceTransport(String serviceTransport) {
        this.serviceTransport = serviceTransport;
    }

    public double getLoc_lon() {
        return loc_lon;
    }

    public void setLoc_lon(double loc_lon) {
        this.loc_lon = loc_lon;
    }

    public int getDevRestarts() {
        return devRestarts;
    }

    public void setDevRestarts(int devRestarts) {
        this.devRestarts = devRestarts;
    }

    public boolean isDevTest() {
        return devTest;
    }

    public void setDevTest(boolean devTest) {
        this.devTest = devTest;
    }

    public long getDevFreeMemory() {
        return devFreeMemory;
    }

    public void setDevFreeMemory(long devFreeMemory) {
        this.devFreeMemory = devFreeMemory;
    }

    public long getPmsPm025() {
        return pmsPm025;
    }

    public void setPmsPm025(long pmsPm025) {
        this.pmsPm025 = pmsPm025;
    }

    public int getOpcPm025() {
        return opcPm025;
    }

    public void setOpcPm025(int opcPm025) {
        this.opcPm025 = opcPm025;
    }

    public long getPmsC1000() {
        return pmsC1000;
    }

    public void setPmsC1000(long pmsC1000) {
        this.pmsC1000 = pmsC1000;
    }

    public double getEnvTemp() {
        return envTemp;
    }

    public void setEnvTemp(double envTemp) {
        this.envTemp = envTemp;
    }

    public int getGateway_lora_snr() {
        return gateway_lora_snr;
    }

    public void setGateway_lora_snr(int gateway_lora_snr) {
        this.gateway_lora_snr = gateway_lora_snr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Payload payload2 = (Payload) o;

        if (locAlt != payload2.locAlt) return false;
        if (opcC0054 != payload2.opcC0054) return false;
        if (devCommsFailures != payload2.devCommsFailures) return false;
        if (pmsC0050 != payload2.pmsC0050) return false;
        if (Double.compare(payload2.locLat, locLat) != 0) return false;
        if (devNtpCount != payload2.devNtpCount) return false;
        if (lnd7128ec != payload2.lnd7128ec) return false;
        if (Double.compare(payload2.batVoltage, batVoltage) != 0) return false;
        if (devMotion != payload2.devMotion) return false;
        if (devUptime != payload2.devUptime) return false;
        if (Double.compare(payload2.envHumid, envHumid) != 0) return false;
        if (lnd7318C != payload2.lnd7318C) return false;
        if (pmsPm010 != payload2.pmsPm010) return false;
        if (Double.compare(payload2.devTemp, devTemp) != 0) return false;
        if (Double.compare(payload2.envPress, envPress) != 0) return false;
        if (Double.compare(payload2.opcPm010, opcPm010) != 0) return false;
        if (lnd78017w != payload2.lnd78017w) return false;
        if (devOneshots != payload2.devOneshots) return false;
        if (Double.compare(payload2.devPress, devPress) != 0) return false;
        if (opcCsecs != payload2.opcCsecs) return false;
        if (pmsC0250 != payload2.pmsC0250) return false;
        if (device != payload2.device) return false;
        if (pmsCsecs != payload2.pmsCsecs) return false;
        if (lnd7318u != payload2.lnd7318u) return false;
        if (lnd712u != payload2.lnd712u) return false;
        if (opcC010 != payload2.opcC010) return false;
        if (devReceivedBytes != payload2.devReceivedBytes) return false;
        if (pmsC0100 != payload2.pmsC0100) return false;
        if (Double.compare(payload2.batCharge, batCharge) != 0) return false;
        if (pmsC0030 != payload2.pmsC0030) return false;
        if (opcC0038 != payload2.opcC0038) return false;
        if (pmsPm100 != payload2.pmsPm100) return false;
        if (opcPm100 != payload2.opcPm100) return false;
        if (pmsC0500 != payload2.pmsC0500) return false;
        if (opcC0500 != payload2.opcC0500) return false;
        if (devOneshotSeconds != payload2.devOneshotSeconds) return false;
        if (opcC0210 != payload2.opcC0210) return false;
        if (Double.compare(payload2.devHumid, devHumid) != 0) return false;
        if (Double.compare(payload2.batCurrent, batCurrent) != 0) return false;
        if (devMotionEvents != payload2.devMotionEvents) return false;
        if (opcC1000 != payload2.opcC1000) return false;
        if (devTransmittedBytes != payload2.devTransmittedBytes) return false;
        if (Double.compare(payload2.loc_lon, loc_lon) != 0) return false;
        if (devRestarts != payload2.devRestarts) return false;
        if (devTest != payload2.devTest) return false;
        if (devFreeMemory != payload2.devFreeMemory) return false;
        if (pmsPm025 != payload2.pmsPm025) return false;
        if (opcPm025 != payload2.opcPm025) return false;
        if (pmsC1000 != payload2.pmsC1000) return false;
        if (Double.compare(payload2.envTemp, envTemp) != 0) return false;
        if (gateway_lora_snr != payload2.gateway_lora_snr) return false;
        if (!Objects.equals(devLastFailure, payload2.devLastFailure))
            return false;
        if (!Objects.equals(whenCaptured, payload2.whenCaptured))
            return false;
        if (!Objects.equals(locOlc, payload2.locOlc)) return false;
        if (!Objects.equals(serviceUploaded, payload2.serviceUploaded))
            return false;
        if (!Objects.equals(serviceHandler, payload2.serviceHandler))
            return false;
        if (!Objects.equals(deviceUrn, payload2.deviceUrn)) return false;
        if (!Objects.equals(gatewayReceived, payload2.gatewayReceived))
            return false;
        if (!Objects.equals(serviceMd5, payload2.serviceMd5)) return false;
        return Objects.equals(serviceTransport, payload2.serviceTransport);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (locAlt ^ (locAlt >>> 32));
        result = 31 * result + (devLastFailure != null ? devLastFailure.hashCode() : 0);
        result = 31 * result + opcC0054;
        result = 31 * result + (int) (devCommsFailures ^ (devCommsFailures >>> 32));
        result = 31 * result + pmsC0050;
        result = 31 * result + (whenCaptured != null ? whenCaptured.hashCode() : 0);
        temp = Double.doubleToLongBits(locLat);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (locOlc != null ? locOlc.hashCode() : 0);
        result = 31 * result + (int) (devNtpCount ^ (devNtpCount >>> 32));
        result = 31 * result + (serviceUploaded != null ? serviceUploaded.hashCode() : 0);
        result = 31 * result + lnd7128ec;
        temp = Double.doubleToLongBits(batVoltage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (serviceHandler != null ? serviceHandler.hashCode() : 0);
        result = 31 * result + (deviceUrn != null ? deviceUrn.hashCode() : 0);
        result = 31 * result + (devMotion ? 1 : 0);
        result = 31 * result + (int) (devUptime ^ (devUptime >>> 32));
        temp = Double.doubleToLongBits(envHumid);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + lnd7318C;
        result = 31 * result + pmsPm010;
        temp = Double.doubleToLongBits(devTemp);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(envPress);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(opcPm010);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + lnd78017w;
        result = 31 * result + devOneshots;
        temp = Double.doubleToLongBits(devPress);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (opcCsecs ^ (opcCsecs >>> 32));
        result = 31 * result + (int) (pmsC0250 ^ (pmsC0250 >>> 32));
        result = 31 * result + (int) (device ^ (device >>> 32));
        result = 31 * result + (int) (pmsCsecs ^ (pmsCsecs >>> 32));
        result = 31 * result + lnd7318u;
        result = 31 * result + lnd712u;
        result = 31 * result + opcC010;
        result = 31 * result + (int) (devReceivedBytes ^ (devReceivedBytes >>> 32));
        result = 31 * result + (int) (pmsC0100 ^ (pmsC0100 >>> 32));
        temp = Double.doubleToLongBits(batCharge);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (pmsC0030 ^ (pmsC0030 >>> 32));
        result = 31 * result + opcC0038;
        result = 31 * result + (int) (pmsPm100 ^ (pmsPm100 >>> 32));
        result = 31 * result + opcPm100;
        result = 31 * result + (int) (pmsC0500 ^ (pmsC0500 >>> 32));
        result = 31 * result + opcC0500;
        result = 31 * result + (int) (devOneshotSeconds ^ (devOneshotSeconds >>> 32));
        result = 31 * result + opcC0210;
        temp = Double.doubleToLongBits(devHumid);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(batCurrent);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + devMotionEvents;
        result = 31 * result + (gatewayReceived != null ? gatewayReceived.hashCode() : 0);
        result = 31 * result + opcC1000;
        result = 31 * result + (int) (devTransmittedBytes ^ (devTransmittedBytes >>> 32));
        result = 31 * result + (serviceMd5 != null ? serviceMd5.hashCode() : 0);
        result = 31 * result + (serviceTransport != null ? serviceTransport.hashCode() : 0);
        temp = Double.doubleToLongBits(loc_lon);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + devRestarts;
        result = 31 * result + (devTest ? 1 : 0);
        result = 31 * result + (int) (devFreeMemory ^ (devFreeMemory >>> 32));
        result = 31 * result + (int) (pmsPm025 ^ (pmsPm025 >>> 32));
        result = 31 * result + opcPm025;
        result = 31 * result + (int) (pmsC1000 ^ (pmsC1000 >>> 32));
        temp = Double.doubleToLongBits(envTemp);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + gateway_lora_snr;
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Payload.class.getSimpleName() + "[", "]")
                .add("locAlt=" + locAlt)
                .add("devLastFailure='" + devLastFailure + "'")
                .add("opcC0054=" + opcC0054)
                .add("devCommsFailures=" + devCommsFailures)
                .add("pmsC0050=" + pmsC0050)
                .add("whenCaptured='" + whenCaptured + "'")
                .add("locLat=" + locLat)
                .add("locOlc='" + locOlc + "'")
                .add("devNtpCount=" + devNtpCount)
                .add("serviceUploaded='" + serviceUploaded + "'")
                .add("lnd7128ec=" + lnd7128ec)
                .add("batVoltage=" + batVoltage)
                .add("serviceHandler='" + serviceHandler + "'")
                .add("deviceUrn='" + deviceUrn + "'")
                .add("devMotion=" + devMotion)
                .add("devUptime=" + devUptime)
                .add("envHumid=" + envHumid)
                .add("lnd7318C=" + lnd7318C)
                .add("pmsPm010=" + pmsPm010)
                .add("devTemp=" + devTemp)
                .add("envPress=" + envPress)
                .add("opcPm010=" + opcPm010)
                .add("lnd78017w=" + lnd78017w)
                .add("devOneshots=" + devOneshots)
                .add("devPress=" + devPress)
                .add("opcCsecs=" + opcCsecs)
                .add("pmsC0250=" + pmsC0250)
                .add("device=" + device)
                .add("pmsCsecs=" + pmsCsecs)
                .add("lnd7318u=" + lnd7318u)
                .add("lnd712u=" + lnd712u)
                .add("opcC010=" + opcC010)
                .add("devReceivedBytes=" + devReceivedBytes)
                .add("pmsC0100=" + pmsC0100)
                .add("batCharge=" + batCharge)
                .add("pmsC0030=" + pmsC0030)
                .add("opcC0038=" + opcC0038)
                .add("pmsPm100=" + pmsPm100)
                .add("opcPm100=" + opcPm100)
                .add("pmsC0500=" + pmsC0500)
                .add("opcC0500=" + opcC0500)
                .add("devOneshotSeconds=" + devOneshotSeconds)
                .add("opcC0210=" + opcC0210)
                .add("devHumid=" + devHumid)
                .add("batCurrent=" + batCurrent)
                .add("devMotionEvents=" + devMotionEvents)
                .add("gatewayReceived='" + gatewayReceived + "'")
                .add("opcC1000=" + opcC1000)
                .add("devTransmittedBytes=" + devTransmittedBytes)
                .add("serviceMd5='" + serviceMd5 + "'")
                .add("serviceTransport='" + serviceTransport + "'")
                .add("loc_lon=" + loc_lon)
                .add("devRestarts=" + devRestarts)
                .add("devTest=" + devTest)
                .add("devFreeMemory=" + devFreeMemory)
                .add("pmsPm025=" + pmsPm025)
                .add("opcPm025=" + opcPm025)
                .add("pmsC1000=" + pmsC1000)
                .add("envTemp=" + envTemp)
                .add("gateway_lora_snr=" + gateway_lora_snr)
                .toString();
    }
}
