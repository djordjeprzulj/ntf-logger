package edu.ftn.iis.soas.logger.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ftn.iis.soas.domain.model.Notification;
import edu.ftn.iis.soas.domain.model.NotificationRequest;
import edu.ftn.iis.soas.logger.service.NtfLoggerService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/logger")
@RequiredArgsConstructor
public class NtfLoggerController {

	private final NtfLoggerService ntfLoggerService;
	
	@PostMapping("/logRequest")
	public String logRequest(@RequestBody NotificationRequest request) {
		return ntfLoggerService.logRequest(request);
	}
	
	@PostMapping("/logNotification")
	public String logNotification(@RequestBody Notification notification) {
		return ntfLoggerService.logNotification(notification);
	}
}
