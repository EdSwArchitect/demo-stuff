package com.bscllc.demo.skills.api.util;

import com.bscllc.demo.skills.api.proto.WirePayload;
import com.bscllc.demo.skills.cache.Payload;

public class PayloadMap {

    public static Payload wireToPayload(WirePayload wire) {
        Payload payload = new Payload();

        payload.setBatCharge(wire.getBatCharge());
        payload.setBatCurrent(wire.getBatCurrent());
        payload.setBatVoltage(wire.getBatVoltage());
        payload.setDevice(wire.getDevice());
        payload.setDevHumid(wire.getDevHumid());
        payload.setDevCommsFailures(wire.getDevCommsFailures());
        payload.setDevFreeMemory(wire.getDevFreeMemory());
        payload.setDeviceUrn(wire.getDeviceUrn());
        payload.setDevLastFailure(wire.getDevLastFailure());
        payload.setDevMotion(wire.getDevMotion());
        payload.setDevMotionEvents(wire.getDevMotionEvents());
        payload.setDevNtpCount(wire.getDevNtpCount());
        payload.setDevOneshots(wire.getDevOneshots());
        payload.setDevOneshotSeconds(wire.getDevOneshotSeconds());
        payload.setDevPress(wire.getDevPress());
        payload.setDevReceivedBytes(wire.getDevReceivedBytes());
        payload.setDevRestarts(wire.getDevRestarts());
        payload.setDevTemp(wire.getDevTemp());
        payload.setDevTest(wire.getDevTest());
        payload.setDevTransmittedBytes(wire.getDevTransmittedBytes());
        payload.setDevUptime(wire.getDevUptime());
        payload.setEnvHumid(wire.getEnvHumid());
        payload.setEnvPress(wire.getEnvPress());
        payload.setEnvTemp(wire.getEnvTemp());
        payload.setGateway_lora_snr(wire.getGatewayLoraSnr());
        payload.setGatewayReceived(wire.getGatewayReceived());
        payload.setLnd712u(wire.getLnd712U());
        payload.setLnd7128ec(wire.getLnd7128Ec());
        payload.setLnd7318C(wire.getLnd7318C());
        payload.setLnd7318u(wire.getLnd7318U());
        payload.setLnd78017w(wire.getLnd78017W());
        payload.setLoc_lon(wire.getLocLon());
        payload.setLocAlt(wire.getLocAlt());
        payload.setLocOlc(wire.getLocOlc());
        payload.setOpcC010(wire.getOpcC0100());
        payload.setOpcC0038(wire.getOpcC0038());
        payload.setOpcC0054(wire.getOpcC0054());
        payload.setOpcC0210(wire.getOpcC0210());
        payload.setOpcC0500(wire.getOpcC0500());
        payload.setOpcC1000(wire.getOpcC1000());
        payload.setOpcCsecs(wire.getOpcCsecs());
        payload.setOpcPm010(wire.getOpcPm010());
        payload.setOpcPm025(wire.getOpcPm025());
        payload.setOpcPm100(wire.getOpcPm100());
        payload.setPmsC0030(wire.getPmsC0030());
        payload.setPmsC0050(wire.getPmsC0050());
        payload.setPmsC0100(wire.getPmsC0100());
        payload.setPmsC0250(wire.getPmsC0250());
        payload.setPmsC0500(wire.getPmsC0500());
        payload.setPmsC1000(wire.getPmsC1000());
        payload.setPmsCsecs(wire.getPmsCsecs());
        payload.setPmsPm010(wire.getPmsPm010());
        payload.setPmsPm025(wire.getPmsPm025());
        payload.setPmsPm100(wire.getPmsPm100());
        payload.setServiceHandler(wire.getServiceHandler());
        payload.setServiceMd5(wire.getServiceMd5());
        payload.setServiceTransport(wire.getServiceTransport());
        payload.setServiceUploaded(wire.getServiceUploaded());
        payload.setWhenCaptured(wire.getWhenCaptured());

        return payload;
    }

    public static WirePayload payloadToWire(Payload payload) {
        WirePayload.Builder builder = WirePayload.newBuilder();

        builder.setBatCharge(payload.getBatCharge());
        builder.setBatCurrent(payload.getBatCurrent());
        builder.setBatVoltage(payload.getBatVoltage());
        builder.setDevice(payload.getDevice());
        builder.setDevHumid(payload.getDevHumid());
        builder.setDevCommsFailures(payload.getDevCommsFailures());
        builder.setDevFreeMemory(payload.getDevFreeMemory());
        builder.setDeviceUrn(payload.getDeviceUrn());
        builder.setDevLastFailure(payload.getDevLastFailure());
//        builder.setDevMotion(payload.getDevMotion());
        builder.setDevMotionEvents(payload.getDevMotionEvents());
        builder.setDevNtpCount(payload.getDevNtpCount());
        builder.setDevOneshots(payload.getDevOneshots());
        builder.setDevOneshotSeconds(payload.getDevOneshotSeconds());
        builder.setDevPress(payload.getDevPress());
        builder.setDevReceivedBytes(payload.getDevReceivedBytes());
        builder.setDevRestarts(payload.getDevRestarts());
        builder.setDevTemp(payload.getDevTemp());
//        builder.setDevTest(payload.getDevTest());
        builder.setDevTransmittedBytes(payload.getDevTransmittedBytes());
        builder.setDevUptime(payload.getDevUptime());
        builder.setEnvHumid(payload.getEnvHumid());
        builder.setEnvPress(payload.getEnvPress());
        builder.setEnvTemp(payload.getEnvTemp());
        builder.setGatewayLoraSnr(payload.getGateway_lora_snr());
        builder.setGatewayReceived(payload.getGatewayReceived());
        builder.setLnd712U(payload.getLnd712u());
        builder.setLnd7128Ec(payload.getLnd7128ec());
        builder.setLnd7318C(payload.getLnd7318C());
        builder.setLnd7318U(payload.getLnd7318u());
        builder.setLnd78017W(payload.getLnd78017w());
        builder.setLocLon(payload.getLoc_lon());
        builder.setLocAlt(payload.getLocAlt());
        builder.setLocOlc(payload.getLocOlc());
        builder.setOpcC0100(payload.getOpcC010());
        builder.setOpcC0038(payload.getOpcC0038());
        builder.setOpcC0054(payload.getOpcC0054());
        builder.setOpcC0210(payload.getOpcC0210());
        builder.setOpcC0500(payload.getOpcC0500());
        builder.setOpcC1000(payload.getOpcC1000());
        builder.setOpcCsecs(payload.getOpcCsecs());
        builder.setOpcPm010(payload.getOpcPm010());
        builder.setOpcPm025(payload.getOpcPm025());
        builder.setOpcPm100(payload.getOpcPm100());
        builder.setPmsC0030(payload.getPmsC0030());
        builder.setPmsC0050(payload.getPmsC0050());
//        builder.setPmsC0100(payload.getPmsC0100());
        builder.setPmsC0250(payload.getPmsC0250());
        builder.setPmsC0500(payload.getPmsC0500());
        builder.setPmsC1000(payload.getPmsC1000());
        builder.setPmsCsecs(payload.getPmsCsecs());
        builder.setPmsPm010(payload.getPmsPm010());
        builder.setPmsPm025(payload.getPmsPm025());
        builder.setPmsPm100(payload.getPmsPm100());
        builder.setServiceHandler(payload.getServiceHandler());
        builder.setServiceMd5(payload.getServiceMd5());
        builder.setServiceTransport(payload.getServiceTransport());
        builder.setServiceUploaded(payload.getServiceUploaded());
        builder.setWhenCaptured(payload.getWhenCaptured());

        return builder.build();
    }

}
