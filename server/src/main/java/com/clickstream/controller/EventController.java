package com.clickstream.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.openapitools.api.ApiUtil;
import org.openapitools.api.EventApi;
import org.openapitools.model.ACK;
import org.openapitools.model.EventRequest;
import org.openapitools.model.EventResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

import javax.annotation.Generated;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-09T15:26:21.145933100+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.clicksteamEventsService.base-path:/api/v3}")
public class EventController implements EventApi {
    private final NativeWebRequest request;
    @Autowired
    public EventController(NativeWebRequest request) {
        this.request = request;
    }
    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }
    public ResponseEntity<ACK> createEvent(
            @Parameter(name = "EventRequest", description = "Create a new Trip in the system", required = true) @Valid @RequestBody EventRequest eventRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"116bd8d3-e5a9-4e1c-86dc-b2a9c17e3fb1\", \"responseMessage\" : \"Update is succesful\", \"responseCode\" : \"CODE-123\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /event/_search : Find events using supported parameters
     * Search events based on multiple filters
     *
     * @param xAuthToken  (optional)
     * @param eventId Unique id to be considered for filter (optional)
     * @param pageURL Page URL that needs to be considered for filter (optional)
     * @return successful operation (status code 200)
     */
    @Override
    public ResponseEntity<List<EventResponse>> searchEvents(
            @Parameter(name = "X-authToken", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-authToken", required = false) String xAuthToken,
            @Parameter(name = "eventId", description = "Unique id to be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "eventId", required = false) String eventId,
            @Parameter(name = "pageURL", description = "Page URL that needs to be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "pageURL", required = false) String pageURL
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"eventRequest\" : { \"elementId\" : \"elementId\", \"pointer\" : \"pointer\", \"elementText\" : \"elementText\", \"pageURL\" : \"pageURL\", \"id\" : \"id\", \"elementClass\" : \"elementClass\", \"type\" : \"type\", \"elementName\" : \"elementName\" } }, { \"eventRequest\" : { \"elementId\" : \"elementId\", \"pointer\" : \"pointer\", \"elementText\" : \"elementText\", \"pageURL\" : \"pageURL\", \"id\" : \"id\", \"elementClass\" : \"elementClass\", \"type\" : \"type\", \"elementName\" : \"elementName\" } } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
