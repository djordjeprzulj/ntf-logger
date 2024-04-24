package edu.ftn.iis.soas.logger.service;

import org.springframework.stereotype.Service;

import edu.ftn.iis.soas.domain.model.Notification;
import edu.ftn.iis.soas.domain.model.NotificationRequest;
import edu.ftn.iis.soas.domain.repository.NotificationRequestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class NtfLoggerServiceImpl implements NtfLoggerService {

	private final NotificationRequestRepository notificationRequestRepository;
	
	@Override
	public String logRequest(NotificationRequest request) {
		try {
			notificationRequestRepository.save(request);
			log.info("request logged ok");
			return "OK";
		} catch(Exception ex) {
			log.error(ex.getMessage());
			return ex.getMessage();
		}
	}

	@Override
	public String logNotification(Notification notification) {
		// TODO Auto-generated method stub
		return null;
	}

}
