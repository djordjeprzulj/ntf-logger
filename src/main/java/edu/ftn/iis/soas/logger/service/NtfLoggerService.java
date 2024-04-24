package edu.ftn.iis.soas.logger.service;

import edu.ftn.iis.soas.domain.model.Notification;
import edu.ftn.iis.soas.domain.model.NotificationRequest;

public interface NtfLoggerService {
	
	String logRequest(NotificationRequest request);
	String logNotification(Notification notification);

}
