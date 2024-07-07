package com.akash.authservice.services;

import com.akash.authservice.dtos.ClientRegistrationRequestDto;
import com.akash.authservice.dtos.ClientRegistrationResponseDto;
import com.akash.authservice.security.models.Client;

public interface IClientService {
    public ClientRegistrationResponseDto registerClient(ClientRegistrationRequestDto client) throws Exception;
    public Client getClientByName(String clientName);
}
