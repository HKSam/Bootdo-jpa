package com.bootdo_jpa.activiti.service;

import com.bootdo_jpa.activiti.domain.ActivitiDO;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 */
public interface ActTaskService {
	
    List<ActivitiDO> listTodo(ActivitiDO act);

    void complete(String taskId, String procInsId, String comment, String title, Map<String, Object> vars);

    void complete(String taskId, Map<String, Object> vars);

    String startProcess(String procDefKey, String businessTable, Long businessId, String title, Map<String, Object> vars);

    String getFormKey(String procDefId, String taskDefKey);

    InputStream tracePhoto(String processDefinitionId, String executionId);
}
