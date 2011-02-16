/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the KaleoTimerInstanceToken service. Represents a row in the &quot;KaleoTimerInstanceToken&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerInstanceTokenModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerInstanceTokenImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTimerInstanceToken
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerInstanceTokenImpl
 * @see com.liferay.portal.workflow.kaleo.model.impl.KaleoTimerInstanceTokenModelImpl
 * @generated
 */
public interface KaleoTimerInstanceTokenModel extends BaseModel<KaleoTimerInstanceToken> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a kaleo timer instance token model instance should use the {@link KaleoTimerInstanceToken} interface instead.
	 */

	/**
	 * Gets the primary key of this kaleo timer instance token.
	 *
	 * @return the primary key of this kaleo timer instance token
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this kaleo timer instance token
	 *
	 * @param pk the primary key of this kaleo timer instance token
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the kaleo timer instance token ID of this kaleo timer instance token.
	 *
	 * @return the kaleo timer instance token ID of this kaleo timer instance token
	 */
	public long getKaleoTimerInstanceTokenId();

	/**
	 * Sets the kaleo timer instance token ID of this kaleo timer instance token.
	 *
	 * @param kaleoTimerInstanceTokenId the kaleo timer instance token ID of this kaleo timer instance token
	 */
	public void setKaleoTimerInstanceTokenId(long kaleoTimerInstanceTokenId);

	/**
	 * Gets the group ID of this kaleo timer instance token.
	 *
	 * @return the group ID of this kaleo timer instance token
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this kaleo timer instance token.
	 *
	 * @param groupId the group ID of this kaleo timer instance token
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this kaleo timer instance token.
	 *
	 * @return the company ID of this kaleo timer instance token
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this kaleo timer instance token.
	 *
	 * @param companyId the company ID of this kaleo timer instance token
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this kaleo timer instance token.
	 *
	 * @return the user ID of this kaleo timer instance token
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this kaleo timer instance token.
	 *
	 * @param userId the user ID of this kaleo timer instance token
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this kaleo timer instance token.
	 *
	 * @return the user uuid of this kaleo timer instance token
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this kaleo timer instance token.
	 *
	 * @param userUuid the user uuid of this kaleo timer instance token
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this kaleo timer instance token.
	 *
	 * @return the user name of this kaleo timer instance token
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this kaleo timer instance token.
	 *
	 * @param userName the user name of this kaleo timer instance token
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this kaleo timer instance token.
	 *
	 * @return the create date of this kaleo timer instance token
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this kaleo timer instance token.
	 *
	 * @param createDate the create date of this kaleo timer instance token
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this kaleo timer instance token.
	 *
	 * @return the modified date of this kaleo timer instance token
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this kaleo timer instance token.
	 *
	 * @param modifiedDate the modified date of this kaleo timer instance token
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the kaleo definition ID of this kaleo timer instance token.
	 *
	 * @return the kaleo definition ID of this kaleo timer instance token
	 */
	public long getKaleoDefinitionId();

	/**
	 * Sets the kaleo definition ID of this kaleo timer instance token.
	 *
	 * @param kaleoDefinitionId the kaleo definition ID of this kaleo timer instance token
	 */
	public void setKaleoDefinitionId(long kaleoDefinitionId);

	/**
	 * Gets the kaleo instance ID of this kaleo timer instance token.
	 *
	 * @return the kaleo instance ID of this kaleo timer instance token
	 */
	public long getKaleoInstanceId();

	/**
	 * Sets the kaleo instance ID of this kaleo timer instance token.
	 *
	 * @param kaleoInstanceId the kaleo instance ID of this kaleo timer instance token
	 */
	public void setKaleoInstanceId(long kaleoInstanceId);

	/**
	 * Gets the kaleo instance token ID of this kaleo timer instance token.
	 *
	 * @return the kaleo instance token ID of this kaleo timer instance token
	 */
	public long getKaleoInstanceTokenId();

	/**
	 * Sets the kaleo instance token ID of this kaleo timer instance token.
	 *
	 * @param kaleoInstanceTokenId the kaleo instance token ID of this kaleo timer instance token
	 */
	public void setKaleoInstanceTokenId(long kaleoInstanceTokenId);

	/**
	 * Gets the kaleo timer ID of this kaleo timer instance token.
	 *
	 * @return the kaleo timer ID of this kaleo timer instance token
	 */
	public long getKaleoTimerId();

	/**
	 * Sets the kaleo timer ID of this kaleo timer instance token.
	 *
	 * @param kaleoTimerId the kaleo timer ID of this kaleo timer instance token
	 */
	public void setKaleoTimerId(long kaleoTimerId);

	/**
	 * Gets the kaleo timer name of this kaleo timer instance token.
	 *
	 * @return the kaleo timer name of this kaleo timer instance token
	 */
	@AutoEscape
	public String getKaleoTimerName();

	/**
	 * Sets the kaleo timer name of this kaleo timer instance token.
	 *
	 * @param kaleoTimerName the kaleo timer name of this kaleo timer instance token
	 */
	public void setKaleoTimerName(String kaleoTimerName);

	/**
	 * Gets the completion user ID of this kaleo timer instance token.
	 *
	 * @return the completion user ID of this kaleo timer instance token
	 */
	public long getCompletionUserId();

	/**
	 * Sets the completion user ID of this kaleo timer instance token.
	 *
	 * @param completionUserId the completion user ID of this kaleo timer instance token
	 */
	public void setCompletionUserId(long completionUserId);

	/**
	 * Gets the completion user uuid of this kaleo timer instance token.
	 *
	 * @return the completion user uuid of this kaleo timer instance token
	 * @throws SystemException if a system exception occurred
	 */
	public String getCompletionUserUuid() throws SystemException;

	/**
	 * Sets the completion user uuid of this kaleo timer instance token.
	 *
	 * @param completionUserUuid the completion user uuid of this kaleo timer instance token
	 */
	public void setCompletionUserUuid(String completionUserUuid);

	/**
	 * Gets the completed of this kaleo timer instance token.
	 *
	 * @return the completed of this kaleo timer instance token
	 */
	public boolean getCompleted();

	/**
	 * Determines if this kaleo timer instance token is completed.
	 *
	 * @return <code>true</code> if this kaleo timer instance token is completed; <code>false</code> otherwise
	 */
	public boolean isCompleted();

	/**
	 * Sets whether this kaleo timer instance token is completed.
	 *
	 * @param completed the completed of this kaleo timer instance token
	 */
	public void setCompleted(boolean completed);

	/**
	 * Gets the completion date of this kaleo timer instance token.
	 *
	 * @return the completion date of this kaleo timer instance token
	 */
	public Date getCompletionDate();

	/**
	 * Sets the completion date of this kaleo timer instance token.
	 *
	 * @param completionDate the completion date of this kaleo timer instance token
	 */
	public void setCompletionDate(Date completionDate);

	/**
	 * Gets the workflow context of this kaleo timer instance token.
	 *
	 * @return the workflow context of this kaleo timer instance token
	 */
	@AutoEscape
	public String getWorkflowContext();

	/**
	 * Sets the workflow context of this kaleo timer instance token.
	 *
	 * @param workflowContext the workflow context of this kaleo timer instance token
	 */
	public void setWorkflowContext(String workflowContext);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(KaleoTimerInstanceToken kaleoTimerInstanceToken);

	public int hashCode();

	public KaleoTimerInstanceToken toEscapedModel();

	public String toString();

	public String toXmlString();
}