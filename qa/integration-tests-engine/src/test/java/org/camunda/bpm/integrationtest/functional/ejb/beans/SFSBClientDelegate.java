package org.camunda.bpm.integrationtest.functional.ejb.beans;

import javax.ejb.EJB;
import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * This is a CDI bean delegating to a SFSB from the same deployment
 * 
 * @author Daniel Meyer
 *
 */
@Named("SFSBClientDelegate")
public class SFSBClientDelegate implements JavaDelegate {
  
  @EJB
  private JavaDelegate bean;

  public void execute(DelegateExecution execution) throws Exception {
    bean.execute(execution);
  }

}
