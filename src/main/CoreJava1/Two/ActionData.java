package Two;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionData {
    @JsonProperty(value = "cluster_id")
    String clusterId;
    @JsonProperty(value = "cluster_name")
    String clusterName;
    @JsonProperty(value = "user_aliyunidkp")
    String userAliyunIdKP;
    @JsonProperty(value = "oss_access_id")
    String ossAccessId;
    @JsonProperty(value = "oss_access_key")
    String ossAccessKey;
    @JsonProperty(value = "oss_ocm_address")
    String ossOcmAddr;
    @JsonProperty(value = "oss_domain")
    String ossDomain;
    @JsonProperty(value = "oss_local_domain")
    String ossLocalDomain;
    @JsonProperty(value = "oss_snapshot_domain")
    String ossSnapDomain;
    @JsonProperty(value = "app_name")
    String appName;
    @JsonProperty(value = "partition_name")
    String partitionName;
    @JsonProperty(value = "kv_nuwa_address")
    String kvNuwaAddr;
    @JsonProperty(value = "remote_device")
    String remoteDevice;
    @JsonProperty(value = "device_type")
    String deviceType;
    @JsonProperty(value = "device_id")
    String deviceId;
    @JsonProperty(value = "device_size")
    String deviceSize;
    @JsonProperty(value = "device_uuid")
    String deviceUUId;
    @JsonProperty(value = "device_format")
    String deviceFormat;
    @JsonProperty(value = "raf_storage_type")
    String rafStorageType;
    @JsonProperty(value = "min_copy")
    String minCopy;
    @JsonProperty(value = "max_copy")
    String maxCopy;

    public String getRafStorageType() {
        return rafStorageType;
    }

    public void setRafStorageType(String rafStorageType) {
        this.rafStorageType = rafStorageType;
    }

    public String getMaxCopy() {
        return maxCopy;
    }

    public void setMaxCopy(String maxCopy) {
        this.maxCopy = maxCopy;
    }

    public String getOssSnapDomain() {
        return ossSnapDomain;
    }

    public void setOssSnapDomain(String ossSnapDomain) {
        this.ossSnapDomain = ossSnapDomain;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getUserAliyunIdKP() {
        return userAliyunIdKP;
    }

    public void setUserAliyunIdKP(String userAliyunIdKP) {
        this.userAliyunIdKP = userAliyunIdKP;
    }

    public String getOssAccessId() {
        return ossAccessId;
    }

    public void setOssAccessId(String ossAccessId) {
        this.ossAccessId = ossAccessId;
    }

    public String getOssAccessKey() {
        return ossAccessKey;
    }

    public void setOssAccessKey(String ossAccessKey) {
        this.ossAccessKey = ossAccessKey;
    }

    public String getOssOcmAddr() {
        return ossOcmAddr;
    }

    public void setOssOcmAddr(String ossOcmAddr) {
        this.ossOcmAddr = ossOcmAddr;
    }

    public String getOssDomain() {
        return ossDomain;
    }

    public void setOssDomain(String ossDomain) {
        this.ossDomain = ossDomain;
    }

    public String getOssLocalDomain() {
        return ossLocalDomain;
    }

    public void setOssLocalDomain(String ossLocalDomain) {
        this.ossLocalDomain = ossLocalDomain;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPartitionName() {
        return partitionName;
    }

    public void setPartitionName(String partitionName) {
        this.partitionName = partitionName;
    }

    public String getKvNuwaAddr() {
        return kvNuwaAddr;
    }

    public void setKvNuwaAddr(String kvNuwaAddr) {
        this.kvNuwaAddr = kvNuwaAddr;
    }

    public String getRemoteDevice() {
        return remoteDevice;
    }

    public void setRemoteDevice(String remoteDevice) {
        this.remoteDevice = remoteDevice;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceSize() {
        return deviceSize;
    }

    public void setDeviceSize(String deviceSize) {
        this.deviceSize = deviceSize;
    }

    public String getDeviceUUId() {
        return deviceUUId;
    }

    public void setDeviceUUId(String deviceUUId) {
        this.deviceUUId = deviceUUId;
    }

    public String getDeviceFormat() {
        return deviceFormat;
    }

    public void setDeviceFormat(String deviceFormat) {
        this.deviceFormat = deviceFormat;
    }

    public String getMinCopy() {
        return minCopy;
    }

    public void setMinCopy(String minCopy) {
        this.minCopy = minCopy;
    }

    @Override
    public String toString() {
        return "ActionData{" +
                "clusterId='" + clusterId + '\'' +
                ", clusterName='" + clusterName + '\'' +
                ", userAliyunIdKP='" + userAliyunIdKP + '\'' +
                ", ossAccessId='" + ossAccessId + '\'' +
                ", ossAccessKey='" + ossAccessKey + '\'' +
                ", ossOcmAddr='" + ossOcmAddr + '\'' +
                ", ossDomain='" + ossDomain + '\'' +
                ", ossLocalDomain='" + ossLocalDomain + '\'' +
                ", ossSnapDomain='" + ossSnapDomain + '\'' +
                ", appName='" + appName + '\'' +
                ", partitionName='" + partitionName + '\'' +
                ", kvNuwaAddr='" + kvNuwaAddr + '\'' +
                ", remoteDevice='" + remoteDevice + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", deviceSize='" + deviceSize + '\'' +
                ", deviceUUId='" + deviceUUId + '\'' +
                ", deviceFormat='" + deviceFormat + '\'' +
                ", rafStorageType='" + rafStorageType + '\'' +
                ", minCopy='" + minCopy + '\'' +
                ", maxCopy='" + maxCopy + '\'' +
                '}';
    }
}