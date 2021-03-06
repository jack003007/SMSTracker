package org.jpereda.sms;

import java.util.List;
import javafx.beans.property.ObjectProperty;

/**
 *
 * @author jpereda
 */
public interface PlatformProvider {

    void sendSMS(String number, String message);

    List<SMSMessage> readSMSs();

    void listenToIncomingSMS();

    ObjectProperty<SMSMessage> messagesProperty();

}
