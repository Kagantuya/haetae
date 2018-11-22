/**
 * betahouse.us
 * CopyRight (c) 2012 - 2018
 */
package us.betahouse.haetae.activity.status.activitystatus;

/**
 * 重启状态
 *
 * @author MessiahJK
 * @version : RestoreState.java 2018/11/23 1:33 MessiahJK
 */
public class RestoreState implements ActivityState {
    @Override
    public boolean pass(ActivityStateManager activityStateManager) {
        return false;
    }

    @Override
    public boolean publish(ActivityStateManager activityStateManager) {
        return false;
    }

    @Override
    public boolean finish(ActivityStateManager activityStateManager) {
        activityStateManager.setActivityState(new FinishedState());
        return true;
    }

    @Override
    public boolean republish(ActivityStateManager activityStateManager) {
        return false;
    }

    @Override
    public boolean remove(ActivityStateManager activityStateManager) {
        return false;
    }

    @Override
    public ActivityStateEnum getActivityState() {
        return ActivityStateEnum.RESTORE;
    }
}
