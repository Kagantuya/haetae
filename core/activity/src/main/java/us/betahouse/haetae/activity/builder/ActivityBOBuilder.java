/**
 * betahouse.us
 * CopyRight (c) 2012 - 2018
 */
package us.betahouse.haetae.activity.builder;

import us.betahouse.haetae.activity.model.ActivityBO;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MessiahJK
 * @version : ActivityBOBuilder.java 2018/11/22 21:34 MessiahJK
 */
public final class ActivityBOBuilder {
    /**
     * 活动id
     */
    private String activityId;

    /**
     * 活动名
     */

    private String activityName;

    /**
     * 活动类型
     */

    private String type;

    /**
     * 单位信息
     */

    private String organizationMessage;

    /**
     * 活动地点
     */
    private String location;

    /**
     * 默认时长
     */
    private Integer defaultTime;

    /**
     * 活动开始时间
     */
    private Date start;

    /**
     * 活动结束时间
     */
    private Date end;

    /**
     * 活动分数
     */
    private Long score;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 活动创建者
     */
    private String userId;

    /**
     * 活动状态
     */
    private String state;

    /**
     * 活动学期
     */
    private String team;

    /**
     * 拓展信息
     */
    private Map<String, String> extInfo = new HashMap<>();


    private ActivityBOBuilder() {
    }

    public static ActivityBOBuilder anActivityBO() {
        return new ActivityBOBuilder();
    }

    public ActivityBOBuilder withActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    public ActivityBOBuilder withActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }

    public ActivityBOBuilder withType(String type) {
        this.type = type;
        return this;
    }

    public ActivityBOBuilder withOrganizationMessage(String organizationMessage) {
        this.organizationMessage = organizationMessage;
        return this;
    }

    public ActivityBOBuilder withLocation(String location) {
        this.location = location;
        return this;
    }

    public ActivityBOBuilder withDefaultTime(Integer defaultTime) {
        this.defaultTime = defaultTime;
        return this;
    }

    public ActivityBOBuilder withStart(Date start) {
        this.start = start;
        return this;
    }

    public ActivityBOBuilder withEnd(Date end) {
        this.end = end;
        return this;
    }

    public ActivityBOBuilder withScore(Long score) {
        this.score = score;
        return this;
    }

    public ActivityBOBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public ActivityBOBuilder withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public ActivityBOBuilder withState(String state) {
        this.state = state;
        return this;
    }

    public ActivityBOBuilder withTeam(String team) {
        this.team = team;
        return this;
    }

    public ActivityBOBuilder withExtInfo(Map<String, String> extInfo) {
        this.extInfo = extInfo;
        return this;
    }

    public ActivityBO build() {
        ActivityBO activityBO = new ActivityBO();
        activityBO.setActivityId(activityId);
        activityBO.setActivityName(activityName);
        activityBO.setType(type);
        activityBO.setOrganizationMessage(organizationMessage);
        activityBO.setLocation(location);
        activityBO.setDefaultTime(defaultTime);
        activityBO.setStart(start);
        activityBO.setEnd(end);
        activityBO.setScore(score);
        activityBO.setDescription(description);
        activityBO.setUserId(userId);
        activityBO.setState(state);
        activityBO.setTeam(team);
        activityBO.setExtInfo(extInfo);
        return activityBO;
    }
}
