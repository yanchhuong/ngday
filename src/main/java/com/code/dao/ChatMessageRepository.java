<<<<<<< HEAD
package com.code.dao;

import java.util.List;

import com.code.model.LiveChatBean;


public interface ChatMessageRepository {
	public List<LiveChatBean> getMessages(int messageIndex);
	public void addMessage(LiveChatBean chatMessage) ;
    
=======
package com.code.dao;

import java.util.List;

import com.code.model.LiveChatBean;


public interface ChatMessageRepository {
	public List<LiveChatBean> getMessages(int messageIndex);
	public void addMessage(LiveChatBean chatMessage) ;
    
>>>>>>> 4c2f064d4805a20514232872b5c5aa58104d0d12
}