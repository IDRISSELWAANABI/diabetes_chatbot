/* package com.Teenspirit.Teenspirit.service;

import com.Teenspirit.Teenspirit.model.ChatMessage;
import com.Teenspirit.Teenspirit.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatMessageService {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    public ChatMessage getMessageByUserId(Long userId)
    {
        return chatMessageRepository.findByUserId(userId);
    }

    public List<ChatMessage> getMessagesByRoomId(Long roomId)
    {
        return chatMessageRepository.findByroomId(roomId);
    }

    public String removeMessage(Long id)
    {
        chatMessageRepository.deleteById(id);
        return "removed message of id:" + id;
    }

}
*/