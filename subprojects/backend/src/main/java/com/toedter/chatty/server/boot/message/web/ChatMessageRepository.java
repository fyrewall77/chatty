/**
 * Copyright (c) 2016 Kai Toedter
 * All rights reserved.
 * Licensed under MIT License, see http://toedter.mit-license.org/
 */

package com.toedter.chatty.server.boot.message.web;


import com.toedter.chatty.server.boot.message.ChatMessage;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        // excerptProjection = ChatMessageProjection.class,
        collectionResourceRel = "messages",
        path = "messages",
        collectionResourceDescription = @Description("The list of chat messages"),
        itemResourceDescription = @Description("A chat messages"))
public interface ChatMessageRepository extends PagingAndSortingRepository<ChatMessage, Long> {
}
