package com.example.tacocloudauthorization.repository;

import jakarta.annotation.Nullable;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;

public interface RegisteredClientRepository {

    @Nullable
    RegisteredClient findById(String id);

    @Nullable
    RegisteredClient findByClientId(String clientId);

}
