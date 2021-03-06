package com.gruter.drone.model;

import java.sql.Timestamp;

import com.gruter.drone.service.QueryRunner;

public class QueryTask {
  private String taskId;
  private String userName;
  private String errorMessage;
  private boolean finished;
  private boolean error;
  private String status;
  private Timestamp startTime;
  private Timestamp endTime;
  private String query;
  private String connectionName;
  private String resultPath;
  private boolean saveResult;
  
  private QueryRunner queryRunner;

//  private QueryResult queryResult;
  
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public boolean isFinished() {
    return finished;
  }

  public void setFinished(boolean finished) {
    this.finished = finished;
  }

  public Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(Timestamp startTime) {
    this.startTime = startTime;
  }

  public Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(Timestamp endTime) {
    this.endTime = endTime;
  }

  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public String getConnectionName() {
    return connectionName;
  }

  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }

  public QueryRunner getQueryRunner() {
    return queryRunner;
  }

  public void setQueryRunner(QueryRunner queryRunner) {
    this.queryRunner = queryRunner;
  }

//  public QueryResult getQueryResult() {
//    return queryResult;
//  }
//
//  public void setQueryResult(QueryResult queryResult) {
//    this.queryResult = queryResult;
//  }

  public boolean isError() {
    return error;
  }

  public void setError(boolean error) {
    this.error = error;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
  
  public QueryTaskForView copyQueryTask() {
    QueryTaskForView task = new QueryTaskForView();
    task.setTaskId(taskId);
    task.setUserName(userName);
    task.setErrorMessage(errorMessage);
    task.setFinished(finished);
    task.setError(error);
    task.setStatus(status);
    task.setStartTime(startTime);
    task.setEndTime(endTime);
    task.setQuery(query);
    task.setConnectionName(connectionName);
    task.setResultPath(resultPath);
    task.setSaveResult(saveResult);
    
    return task;
  }

  public String getResultPath() {
    return resultPath;
  }

  public void setResultPath(String resultPath) {
    this.resultPath = resultPath;
  }

  public boolean isSaveResult() {
    return saveResult;
  }

  public void setSaveResult(boolean saveResult) {
    this.saveResult = saveResult;
  }
  
}
