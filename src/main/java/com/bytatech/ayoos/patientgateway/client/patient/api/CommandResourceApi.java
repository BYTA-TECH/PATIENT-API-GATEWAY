/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.patientgateway.client.patient.api;

import com.bytatech.ayoos.patientgateway.client.patient.model.DMSRecordDTO;
import com.bytatech.ayoos.patientgateway.client.patient.model.MedicalCaseDTO;
import com.bytatech.ayoos.patientgateway.client.patient.model.PatientDTO;
import com.bytatech.ayoos.patientgateway.client.patient.model.RecordDTO;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-10-28T11:07:58.008+05:30[Asia/Kolkata]")

@Api(value = "CommandResource", description = "the CommandResource API")
public interface CommandResourceApi {

    @ApiOperation(value = "createDMSRecord", nickname = "createDMSRecordUsingPOST", notes = "", response = DMSRecordDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DMSRecordDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/dms-records",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<DMSRecordDTO> createDMSRecordUsingPOST(@ApiParam(value = "recordDTO" ,required=true )  @Valid @RequestBody RecordDTO recordDTO);


    @ApiOperation(value = "createMedicalCase", nickname = "createMedicalCaseUsingPOST", notes = "", response = MedicalCaseDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = MedicalCaseDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/medical-cases",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<MedicalCaseDTO> createMedicalCaseUsingPOST(@ApiParam(value = "medicalCaseDTO" ,required=true )  @Valid @RequestBody MedicalCaseDTO medicalCaseDTO);


    @ApiOperation(value = "createPatient", nickname = "createPatientUsingPOST", notes = "", response = PatientDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PatientDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/patients",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PatientDTO> createPatientUsingPOST(@ApiParam(value = "patientDTO" ,required=true )  @Valid @RequestBody PatientDTO patientDTO);


    @ApiOperation(value = "createPatientWithDMS", nickname = "createPatientWithDMSUsingPOST", notes = "", response = PatientDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PatientDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/patients-dms",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<PatientDTO> createPatientWithDMSUsingPOST(@ApiParam(value = "patientDTO" ,required=true )  @Valid @RequestBody PatientDTO patientDTO);


    @ApiOperation(value = "createTicket", nickname = "createTicketUsingGET", notes = "", response = String.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/createTicket/{userId}/{password}",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<String> createTicketUsingGET(@ApiParam(value = "password",required=true) @PathVariable("password") String password,@ApiParam(value = "userId",required=true) @PathVariable("userId") String userId);


    @ApiOperation(value = "test", nickname = "testUsingGET", notes = "", response = String.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = String.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/patients",
        produces = "*/*", 
        method = RequestMethod.GET)
    ResponseEntity<String> testUsingGET();


    @ApiOperation(value = "updatePatient", nickname = "updatePatientUsingPUT", notes = "", response = PatientDTO.class, tags={ "command-resource", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PatientDTO.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/api/commands/patients",
        produces = "*/*", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<PatientDTO> updatePatientUsingPUT(@ApiParam(value = "patientDTO" ,required=true )  @Valid @RequestBody PatientDTO patientDTO);

}
