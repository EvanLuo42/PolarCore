package cc.sfclub.events.message;

import cc.sfclub.util.Since;

/**
 * When a group message was modified
 */
@Since("4.0")
public class MessageModifiedEvent extends MessageEvent {
    public MessageModifiedEvent(String userID, String message) {
        super(userID, message);
    }
}
