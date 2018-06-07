/*
 * *** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is part of dcm4che, an implementation of DICOM(TM) in
 * Java(TM), hosted at https://github.com/dcm4che.
 *
 * The Initial Developer of the Original Code is
 * J4Care.
 * Portions created by the Initial Developer are Copyright (C) 2015-2018
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 * See @authors listed below
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * *** END LICENSE BLOCK *****
 */

package org.dcm4chee.arc.diff;

import java.util.Date;
import java.util.List;

/**
 * @author Vrinda Nayak <vrinda.nayak@j4care.com>
 * @since Mar 2018
 */
public class DiffBatch {
    private String batchID;
    private Date[] createdTimeRange = {};
    private Date[] updatedTimeRange = {};
    private Date[] scheduledTimeRange = {};
    private Date[] processingStartTimeRange = {};
    private Date[] processingEndTimeRange = {};
    private String[] deviceNames = {};
    private String[] primaryAETs = {};
    private String[] localAETs = {};
    private String[] secondaryAETs = {};
    private String[] comparefields = {};
    private Boolean[] checkMissing = {};
    private Boolean[] checkDifferent = {};
    private int matches;
    private int missing;
    private int different;
    private long completed;
    private long canceled;
    private long warning;
    private long failed;
    private long scheduled;
    private long inProcess;

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public Date[] getCreatedTimeRange() {
        return createdTimeRange;
    }

    public void setCreatedTimeRange(Date... createdTimeRange) {
        this.createdTimeRange = createdTimeRange;
    }

    public Date[] getUpdatedTimeRange() {
        return updatedTimeRange;
    }

    public void setUpdatedTimeRange(Date... updatedTimeRange) {
        this.updatedTimeRange = updatedTimeRange;
    }

    public Date[] getScheduledTimeRange() {
        return scheduledTimeRange;
    }

    public void setScheduledTimeRange(Date... scheduledTimeRange) {
        this.scheduledTimeRange = scheduledTimeRange;
    }

    public Date[] getProcessingStartTimeRange() {
        return processingStartTimeRange;
    }

    public void setProcessingStartTimeRange(Date minProcessingStartTime, Date maxProcessingStartTime) {
        if (minProcessingStartTime == null && maxProcessingStartTime == null)
            return;

        this.processingStartTimeRange = new Date[2];
        this.processingStartTimeRange[0] = minProcessingStartTime;
        this.processingStartTimeRange[1] = maxProcessingStartTime;
    }

    public Date[] getProcessingEndTimeRange() {
        return processingEndTimeRange;
    }

    public void setProcessingEndTimeRange(Date minProcessingEndTime, Date maxProcessingEndTime) {
        if (minProcessingEndTime == null && maxProcessingEndTime == null)
            return;

        this.processingEndTimeRange = new Date[2];
        this.processingEndTimeRange[0] = minProcessingEndTime;
        this.processingEndTimeRange[1] = maxProcessingEndTime;
    }

    public String[] getDeviceNames() {
        return deviceNames;
    }

    public void setDeviceNames(String[] deviceNames) {
        this.deviceNames = deviceNames;
    }
    public int getCompleted() {
        return (int) completed;
    }

    public void setCompleted(long completed) {
        this.completed = completed;
    }

    public int getCanceled() {
        return (int) canceled;
    }

    public void setCanceled(long canceled) {
        this.canceled = canceled;
    }

    public int getWarning() {
        return (int) warning;
    }

    public void setWarning(long warning) {
        this.warning = warning;
    }

    public int getFailed() {
        return (int) failed;
    }

    public void setFailed(long failed) {
        this.failed = failed;
    }

    public int getScheduled() {
        return (int) scheduled;
    }

    public void setScheduled(long scheduled) {
        this.scheduled = scheduled;
    }

    public int getInProcess() {
        return (int) inProcess;
    }

    public void setInProcess(long inProcess) {
        this.inProcess = inProcess;
    }

    public String[] getPrimaryAETs() {
        return primaryAETs;
    }

    public void setPrimaryAETs(String[] primaryAETs) {
        this.primaryAETs = primaryAETs;
    }

    public String[] getSecondaryAETs() {
        return secondaryAETs;
    }

    public void setSecondaryAETs(String[] secondaryAETs) {
        this.secondaryAETs = secondaryAETs;
    }

    public String[] getComparefields() {
        return comparefields;
    }

    public void setComparefields(String[] comparefields) {
        this.comparefields = comparefields;
    }

    public Boolean[] getCheckMissing() {
        return checkMissing;
    }

    public void setCheckMissing(List<Boolean> checkMissing) {
        this.checkMissing = checkMissing.toArray(new Boolean[checkMissing.size()]);
    }

    public Boolean[] getCheckDifferent() {
        return checkDifferent;
    }

    public void setCheckDifferent(List<Boolean> checkDifferent) {
        this.checkDifferent = checkDifferent.toArray(new Boolean[checkDifferent.size()]);
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getMissing() {
        return missing;
    }

    public void setMissing(int missing) {
        this.missing = missing;
    }

    public int getDifferent() {
        return different;
    }

    public void setDifferent(int different) {
        this.different = different;
    }

    public String[] getLocalAETs() {
        return localAETs;
    }

    public void setLocalAETs(String[] localAETs) {
        this.localAETs = localAETs;
    }
}
