/*
 * betahouse.us
 * CopyRight (c) 2012 - 2019
 */
package us.betahouse.haetae.model.asset.request;

import us.betahouse.haetae.common.RestRequest;

/**
 * @author yiyuk.hxy
 * @version : AssetRestRequest.java 2019/01/21 13:04 yiyuk.hxy
 */
public class AssetRestRequest extends RestRequest {

    private static final long serialVersionUID = 7577993495265048875L;

    /**
     * 物资id
     */
    private  String assetId;
    /**
     *物资名字
     */
    private String assetName;
    /**
     * 物资备注信息
     */
    private String assetExtInfo;
    /**
     * 物资总数量
     */
    private String assetAmount;
    /**
     * 物资所属组织id
     */
    private String organizationId;
    /**
     * 物资剩余数量
     */
    private String assetRemain;
    /**
     * 物资类别
     */
    private String assetType;

    /**
     * 物资创建者
     */
    private  String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetExtInfo() {
        return assetExtInfo;
    }

    public void setAssetExtInfo(String assetExtInfo) {
        this.assetExtInfo = assetExtInfo;
    }

    public String getAssetAmount() {
        return assetAmount;
    }

    public void setAssetAmount(String assetAmount) {
        this.assetAmount = assetAmount;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getAssetRemain() {
        return assetRemain;
    }

    public void setAssetRemain(String assetRemain) {
        this.assetRemain = assetRemain;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

}