package com.bytatech.ayoos.patientgateway.client.doctor.api;

import org.springframework.cloud.openfeign.FeignClient;
import com.bytatech.ayoos.patientgateway.client.doctor.ClientConfiguration;

@FeignClient(name="${doctor.name:doctor}", url="${doctor.url:35.209.250.234:8083/}", configuration = ClientConfiguration.class)
public interface DoctorSettingsResourceApiClient extends DoctorSettingsResourceApi {
}